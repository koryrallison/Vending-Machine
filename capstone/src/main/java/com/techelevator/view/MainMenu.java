package com.techelevator.view;

public class MainMenu implements Menu {
    @Override
    public void provideMenu() {
        System.out.println("MAIN MENU");
        System.out.println(">> (1) - Display Vending Machine Items");
        System.out.println(">> (2) - Purchase");
        System.out.println(">> (3) - Exit");
        System.out.println("---------------------------------------");
    }
}
