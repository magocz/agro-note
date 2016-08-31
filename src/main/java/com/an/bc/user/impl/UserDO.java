package com.an.bc.user.impl;

import com.an.bc.season.impl.SeasonDO;
import com.an.bc.user.repo.UserBE;

public class UserDO {

    private Long id;

    private String userName;

    private String firstName;

    private String lastName;

    private String mail;

    private SeasonDO seasonDO;

    private Boolean enabled;

    public UserDO() {
    }

    public UserDO(UserBE userBE) {
        this.enabled = userBE.getEnabled();
        this.firstName = userBE.getFirstName();
        this.id = userBE.getId();
        this.lastName = userBE.getLastName();
        this.mail = userBE.getMail();
        this.userName = userBE.getUserName();
        this.seasonDO = new SeasonDO(userBE.getSeasonBE());
    }

    public UserDO(Boolean enabled, String firstName, Long id, String lastName, String mail, SeasonDO seasonDO, String userName) {
        this.enabled = enabled;
        this.firstName = firstName;
        this.id = id;
        this.lastName = lastName;
        this.mail = mail;
        this.seasonDO = seasonDO;
        this.userName = userName;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public SeasonDO getSeasonDO() {
        return seasonDO;
    }

    public void setSeasonDO(SeasonDO seasonDO) {
        this.seasonDO = seasonDO;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


}


