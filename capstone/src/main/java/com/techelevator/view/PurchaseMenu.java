package com.techelevator.view;

import java.util.Scanner;

public class PurchaseMenu implements Menu{
    Scanner sc = new Scanner(System.in);
    double moneyTotal = 0;

    @Override
    public void provideMenu() {
        System.out.println("---------------------------------------");
        System.out.println("PURCHASE MENU");
        System.out.println("1: Feed Money");
        System.out.println("2. Select Product");
        System.out.println("3. Finish Transaction");
        System.out.println("---------------------------------------");
        System.out.println("Current Money Provided: " + moneyTotal);
    }

    public void feedMoney(){
        System.out.println("Please enter money in whole dollar amounts.");
        System.out.println("We accept the following: 1.00, 2.00, 5.00, 10.00");
        double moneyInput = sc.nextDouble();
        if(moneyInput == 1.00)

        provideMenu();

    }


}
