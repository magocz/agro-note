package com.an.bc.auth;

import com.an.bc.user.UserBCI;
import com.an.bc.user.impl.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserBCI userBCI;

    public Long getLogedUserId() {
        UserDetails userDetail = getLogedUserDetails();
        return userDetail == null ? null : userBCI.findUserIdByUsername(userDetail.getUsername());
    }

    public String getLogedUserUsername() {
        UserDetails userDetail = getLogedUserDetails();
        return userDetail == null ? null : userDetail.getUsername();
    }

    public UserDO getLogedUser() {
        UserDetails userDetail = getLogedUserDetails();
        return userDetail == null ? null : userBCI.findByUsername(userDetail.getUsername());
    }

    public boolean isUserLogedIn() {
        return getLogedUserDetails() != null;
    }

    public Long getActiveSeasonId() {
        UserDetails userDetail = getLogedUserDetails();
        return userDetail == null ? null : userBCI.findByUsername(userDetail.getUsername()).getActiveSeasonId();
    }

    private UserDetails getLogedUserDetails() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (!(auth instanceof AnonymousAuthenticationToken)) {
            UserDetails userDetail = (UserDetails) auth.getPrincipal();
            return userDetail;
        }
        return null;
    }


}
