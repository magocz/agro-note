package com.an.bc.season.impl;

import com.an.bc.season.repo.SeasonBE;

public class SeasonDO {

    private Long id;
    private Long userId;
    private String description;
    private Long fieldsNumber;
    private Double cost;
    private Double profit;
    private Long operationsNumber;
    private Double otherSeasonCosts;
    private Double otherSeasonProfit;
    private Double fieldsSize;
    private Double operationsCost;
    private Boolean activeSeason = false;

    public SeasonDO(SeasonBE seasonBE, Long activeSeasonId) {
        this(seasonBE);
        setActiveSeason(activeSeasonId);
    }

    private void setActiveSeason(Long activeSeasonId) {
        if (this.id == activeSeasonId) {
            activeSeason = true;
        }
    }

    public SeasonDO(SeasonBE seasonBE) {
        this.description = seasonBE.getDescription();
        this.fieldsNumber = seasonBE.getFieldsNumber();
        this.id = seasonBE.getId();
        this.userId = seasonBE.getUserId();
        this.cost = seasonBE.getCost();
        this.fieldsSize = seasonBE.getFieldsSize();
        this.operationsCost = seasonBE.getOperationsCost();
        this.operationsNumber = seasonBE.getOperationsNumber();
        this.otherSeasonCosts = seasonBE.getOtherSeasonCosts();
        this.otherSeasonProfit = seasonBE.getOtherSeasonProfit();
        this.profit = seasonBE.getProfit();
    }

    public SeasonDO(Double cost, String description, Long fieldsNumber, Double fieldsSize, Long id, Double operationsCost,
                    Long operationsNumber, Double otherSeasonCosts, Double otherSeasonProfit, Double profit, Long userId) {
        this.cost = cost;
        this.description = description;
        this.fieldsNumber = fieldsNumber;
        this.fieldsSize = fieldsSize;
        this.id = id;
        this.operationsCost = operationsCost;
        this.operationsNumber = operationsNumber;
        this.otherSeasonCosts = otherSeasonCosts;
        this.otherSeasonProfit = otherSeasonProfit;
        this.profit = profit;
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

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getFieldsSize() {
        return fieldsSize;
    }

    public void setFieldsSize(Double fieldsSize) {
        this.fieldsSize = fieldsSize;
    }

    public Double getOperationsCost() {
        return operationsCost;
    }

    public void setOperationsCost(Double operationsCost) {
        this.operationsCost = operationsCost;
    }

    public Long getOperationsNumber() {
        return operationsNumber;
    }

    public void setOperationsNumber(Long operationsNumber) {
        this.operationsNumber = operationsNumber;
    }

    public Double getOtherSeasonCosts() {
        return otherSeasonCosts;
    }

    public void setOtherSeasonCosts(Double otherSeasonCosts) {
        this.otherSeasonCosts = otherSeasonCosts;
    }

    public Double getOtherSeasonProfit() {
        return otherSeasonProfit;
    }

    public void setOtherSeasonProfit(Double otherSeasonProfit) {
        this.otherSeasonProfit = otherSeasonProfit;
    }

    public Double getProfit() {
        return profit;
    }

    public void setProfit(Double profit) {
        this.profit = profit;
    }

    public Boolean getActiveSeason() {
        return activeSeason;
    }

    public void setActiveSeason(Boolean activeSeason) {
        this.activeSeason = activeSeason;
    }
}
