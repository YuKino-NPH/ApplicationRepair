package com.Yukino.bean;

public class RepairPersonnel {
    private Integer rId;

    private String rName;

    private Integer rPhone;

    private Integer rPassword;

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName == null ? null : rName.trim();
    }

    public Integer getrPhone() {
        return rPhone;
    }

    public void setrPhone(Integer rPhone) {
        this.rPhone = rPhone;
    }

    public Integer getrPassword() {
        return rPassword;
    }

    public void setrPassword(Integer rPassword) {
        this.rPassword = rPassword;
    }

    @Override
    public String toString() {
        return "RepairPersonnel{" +
                "rId=" + rId +
                ", rName='" + rName + '\'' +
                ", rPhone=" + rPhone +
                ", rPassword=" + rPassword +
                '}';
    }
}