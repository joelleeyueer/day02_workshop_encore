package org.nusiss;

public class FixedDepositAccount extends BankAccount{

    public static double interest = 3.0;
    public static double duration = 6.0;

    public FixedDepositAccount(String accountNo, double balance) {
        super(accountNo, balance);
    }

    @Override
    public void deposit(double amountToDeposit) throws IllegalAccessException {
        System.out.println("Access denied. No deposit allowed to Fixed Deposit Account");
    }

    @Override
    public void withdraw(double amountToWithdraw) throws IllegalAccessException {
        System.out.println("Access denied. No withdraw allowed to Fixed Deposit Account");
    }

    @Override
    public void showAccount() {
        System.out.println("Account No: " + this.getAccountNo());
        System.out.println("Full name: " + this.getFullName());
        System.out.println("Original Balance: " + this.getBalance()+ "\nBalance with interest: " + this.getBalance() * (interest+100) / 100);
    }
}
