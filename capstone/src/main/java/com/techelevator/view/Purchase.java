package com.techelevator.view;

import java.math.BigDecimal;

public class Purchase {
    private BigDecimal totalBalance = new BigDecimal("0.00");

    public Purchase(){

    }

    private void addMoney(int moneyIn){
        BigDecimal bdMoneyIn = new BigDecimal(moneyIn).movePointLeft(2);
        if(bdMoneyIn.equals(BigDecimal.valueOf(1.00)) ||
                bdMoneyIn.equals(BigDecimal.valueOf(2.00)) ||
                bdMoneyIn.equals(BigDecimal.valueOf(5.00)) ||
                bdMoneyIn.equals(BigDecimal.valueOf(10.00)))
        {
            this.totalBalance = totalBalance.add(bdMoneyIn);
        }
    }

    public void removeMoney(BigDecimal moneyOut){
        this.totalBalance = totalBalance.subtract(moneyOut);
    }

    public BigDecimal getTotalBalance() {
        return totalBalance;
    }
}
