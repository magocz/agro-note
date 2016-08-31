package com.an.bc.user;

import com.an.bc.user.impl.UserDO;

import javax.ws.rs.core.Response;

public interface UserBCI {

    Long findUserIdByUsername(String username);

    UserDO findByUsername(String username);

    UserDO findLogedUser();

    Response saveUser(String userName, String password, String mail);

    Response updateUser(UserDO userDO);

    Response updateUser(String userName, String password, String newPassword);

    Response updateUser(Long seasonId);
}
