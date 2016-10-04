package com.an.rest.user;

import com.an.bc.user.UserBCI;
import com.an.bc.user.impl.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@RestController
@RequestMapping("/rest/user")
public class UserRest {

    @Autowired
    private UserBCI userBCI;

    @RequestMapping(method = RequestMethod.GET)
    public UserDO findLogedUser() {
        return userBCI.findLogedUser();
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
    public ResponseEntity saveUser(@RequestBody UserDO user) {
        return userBCI.saveUser(user);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = "application/json")
    public ResponseEntity updateUser(@RequestBody UserDO user) {
        return new ResponseEntity(HttpStatus.MULTI_STATUS);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/password")
    public ResponseEntity updateUser(@RequestParam String userName, @RequestParam String password, @RequestParam String newPassword) {
        return userBCI.updateUser(userName, password, newPassword);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/season/{seasonId}")
    public ResponseEntity updateUser(@PathParam("seasonId") Long seasonId) {
        return userBCI.updateUser(seasonId);
    }
}
