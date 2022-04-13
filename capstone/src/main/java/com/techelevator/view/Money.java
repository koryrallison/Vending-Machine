package com.techelevator.view;

public enum Money {
    ONE_DOLLARS(1.00),
    TWO_DOLLARS(2.00),
    FIVE_DOLLARS(5.00),
    TEN_DOLLARS(10.00);


    private double value;

    private Money(double value){
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
