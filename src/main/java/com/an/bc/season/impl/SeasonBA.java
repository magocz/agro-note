package com.an.bc.season.impl;

import com.an.bc.auth.AuthService;
import com.an.bc.season.SeasonBCI;
import com.an.bc.season.repo.SeasonBE;
import com.an.bc.season.repo.SeasonRepo;
import com.an.bc.user.impl.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SeasonBA implements SeasonBCI {

    @Autowired
    private SeasonRepo seasonRepo;

    @Autowired
    private AuthService authService;

    @Override
    public List<SeasonDO> findByUser(Long userId) {
        return seasonRepo.findByUser(userId).stream().map(SeasonDO::new).collect(Collectors.toList());
    }

    @Override
    public void update(SeasonDO seasonDO) {
        Long userId = authService.getLogedUserId();
        if (userId != null) {
            SeasonBE seasonBE = seasonRepo.findByIdAndUser(seasonDO.getId(), userId);
            seasonBE.update(seasonDO);
            seasonRepo.update(seasonBE);
        }
    }

    @Override
    public void save(SeasonDO seasonDO) {
        Long userId = authService.getLogedUserId();
        if (userId != null) {
            SeasonBE seasonBE = seasonRepo.findByIdAndUser(seasonDO.getId(), userId);
            seasonBE.update(seasonDO);
            seasonRepo.save(seasonBE);
        }
    }

    @Override
    public SeasonDO findActiveSeason() {
        UserDO userDO = authService.getLogedUser();
        if (userDO != null && userDO.getActiveSeasonId() != null) {
            SeasonBE seasonBE = seasonRepo.findById(userDO.getActiveSeasonId());
            return seasonBE == null ? null : new SeasonDO(seasonBE);
        }
        return null;
    }

    @Override
    public SeasonDO findById(Long seasonId) {
        Long userId = authService.getLogedUserId();
        if (userId != null) {
            SeasonBE seasonBE = seasonRepo.findByIdAndUser(seasonId, userId);
            return seasonBE == null ? null : new SeasonDO(seasonBE);
        }
        return null;
    }

    @Override
    public List<SeasonDO> findAllUserSeasons() {
        Long userId = authService.getLogedUserId();
        if (userId != null) {
            return seasonRepo.findByUser(userId).stream().map(SeasonDO::new).collect(Collectors.toList());
        }
        return new ArrayList<>();
    }
}
