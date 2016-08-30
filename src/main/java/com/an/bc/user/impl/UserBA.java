package com.an.bc.user.impl;

import com.an.bc.user.UserBCI;
import com.an.bc.user.repo.UserBE;
import com.an.bc.user.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserBA implements UserBCI {


    @Autowired
    private UserRepo userRepo;

    public UserBE findById(Long id) {
        return userRepo.findById(id);
    }
}
