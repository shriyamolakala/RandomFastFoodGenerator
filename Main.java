package com.company;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String userInput = "";
        System.out.println("\nHello welcome to the random fast food generator!");
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Press any key to start");
        userInput = scanner.nextLine();
        userInput.toLowerCase(Locale.ROOT);
        do {

            System.out.println("Please enter (1) for vegetarian or (2) for non-vegetarian");
            String userDiet = scanner.nextLine();



            userInput.toLowerCase(Locale.ROOT);
            while (true) {
                if (userDiet.equals("2")) {
                    System.out.println("Please enter (1) if you eat beef or pork and (2) if you don't eat beef and pork");
                    String userMeat = scanner.nextLine();
                    int randomNumber = (int) (Math.random() * 5) + 1;
                    if(userMeat.equals("1")) {
                        switch (randomNumber) {
                            case 1:
                                Dominos dominos = new Dominos();
                                dominos.NonVegBeefAndPork();
                                dominos.Sides();
                                dominos.Drinks();
                                dominos.printOrder();
                                System.out.println("\nPress any key to try again, or type 'Quit' or 'q' to exit");
                                userInput = scanner.nextLine();
                                userInput.toLowerCase(Locale.ROOT);
                                break;
                            case 2:
                                Wendys wendys = new Wendys();
                                wendys.NonVeg();
                                wendys.Sides();
                                wendys.Drinks();
                                wendys.printOrder();
                                System.out.println("\nPress any key to try again, or type 'Quit' or 'q' to exit");
                                userInput = scanner.nextLine();
                                userInput.toLowerCase(Locale.ROOT);
                                break;
                            case 3:
                                ChikFilA chikFilA = new ChikFilA();
                                chikFilA.NonVeg();
                                chikFilA.Sides();
                                chikFilA.Drinks();
                                chikFilA.printOrder();
                                System.out.println("\nPress any key to try again, or type 'Quit' or 'q' to exit");
                                userInput = scanner.nextLine();
                                userInput.toLowerCase(Locale.ROOT);
                                break;
                            case 4:
                                Chipotle chipotle = new Chipotle();
                                chipotle.NonVegBeefAndPork();
                                chipotle.Sides();
                                chipotle.Drinks();
                                chipotle.printOrder();
                                System.out.println("\nPress any key to try again, or type 'Quit' or 'q' to exit");
                                userInput = scanner.nextLine();
                                userInput.toLowerCase(Locale.ROOT);
                                break;
                            case 5:
                                TacoBell tacoBell = new TacoBell();
                                tacoBell.NonVegBeefAndPork();
                                tacoBell.Sides();
                                tacoBell.Drinks();
                                tacoBell.printOrder();
                                System.out.println("\nPress any key to try again, or type 'Quit' or 'q' to exit");
                                userInput = scanner.nextLine();
                                userInput.toLowerCase(Locale.ROOT);
                                break;
                            case 6:
                                BurgerKing burgerKing = new BurgerKing();
                                burgerKing.NonVegBeefAndPork();
                                burgerKing.Sides();
                                burgerKing.Drinks();
                                burgerKing.printOrder();
                                System.out.println("\nPress any key to try again, or type 'Quit' or 'q' to exit");
                                userInput = scanner.nextLine();
                                userInput.toLowerCase(Locale.ROOT);
                                break;
                            case 7:
                                Subway subway = new Subway();
                                subway.NonVegBeefAndPork();
                                subway.Sides();
                                subway.Drinks();
                                subway.printOrder();
                                System.out.println("\nPress any key to try again, or type 'Quit' or 'q' to exit");
                                userInput = scanner.nextLine();
                                userInput.toLowerCase(Locale.ROOT);
                                break;
                            default:
                                McDonalds mcDonalds = new McDonalds();
                                mcDonalds.NonVegBeefAndPork();
                                mcDonalds.Sides();
                                mcDonalds.Drinks();
                                mcDonalds.printOrder();
                                System.out.println("\nPress any key to try again, or type 'Quit' or 'q' to exit");
                                userInput = scanner.nextLine();
                                userInput.toLowerCase(Locale.ROOT);
                                break;
                        }
                    }else if (userMeat.equals("2")) {
                        switch (randomNumber) {
                            case 1:
                                Dominos dominos = new Dominos();
                                dominos.NonVeg();
                                dominos.Sides();
                                dominos.Drinks();
                                dominos.printOrder();
                                System.out.println("\nPress any key to try again, or type 'Quit' or 'q' to exit");
                                userInput = scanner.nextLine();
                                userInput.toLowerCase(Locale.ROOT);
                                break;
                            case 2:
                                Wendys wendys = new Wendys();
                                wendys.NonVeg();
                                wendys.Sides();
                                wendys.Drinks();
                                wendys.printOrder();
                                System.out.println("\nPress any key to try again, or type 'Quit' or 'q' to exit");
                                userInput = scanner.nextLine();
                                userInput.toLowerCase(Locale.ROOT);
                                break;
                            case 3:
                                ChikFilA chikFilA = new ChikFilA();
                                chikFilA.NonVeg();
                                chikFilA.Sides();
                                chikFilA.Drinks();
                                chikFilA.printOrder();
                                System.out.println("\nPress any key to try again, or type 'Quit' or 'q' to exit");
                                userInput = scanner.nextLine();
                                userInput.toLowerCase(Locale.ROOT);
                                break;
                            case 4:
                                Chipotle chipotle = new Chipotle();
                                chipotle.NonVeg();
                                chipotle.Sides();
                                chipotle.Drinks();
                                chipotle.printOrder();
                                System.out.println("\nPress any key to try again, or type 'Quit' or 'q' to exit");
                                userInput = scanner.nextLine();
                                userInput.toLowerCase(Locale.ROOT);
                                break;
                            case 5:
                                TacoBell tacoBell = new TacoBell();
                                tacoBell.NonVeg();
                                tacoBell.Sides();
                                tacoBell.Drinks();
                                tacoBell.printOrder();
                                System.out.println("\nPress any key to try again, or type 'Quit' or 'q' to exit");
                                userInput = scanner.nextLine();
                                userInput.toLowerCase(Locale.ROOT);
                                break;
                            case 6:
                                Subway subway = new Subway();
                                subway.NonVeg();
                                subway.Sides();
                                subway.Drinks();
                                subway.printOrder();
                                System.out.println("\nPress any key to try again, or type 'Quit' or 'q' to exit");
                                userInput = scanner.nextLine();
                                userInput.toLowerCase(Locale.ROOT);
                            case 7:
                                BurgerKing burgerKing = new BurgerKing();
                                burgerKing.NonVeg();
                                burgerKing.Sides();
                                burgerKing.Drinks();
                                burgerKing.printOrder();
                                System.out.println("\nPress any key to try again, or type 'Quit' or 'q' to exit");
                                userInput = scanner.nextLine();
                                userInput.toLowerCase(Locale.ROOT);
                                break;
                            default:
                                McDonalds mcDonalds = new McDonalds();
                                mcDonalds.NonVeg();
                                mcDonalds.Sides();
                                mcDonalds.Drinks();
                                mcDonalds.printOrder();
                                System.out.println("\nPress any key to try again, or type 'Quit' or 'q' to exit");
                                userInput = scanner.nextLine();
                                userInput.toLowerCase(Locale.ROOT);
                                break;
                        }
                        break;
                    }
                    break;
                } else if (userDiet.equals("1")) {
                    int randomNumber = (int) (Math.random() * 5) + 1;
                    switch (randomNumber) {
                        case 1:
                            Dominos dominos = new Dominos();
                            dominos.Veg();
                            dominos.Sides();
                            dominos.Drinks();
                            dominos.printOrder();
                            System.out.println("\nPress any key to try again, or type 'Quit' or 'q' to exit");
                            userInput = scanner.nextLine();
                            userInput.toLowerCase(Locale.ROOT);
                            break;
                        case 2:
                            Wendys wendys = new Wendys();
                            wendys.Veg();
                            wendys.Sides();
                            wendys.Drinks();
                            wendys.printOrder();
                            System.out.println("\nPress any key to try again, or type 'Quit' or 'q' to exit");
                            userInput = scanner.nextLine();
                            userInput.toLowerCase(Locale.ROOT);
                            break;
                        case 3:
                            ChikFilA chikFilA = new ChikFilA();
                            chikFilA.Veg();
                            chikFilA.Sides();
                            chikFilA.Drinks();
                            chikFilA.printOrder();
                            System.out.println("\nPress any key to try again, or type 'Quit' or 'q' to exit");
                            userInput = scanner.nextLine();
                            userInput.toLowerCase(Locale.ROOT);
                            break;
                        case 4:
                            Chipotle chipotle = new Chipotle();
                            chipotle.Veg();
                            chipotle.Sides();
                            chipotle.Drinks();
                            chipotle.printOrder();
                            System.out.println("\nPress any key to try again, or type 'Quit' or 'q' to exit");
                            userInput = scanner.nextLine();
                            userInput.toLowerCase(Locale.ROOT);
                            break;
                        case 5:
                            TacoBell tacoBell = new TacoBell();
                            tacoBell.Veg();
                            tacoBell.Sides();
                            tacoBell.Drinks();
                            tacoBell.printOrder();
                            System.out.println("\nPress any key to try again, or type 'Quit' or 'q' to exit");
                            userInput = scanner.nextLine();
                            userInput.toLowerCase(Locale.ROOT);
                            break;
                        case 6:
                            Subway subway = new Subway();
                            subway.Veg();
                            subway.Sides();
                            subway.Drinks();
                            subway.printOrder();
                            System.out.println("\nPress any key to try again, or type 'Quit' or 'q' to exit");
                            userInput = scanner.nextLine();
                            userInput.toLowerCase(Locale.ROOT);
                        default:
                            chipotle = new Chipotle();
                            chipotle.Veg();
                            chipotle.Sides();
                            chipotle.Drinks();
                            chipotle.printOrder();
                            System.out.println("\nPress any key to try again, or type 'Quit' or 'q' to exit");
                            userInput = scanner.nextLine();
                            userInput.toLowerCase(Locale.ROOT);
                            break;
                    }
                    break;
                } else {
                    System.out.println("Invalid diet input, please re-enter");
                    userDiet = scanner.nextLine();
                    userDiet.toLowerCase(Locale.ROOT);
                }
            }
        } while (!(userInput.equals("quit")) && !(userInput.equals("q")));
    }
}
