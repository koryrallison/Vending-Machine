package com.techelevator.view;

import java.math.BigDecimal;

public enum Money {
    ONE_DOLLARS(BigDecimal.valueOf(1.00)),
    TWO_DOLLARS(BigDecimal.valueOf(2.00)),
    FIVE_DOLLARS(BigDecimal.valueOf(5.00)),
    TEN_DOLLARS(BigDecimal.valueOf(10.00));


    private BigDecimal value;

    private Money(BigDecimal value){
        this.value = value;
    }

    public BigDecimal getValue() {
        return value;
    }
}
