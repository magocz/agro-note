package com.an.rest.user;

import com.an.bc.auth.AuthService;
import com.an.bc.user.UserBCI;
import com.an.bc.user.impl.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@RestController
@RequestMapping("/user")
public class UserRest {

    @Autowired
    private UserBCI userBCI;

    @RequestMapping(method = RequestMethod.GET)
    public UserDO findLogedUser() {
        return userBCI.findLogedUser();
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Response saveUser(@RequestParam String userName, @RequestParam String password, @RequestParam String mail) {
        return userBCI.saveUser(userName, password, mail);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Response updateUser(@RequestBody UserDO userDO) {
        return userBCI.updateUser(userDO);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/password")
    public Response updateUser(@RequestParam String userName, @RequestParam String password, @RequestParam String newPassword) {
        return userBCI.updateUser(userName, password, newPassword);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/season/{seasonId}")
    public Response updateUser(@PathParam("seasonId") Long seasonId) {
        return userBCI.updateUser(seasonId);
    }
}
