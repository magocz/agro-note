package com.an.rest.season;

import com.an.bc.season.SeasonBCI;
import com.an.bc.season.impl.SeasonDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import java.util.List;

@RestController
@RequestMapping("/rest/seasons")
public class SeasonRest {

    @Autowired
    private SeasonBCI seasonBCI;

    @RequestMapping(method = RequestMethod.GET, path = "active")
    public SeasonDO findActiveSeason() {
        return seasonBCI.findActiveSeason();
    }

    @RequestMapping(method = RequestMethod.GET, path = "{seasonId}")
    public SeasonDO updateUser(@PathParam("seasonId") Long seasonId) {
        return seasonBCI.findById(seasonId);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<SeasonDO> findAllUserSeasons() {
        return seasonBCI.findAllUserSeasons();
    }
}
