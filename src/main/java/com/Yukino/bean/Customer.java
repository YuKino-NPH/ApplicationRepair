package com.Yukino.bean;

import java.math.BigDecimal;

public class Customer {
    private Integer cId;

    private String cName;

    private BigDecimal cost;

    private String comment;

    private Integer cPasswrod;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public Integer getcPasswrod() {
        return cPasswrod;
    }

    public void setcPasswrod(Integer cPasswrod) {
        this.cPasswrod = cPasswrod;
    }
}