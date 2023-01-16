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

    public BankAccount(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
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

    public void showAccount(){
        System.out.println("Account No: " + accountNo);
        System.out.println("Full name: " + fullName);
        System.out.println("Balance: " + balance);
    }

    public void deposit(double amountToDeposit) throws IllegalAccessException {
        if (!isActive){
            throw new IllegalArgumentException("You cannot make a deposit to an inactive account.");
        }

        if (amountToDeposit < 0){
            throw new IllegalArgumentException("Amount to deposit cannot be less than 0");
        } else {

            balance+= amountToDeposit;
        }
    }

    public void withdraw(double amountToWithdraw) throws IllegalAccessException {
        if (!isActive){
            throw new IllegalArgumentException("You cannot make a deposit to an inactive account.");
        }

        if (amountToWithdraw < 0){
            throw new IllegalArgumentException("Amount to withdraw cannot be less than 0");
        } else if (balance<amountToWithdraw) {
            throw new IllegalArgumentException("Withdraw failed. Balance too low. Current balance: "+balance);
        } else {
            balance-= amountToWithdraw;
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNo='" + accountNo + '\'' +
                ", fullName='" + fullName + '\'' +
                ", balance=" + balance +
                ", isActive=" + isActive +
                ", accountStartDate=" + accountStartDate +
                ", accountEndDate=" + accountEndDate +
                '}';
    }
}
