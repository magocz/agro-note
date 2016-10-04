package com.an.bc.user.impl;

import com.an.bc.auth.AuthService;
import com.an.bc.common.enumerations.ErrorMsg;
import com.an.bc.user.UserBCI;
import com.an.bc.user.repo.UserBE;
import com.an.bc.user.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

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
    public ResponseEntity saveUser(UserDO userDO) {
        UserBE userBE = userRepo.findByUsernameAndMail(userDO.getUserName(), userDO.getMail());
        if (userBE == null) {
            userBE = userRepo.saveUser(userDO);
            return new ResponseEntity(HttpStatus.OK);
        } else if (userDO.getUserName().equals(userBE.getUserName())) {
            return new ResponseEntity(ErrorMsg.USERNAME_USED, HttpStatus.CONFLICT);
        } else if (userDO.getMail().equals(userBE.getMail())) {
            return new ResponseEntity(ErrorMsg.MAIL_USED, HttpStatus.CONFLICT);
        }
        return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @Override
    public ResponseEntity updateUser(UserDO userDO) {
        UserBE userBE = userRepo.findByUsernameAndMail(userDO.getUserName(), userDO.getMail());
        if (userBE != null && userBE.getId().equals(userDO.getId())) {
            userBE = userRepo.updateUser(new UserBE(userDO));
            return new ResponseEntity(HttpStatus.OK);
        } else if (userDO.getUserName().equals(userBE.getUserName())) {
            return new ResponseEntity(ErrorMsg.USERNAME_USED, HttpStatus.CONFLICT);
        } else if (userDO.getMail().equals(userBE.getMail())) {
            return new ResponseEntity(ErrorMsg.MAIL_USED, HttpStatus.CONFLICT);
        }
        return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @Override
    public ResponseEntity updateUser(String userName, String password, String newPassword) {
        UserBE userBE = userRepo.findByUsernameAndPassword(userName, password);
        if (userBE != null) {
            userBE.setPassword(newPassword);
            userRepo.updateUser(userBE);
            new ResponseEntity(HttpStatus.CONFLICT);
        }
        return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @Override
    public ResponseEntity updateUser(Long seasonId) {
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
