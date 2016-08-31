package com.an.rest.user;

import com.an.bc.user.UserBCI;
import com.an.bc.user.impl.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserRest {

    @Autowired
    private UserBCI userBCI;

    @RequestMapping(method = RequestMethod.GET)
    public UserDO findAll() {

        return userBCI.findById(1L);
    }
}
