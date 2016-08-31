package com.an.bc.season.repo;

import com.an.bc.user.repo.UserBE;

import javax.persistence.*;

@Entity(name = SeasonBE.ENTITY_NAME)
@Table(name = "seasons")
public class SeasonBE {

    public static final String ENTITY_NAME = "seasons";


    @Id
    @Column(name = "id")
    private Long id;

    @PrimaryKeyJoinColumn
    @OneToOne
    @JoinColumn(name="user_id")
    private UserBE userBE;

    @Column(name = "description")
    private String description;

    @Column(name = "fields_number")
    private Long fieldsNumber;

    public SeasonBE() {
    }

    public SeasonBE(String description, Long fieldsNumber, Long id, UserBE userBE) {
        this.description = description;
        this.fieldsNumber = fieldsNumber;
        this.id = id;
        this.userBE = userBE;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static String getEntityName() {
        return ENTITY_NAME;
    }

    public Long getFieldsNumber() {
        return fieldsNumber;
    }

    public void setFieldsNumber(Long fieldsNumber) {
        this.fieldsNumber = fieldsNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserBE getUserBE() {
        return userBE;
    }

    public void setUserBE(UserBE userBE) {
        this.userBE = userBE;
    }
}
