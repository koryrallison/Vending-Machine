package com.techelevator.view;

public class Application {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("---------------------------------------");
        Thread.sleep(500);
        System.out.println("Welcome to the Vendo-Matic 800!");
        Thread.sleep(500);
        System.out.println("---------------------------------------");
        Thread.sleep(2000);

        VendingMachineClass vendoMatic = new VendingMachineClass();
        MainMenu mainMenu = new MainMenu();
        mainMenu.provideMenu();
        int userInput = vendoMatic.getUserInput();

        if(userInput == 1){
            vendoMatic.displayItems();
        }
        else if (userInput == 2){
            PurchaseMenu purchaseMenu = new PurchaseMenu();
            purchaseMenu.provideMenu();
            int pMInput = vendoMatic.getUserInput();
            if(pMInput == 1){
                purchaseMenu.feedMoney();
            }
            Thread.sleep(500);

        }
        else if (userInput == 3) {
            System.out.println("Do this");
        }
        else if (userInput == 4){
            SecretMenu secretMenu = new SecretMenu();
            secretMenu.provideMenu();

        }
        else {
            System.out.println("Hey dummy enter in a number");
        }

    }
}
