package com.company;

public class BankAccount {
    double amount = 10000;

    public double getAmount() {
            return amount;
    }

    public double deposit(double som) {
       return amount=amount+som;

    }

        public double withDraw(double sum)throws LimitException{
        if(sum > amount ){
            throw new LimitException("Запрашиваемая сумма на снятие больше чем остаток на счете");
        }
        return amount=amount-sum;

    }
}