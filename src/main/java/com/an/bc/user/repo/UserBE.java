package com.an.bc.user.repo;

import com.an.bc.user.impl.UserDO;
import com.sun.istack.internal.NotNull;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

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
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "username")
    private String userName;

    @NotNull
    @Column(name = "password")
    private String password;

    @NotNull
    @Column(name = "mail")
    private String mail;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "state")
    private String state;

    @Column(name = "country")
    private String country;

    @NotNull
    @Column(name = "enabled")
    private Boolean enabled;

    @Column(name = "active_season")
    private Long activeSeasonId;

    public UserBE() {
    }

    public UserBE(String userName, String password, String mail, String firstName, String lastName, String state, String country, Boolean enabled, Long activeSeasonId) {
        this.userName = userName;
        this.password = password;
        this.mail = mail;
        this.firstName = firstName;
        this.lastName = lastName;
        this.state = state;
        this.country = country;
        this.enabled = enabled;
        this.activeSeasonId = activeSeasonId;
    }

    public UserBE(UserDO userDO) {
        this.id = userDO.getId();
        this.userName = userDO.getUserName();
        this.password = userDO.getPassword();
        this.mail = userDO.getMail();
        this.firstName = userDO.getFirstName();
        this.lastName = userDO.getLastName();
        this.state = userDO.getState();
        this.country = userDO.getCountry();
        this.enabled = userDO.getEnabled();
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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

    public String getHashedPassword() {
        return new BCryptPasswordEncoder().encode(this.password);
    }
}
