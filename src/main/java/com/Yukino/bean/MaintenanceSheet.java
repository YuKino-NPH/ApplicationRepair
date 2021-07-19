package com.Yukino.bean;

public class MaintenanceSheet {
    private Integer mId;

    private Integer cId;

    private Integer sId;

    private Integer rId;

    private String rContext;

    private Customer customer;

    private RepairPersonnel repairPersonnel;

    private CustomerService customerService;

    public MaintenanceSheet(Integer mId, Integer sId, Integer rId) {
        this.mId = mId;
        this.sId = sId;
        this.rId = rId;
    }

    public MaintenanceSheet() {
    }

    public MaintenanceSheet(Integer cId, String rContext) {
        this.cId = cId;
        this.rContext = rContext;
    }

    public MaintenanceSheet(String rContext) {
        this.rContext = rContext;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public RepairPersonnel getRepairPersonnel() {
        return repairPersonnel;
    }

    public void setRepairPersonnel(RepairPersonnel repairPersonnel) {
        this.repairPersonnel = repairPersonnel;
    }

    public CustomerService getCustomerService() {
        return customerService;
    }

    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public String getrContext() {
        return rContext;
    }

    public void setrContext(String rContext) {
        this.rContext = rContext == null ? null : rContext.trim();
    }

    @Override
    public String toString() {
        return "MaintenanceSheet{" +
                "mId=" + mId +
                ", cId=" + cId +
                ", sId=" + sId +
                ", rId=" + rId +
                ", context='" + rContext + '\'' +
                ", customer=" + customer +
                ", repairPersonnel=" + repairPersonnel +
                ", customerService=" + customerService +
                '}';
    }
}