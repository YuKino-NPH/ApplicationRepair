package com.Yukino.bean;

public class Manager {
    private Integer mId;

    private String mName;

    private Integer mPhone;

    private Integer mPassword;

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName == null ? null : mName.trim();
    }

    public Integer getmPhone() {
        return mPhone;
    }

    public void setmPhone(Integer mPhone) {
        this.mPhone = mPhone;
    }

    public Integer getmPassword() {
        return mPassword;
    }

    public void setmPassword(Integer mPassword) {
        this.mPassword = mPassword;
    }
}