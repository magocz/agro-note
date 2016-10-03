package com.an.bc.user.impl;

import com.an.bc.auth.AuthService;
import com.an.bc.user.UserBCI;
import com.an.bc.user.repo.UserBE;
import com.an.bc.user.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.core.Response;

@Service
public class UserBA implements UserBCI {


    @Autowired
    private UserRepo userRepo;

    @Autowired
    private AuthService authServicel;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDO findByUsername(String username) {
        UserBE userBE = userRepo.findByUsername(username);
        return userBE == null ? null : new UserDO(userBE);
    }

    @Override
    public Long findUserIdByUsername(String username) {
        return userRepo.findUserIdByUsername(username);
    }

    @Override
    public Response saveUser(String userName, String password, String mail) {
        UserBE userBE = userRepo.findByUsernameAndMail(userName, mail);
        if (userBE == null) {
            userBE = userRepo.saveUser(userName, passwordEncoder.generateHash(password), mail);
            Response.ok(userBE).build();
        } else if (userName.equals(userBE.getUserName())) {
            Response.status(Response.Status.CONFLICT).entity("USERNAME").build();
        } else if (mail.equals(userBE.getMail())) {
            Response.status(Response.Status.CONFLICT).entity("MAIL").build();
        }
        return Response.serverError().build();
    }

    @Override
    public Response updateUser(UserDO userDO) {
        UserBE userBE = userRepo.findByUsernameAndMail(userDO.getUserName(), userDO.getMail());
        if (userBE != null && userBE.getId().equals(userDO.getId())) {
            userBE = userRepo.updateUser(new UserBE(userDO));
            Response.ok().build();
        } else if (userDO.getUserName().equals(userBE.getUserName())) {
            Response.status(Response.Status.CONFLICT).entity("USERNAME").build();
        } else if (userDO.getMail().equals(userBE.getMail())) {
            Response.status(Response.Status.CONFLICT).entity("MAIL").build();
        }
        return Response.serverError().build();
    }

    @Override
    public Response updateUser(String userName, String password, String newPassword) {
        UserBE userBE = userRepo.findByUsernameAndPassword(userName, password);
        if (userBE != null) {
            userBE.setPassword(newPassword);
            userRepo.updateUser(userBE);
            Response.ok().build();
        }
        return Response.status(Response.Status.UNAUTHORIZED).build();
    }

    @Override
    public Response updateUser(Long seasonId) {
        return null;
    }

    @Override
    public UserDO findLogedUser() {
        return findById(authServicel.getLogedUserId());
    }

    private UserDO findById(Long id) {
        UserBE userBE = userRepo.findById(id);
        return userBE == null ? null : new UserDO(userBE);
    }
}
