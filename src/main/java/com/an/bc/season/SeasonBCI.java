package com.an.bc.season;

import com.an.bc.season.impl.SeasonDO;
import com.an.bc.user.impl.UserDO;

import javax.ws.rs.core.Response;
import java.util.List;

public interface SeasonBCI {

    List<SeasonDO> findByUser(Long userId);

    void update(SeasonDO seasonDO);

    void save(SeasonDO seasonDO);

    SeasonDO findActiveSeason();

    SeasonDO findById(Long seasonId);
}
