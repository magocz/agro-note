package com.an.bc.season.repo;

import com.an.bc.season.impl.SeasonDO;

import javax.persistence.*;

@Entity(name = SeasonBE.ENTITY_NAME)
@Table(name = "seasons")
@NamedQueries({
        @NamedQuery(name = SeasonBE.FIND_BY_USER_AND_ID, query = "SELECT s FROM " + SeasonBE.ENTITY_NAME +
                " s WHERE s.id = :" + SeasonBE.ID + " AND s.userId = :" + SeasonBE.USER_ID),
        @NamedQuery(name = SeasonBE.FIND_BY_USER, query = "SELECT s FROM " + SeasonBE.ENTITY_NAME +
                " s WHERE s.userId = :" + SeasonBE.USER_ID)
})
public class SeasonBE {

    public static final String ENTITY_NAME = "seasons";

    public static final String FIND_BY_USER_AND_ID = "find_by_user_and_id";
    public static final String ID = "id";
    public static final String USER_ID = "user_id";

    public static final String FIND_BY_USER = "find_by_user";



    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "description")
    private String description;

    @Column(name = "fields_number")
    private Long fieldsNumber;

    @Column(name = "cost")
    private Double cost;

    @Column(name = "profit")
    private Double profit;

    @Column(name = "operations_number")
    private Long operationsNumber;

    @Column(name = "other_season_costs")
    private Double otherSeasonCosts;

    @Column(name = "other_season_profit")
    private Double otherSeasonProfit;

    @Column(name = "fields_size")
    private Double fieldsSize;

    @Column(name = "operations_cost")
    private Double operationsCost;

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

    public void update(SeasonDO seasonDO) {
        this.cost = seasonDO.getCost();
    }
}
