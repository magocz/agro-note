package com.an.web.controller;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {


    @RequestMapping(value = {"/home", "/", ""}, method = RequestMethod.GET)
    public String homePage() {
        return "home";
    }

    @RequestMapping(value = {"/login-error"}, method = RequestMethod.GET)
    public String loginErrorPage() {
        return "login-error";
    }


    @RequestMapping(value = {"/welcome**"}, method = RequestMethod.GET)
    public String welcomePage() {
        return "welcome";

    }
}
