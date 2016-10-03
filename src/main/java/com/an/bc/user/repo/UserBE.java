package com.an.bc.user.repo;

import com.an.bc.user.impl.UserDO;

import javax.persistence.*;

@Entity(name = UserBE.ENTITY_NAME)
@Table(name = "users")
@NamedQueries({
        @NamedQuery(name = UserBE.FIND_BY_USERNAME, query = "SELECT u FROM " + UserBE.ENTITY_NAME +
                " u WHERE u.userName = :" + UserBE.USERNAME),
        @NamedQuery(name = UserBE.FIND_BY_USERNAME_AND_MAIL, query = "SELECT u FROM " + UserBE.ENTITY_NAME +
                " u WHERE u.userName = :" + UserBE.USERNAME + " OR u.mail = :" + UserBE.MAIL),
        @NamedQuery(name = UserBE.FIND_BY_USERNAME_AND_PASSWORD, query = "SELECT u FROM " + UserBE.ENTITY_NAME +
                " u WHERE u.userName = :" + UserBE.USERNAME + " AND u.password = :" + UserBE.PASSWORD)
})
public class UserBE {

    public static final String ENTITY_NAME = "users";

    public static final String FIND_BY_USERNAME = "find_by_username";
    public static final String USERNAME = "username";

    public static final String FIND_BY_USERNAME_AND_MAIL = "find_by_username_and_mail";
    public static final String MAIL = "mail";

    public static final String FIND_BY_USERNAME_AND_PASSWORD = "find_by_username_and_password";
    public static final String PASSWORD = "password";

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "username")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "mail")
    private String mail;

    @Column(name = "enabled")
    private Boolean enabled;

    @Column(name = "active_season")
    private Long activeSeasonId;

    public UserBE(Long id, String userName, String password, String firstName, String lastName, String mail, Boolean enabled) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mail = mail;
        this.enabled = enabled;
    }

    public UserBE() {
    }

    public UserBE(String userName, String password, String mail) {
        this.userName = userName;
        this.password = password;
        this.mail = mail;
        this.enabled = true;
    }

    public UserBE(UserDO userDO) {
        this.userName = userDO.getUserName();
        this.firstName = userDO.getFirstName();
        this.lastName = userDO.getSecondName();
        this.mail = userDO.getMail();
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

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Long getActiveSeasonId() {
        return activeSeasonId;
    }

    public void setActiveSeasonId(Long activeSeasonId) {
        this.activeSeasonId = activeSeasonId;
    }
}
