package com.company;

public class LimitException extends Exception {

    private double remainingAmount;



    public LimitException(String s) {
        super(s);
    }
        public LimitException() {
       super("Запрашиваемая сумма больше чем баланс на счете");
   }

    public double getRemaingAmount() {
        return 0;
    }


    public LimitException(String message,double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }
}

