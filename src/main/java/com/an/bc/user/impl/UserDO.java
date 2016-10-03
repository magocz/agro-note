package com.an.bc.user.impl;

import com.an.bc.user.repo.UserBE;

public class UserDO {

    private Long id;

    private String userName;

    private String firstName;

    private String secondName;

    private String mail;

    private Long activeSeasonId;

    private Boolean enabled;

    public UserDO() {
    }

    public UserDO(UserBE userBE) {
        this.enabled = userBE.getEnabled();
        this.firstName = userBE.getFirstName();
        this.id = userBE.getId();
        this.secondName = userBE.getLastName();
        this.mail = userBE.getMail();
        this.userName = userBE.getUserName();
        this.activeSeasonId = userBE.getActiveSeasonId();
    }

    public UserDO(Boolean enabled, String firstName, Long id, String secondName, String mail, Long activeSeasonId, String userName) {
        this.enabled = enabled;
        this.firstName = firstName;
        this.id = id;
        this.secondName = secondName;
        this.mail = mail;
        this.activeSeasonId = activeSeasonId;
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

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getActiveSeasonId() {
        return activeSeasonId;
    }

    public void setActiveSeasonId(Long activeSeasonId) {
        this.activeSeasonId = activeSeasonId;
    }
}


