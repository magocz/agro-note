package com.an.bc.user;

import com.an.bc.user.impl.UserDO;
import org.springframework.http.ResponseEntity;

import javax.ws.rs.core.Response;

public interface UserBCI {

    Long findUserIdByUsername(String username);

    UserDO findByUsername(String username);

    UserDO findLogedUser();

    ResponseEntity saveUser(UserDO userDO);

    ResponseEntity updateUser(UserDO userDO);

    ResponseEntity updateUser(String userName, String password, String newPassword);

    ResponseEntity updateUser(Long seasonId);
}
