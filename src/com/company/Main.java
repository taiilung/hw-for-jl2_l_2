package com.company;

public class Main {

    public static void main(String[] args) throws LimitException {

        BankAccount bankAccount = new BankAccount();

        bankAccount.deposit(10000);

        while (true) {
            try {
                if (bankAccount.getAmount() > 6000) {
                    System.out.println("Cнятие");
                    bankAccount.withDraw(6000);
                } else {
                    throw new LimitException();
                }
            } catch (LimitException q) {
                bankAccount.withDraw(bankAccount.amount);
                q.printStackTrace();
                break;
            }

        }


    }
}



