package com.techelevator.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        System.out.println("---------------------------------------");
        Thread.sleep(500);
        System.out.println("Welcome to the Vendo-Matic 800!");
        Thread.sleep(500);
        System.out.println("---------------------------------------");
        Thread.sleep(2000);

        run();


//        VendingMachine vendoMatic800 = new VendingMachine();
//        Menu mainMenu = new Menu();
//        mainMenu.mainMenu();
//        System.out.println("Please make a selection from the following: ");
//        int userChoice = mainMenu.getChoiceFromOptions();
//
//        if(userChoice == 1) {
//            boolean repeat = true;
//            vendoMatic800.displayItems();
//            System.out.print("Press 0 to return to main menu!");
//
//
//            try {
//                while (repeat) {
//                    int returnChoice = sc.nextInt();
//                    if (returnChoice == 0) {
//                        mainMenu.mainMenu();
//                        repeat = false;
//                    } else {
//                        System.out.println("Please enter 0 to return to main menu!");
//                    }
//                }
//            } catch (InputMismatchException e) {
//                System.out.println("You didn't input the correct thing " + e);
//            }
//
//
//        }
//
//        else if(userChoice == 2){
//            mainMenu.purchaseMenu();
//        }

    }

    public static void run(){

        boolean isWrongAnswer;
        do {
            Scanner sc = new Scanner(System.in);
            isWrongAnswer = false;
            Menu main = new Menu();
            main.mainMenu();
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    main.mainMenu();
                case 2:
                    main.purchaseMenu();
                    break;
                case 3:
                    break;
                case 4:
                    main.secretMenu();
                    break;
                default:
                    System.out.println("choose from 1 to 3");
                    isWrongAnswer = true;
            }
        } while (isWrongAnswer);
    }

}
