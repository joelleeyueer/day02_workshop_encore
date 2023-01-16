package org.nusiss;

import java.util.Date;

public class BankAccount {
    private final String accountNo; //final has no setter, only getter
    private String fullName;
    private double balance = 0.0;
    private boolean isActive = true;
    private Date accountStartDate;
    private Date accountEndDate;

    public BankAccount(String accountNo, String fullName, double balance, boolean isActive, Date accountStartDate, Date accountEndDate) {
        this.accountNo = accountNo;
        this.fullName = fullName;
        this.balance = balance;
        this.isActive = isActive;
        this.accountStartDate = accountStartDate;
        this.accountEndDate = accountEndDate;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void setInactive(boolean active) {
        active = false;
    }

    public Date getAccountStartDate() {
        return accountStartDate;
    }

    public void setAccountStartDate(Date accountStartDate) {
        this.accountStartDate = accountStartDate;
    }

    public Date getAccountEndDate() {
        return accountEndDate;
    }

    public void setAccountEndDate(Date accountEndDate) {
        this.accountEndDate = accountEndDate;
    }
}
