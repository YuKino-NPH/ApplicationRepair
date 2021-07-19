package com.Yukino.bean;

public class CustomerService {
    private Integer sId;

    private String sName;

    private Integer sPassword;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public Integer getsPassword() {
        return sPassword;
    }

    public void setsPassword(Integer sPassword) {
        this.sPassword = sPassword;
    }
}