package org.nusiss;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Random;
import java.util.UUID;

public class App {
    public static void main(String[] args) throws IllegalAccessException {
        System.out.println("Welcome to banking!");

        int n = 3;
        BankAccount bankAccountArray[] = new FixedDepositAccount[n];

        for (int i = 0; i < bankAccountArray.length; i++){
            String uuid = UUID.randomUUID().toString();

            double max = 10000.00;
            double min = 1000.00;

            Random randomizer = new Random();
            double randomInitialBalance = min + randomizer.nextDouble(max);
            BigDecimal twoSF = new BigDecimal(randomInitialBalance);
            twoSF = twoSF.round(new MathContext(4));
            double roundedRIB = twoSF.doubleValue();


            bankAccountArray[i] = new FixedDepositAccount(uuid, roundedRIB);
            bankAccountArray[i].setFullName("minion " + i);

        }

        showAccountAll(bankAccountArray);

        bankAccountArray[0].deposit(2000);
        bankAccountArray[0].deposit(4000);
        bankAccountArray[0].deposit(6000);

        showAccountAll(bankAccountArray);

        bankAccountArray[0].withdraw(2000);
        bankAccountArray[0].withdraw(4000);
        bankAccountArray[0].withdraw(5000);

        showAccountAll(bankAccountArray);



    }
    public static void showAccountAll(BankAccount bankAccount[]) {
        for (int i = 0; i < bankAccount.length; i++) {
            bankAccount[i].showAccount();
            System.out.println();
        }
    }
}