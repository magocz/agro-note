package com.an.rest.user;

import com.an.bc.user.UserBCI;
import com.an.bc.user.repo.UserBE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserRest {

    @Autowired
    private UserBCI userBCI;

    @RequestMapping(method = RequestMethod.GET)
    public UserBE findAll() {
        return userBCI.findById(1L);
    }
}
