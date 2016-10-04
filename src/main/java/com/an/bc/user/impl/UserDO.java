package com.an.bc.user.impl;

import com.an.bc.user.repo.UserBE;

public class UserDO {

    private Long id;

    private String userName;

    private String password;

    private String firstName;

    private String lastName;

    private String mail;

    private String country;

    private String state;

    private Long activeSeasonId;

    private Boolean enabled = true;

    public UserDO() {
    }

    public UserDO(Long id, String userName, String password, String firstName, String lastName, String mail, String country, String state, Long activeSeasonId, Boolean enabled) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mail = mail;
        this.country = country;
        this.state = state;
        this.activeSeasonId = activeSeasonId;
        this.enabled = enabled;
    }

    public UserDO(UserBE userBE) {
        this.id = userBE.getId();
        this.userName = userBE.getUserName();
        this.password = userBE.getPassword();
        this.mail = userBE.getMail();
        this.firstName = userBE.getFirstName();
        this.lastName = userBE.getLastName();
        this.state = userBE.getState();
        this.country = userBE.getCountry();
        this.enabled = userBE.getEnabled();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getActiveSeasonId() {
        return activeSeasonId;
    }

    public void setActiveSeasonId(Long activeSeasonId) {
        this.activeSeasonId = activeSeasonId;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}


