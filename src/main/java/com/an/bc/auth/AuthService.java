package com.an.bc.auth;

import com.an.bc.user.UserBCI;
import com.an.bc.user.impl.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

public class AuthService {

    @Autowired
    private static UserBCI userBCI;

    public static UserDO getLogedUser() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (!(auth instanceof AnonymousAuthenticationToken)) {
            UserDetails userDetail = (UserDetails) auth.getPrincipal();
            return userBCI.findByUsername(userDetail.getUsername());
        }
        return null;
    }

}
