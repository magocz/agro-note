package com.an.bc.season.impl;

import com.an.bc.season.repo.SeasonBE;

public class SeasonDO {

    private Long id;
    private Long userId;
    private String description;
    private Long fieldsNumber;

    public SeasonDO(SeasonBE seasonBE) {
        this.description = seasonBE.getDescription();
        this.fieldsNumber = seasonBE.getFieldsNumber();
        this.id = seasonBE.getId();
        this.userId = seasonBE.getUserBE().getId();
    }

    public SeasonDO(String description, Long fieldsNumber, Long id, Long userId) {
        this.description = description;
        this.fieldsNumber = fieldsNumber;
        this.id = id;
        this.userId = userId;
    }

    public SeasonDO() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
