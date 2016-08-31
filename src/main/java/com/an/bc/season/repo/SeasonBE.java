package com.an.bc.season.repo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = SeasonBE.ENTITY_NAME)
@Table(name = "seasons")
public class SeasonBE {

    public static final String ENTITY_NAME = "seasons";


    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "description")
    private String description;

    @Column(name = "fields_number")
    private Long fieldsNumber;

    public SeasonBE() {
    }

    public SeasonBE(String description, Long fieldsNumber, Long id, Long userId) {
        this.description = description;
        this.fieldsNumber = fieldsNumber;
        this.id = id;
        this.userId = userId;
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
