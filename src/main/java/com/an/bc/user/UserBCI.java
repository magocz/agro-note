package com.an.bc.user;

import com.an.bc.user.repo.UserBE;

public interface UserBCI {
    UserBE findById(Long id);
}
