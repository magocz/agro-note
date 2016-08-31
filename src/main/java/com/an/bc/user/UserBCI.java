package com.an.bc.user;

import com.an.bc.user.impl.UserDO;

public interface UserBCI {
    UserDO findById(Long id);

    UserDO findByUsername(String username);
}
