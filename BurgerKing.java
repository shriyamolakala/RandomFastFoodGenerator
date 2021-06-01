package com.company;

import java.text.DecimalFormat;

public class BurgerKing {
    private String food;
    private String side;
    private String drink;
    private int foodCalories = 0;
    private double price;

    public BurgerKing() {
        System.out.println("\nWelcome to Burger King!");
        System.out.println("Here is a sample order from Burger King");
        price = 0.00;
    }

    public void NonVegBeefAndPork() {
        int randomNumber = (int) (Math.random() * 5) + 1;

        switch (randomNumber) {
            case 1:
                food = "Original Chicken Sandwich";
                foodCalories += 662;
                price += 5.69;
                break;
            case 2:
                food = "Chicken Nuggets (10 piece)";
                foodCalories += 482;
                price += 1.49;
                break;
            case 3:
                food = "Spicy Chicken Jr.";
                foodCalories += 386;
                price += 1.19;
                break;
            case 4:
                food = "Hand-Breaded Crispy Chicken Sandwich";
                foodCalories += 800;
                price += 5.29;
                break;
            case 5:
                food = "Chicken Nuggets (4-piece)";
                foodCalories += 224;
                price += 1.19;
                break;
            default:
                food = "Whopper";
                foodCalories += 657;
                price += 5.69;
                break;
        }
    }

    public void NonVeg() {
        int randomNumber = (int) (Math.random() * 5) + 1;

        switch (randomNumber) {
            case 1:
                food = "Original Chicken Sandwich";
                foodCalories += 662;
                price += 5.69;
                break;
            case 2:
                food = "Chicken Nuggets (10 piece)";
                foodCalories += 482;
                price += 1.49;
                break;
            case 3:
                food = "Spicy Chicken Jr.";
                foodCalories += 386;
                price += 1.19;
                break;
            case 4:
                food = "Hand-Breaded Crispy Chicken Sandwich";
                foodCalories += 800;
                price += 5.29;
                break;
            default:
                food = "Chicken Nuggets (4-piece)";
                foodCalories += 224;
                price += 1.19;
                break;
        }
    }


    public void Sides() {
        int randomNumber = (int) (Math.random() * 5) + 1; //this will return a random double, convert to int, number
        switch (randomNumber) {
            case 1:
                side = "Onion Rings";
                foodCalories += 472;
                price += 2.29;
                break;
            case 2:
                side = "Mozzarella Sticks";
                foodCalories += 286;
                price += 1.49;
                break;
            case 3:
                side = "Jalapeno Cheddar Bites";
                foodCalories += 163;
                price += 1.00;
                break;
            case 4:
                side = "French Fries (small)";
                foodCalories += 220;
                price += 2.29;
                break;
            default:
                side = "Classic Fries";
                foodCalories += 320;
                break;
        }
    }

    public void Drinks() {
        int randomNumber = (int) (Math.random() * 5) + 1;

        switch (randomNumber) {
            case 1:
                drink = "Coca-Cola";
                foodCalories += 213;
                price += 1.00;
                break;

            case 2:
                drink = "Sprite";
                foodCalories += 196;
                price += 1.00;
                break;

            case 3:
                drink = "Barq's";
                foodCalories += 179;
                price += 1.00;
                break;

            case 4:
                drink = "Dr. Pepper";
                foodCalories += 190;
                price += 1.00;
                break;

            case 5:
                drink = "Frozen Coke";
                foodCalories += 130;
                price += 1.49;
                break;

            case 6:
                drink = "Frozen Fanta Wild Cherry";
                foodCalories += 113;
                price += 1.49;
                break;

            case 7:
                drink = "Chocolate Shake";
                foodCalories += 365;
                price += 1.00;
                break;

            case 8:
                drink = "BK Cafe Caramel Frappe";
                foodCalories += 302;
                price += 1.00;
                break;

            case 9:
                drink = "BK Cafe";
                foodCalories += 0;
                price += 1.00;
                break;

            case 10:
                drink = "BK Cafe Decaf";
                foodCalories += 0;
                price += 1.00;
                break;

            case 11:
                drink = "Vanilla Shake";
                foodCalories += 583;
                price += 2.99;
                break;

            default:
                drink = "Bottles Water";
                foodCalories += 0;
                price += 2.00;
                break;
        }
    }


    public String getFood() {
        return food;
    }

    public String getSide() {
        return side;
    }

    public String getDrink() {
        return drink;
    }

    public int getCalories() {
        return foodCalories;
    }

    public String getPrice() {
        DecimalFormat df = new DecimalFormat("#.##");
        price = Double.parseDouble(df.format(price));
        return "$" + price;
    }

    public void printOrder() {
        String border = "";
        String underBorder = "";


        for(int i = 0; i < 70; i++) {
            border = border + "=";

        }

        for(int i = 0; i < 70; i++) {
            underBorder = underBorder + "-";

        }
        System.out.println(border);

        System.out.println(border);
        System.out.printf("%-15s | %-50s %n", "Entree", getFood());
        System.out.println(underBorder);

        System.out.printf("%-15s | %-50s %n", "Side", getSide());
        System.out.println(underBorder);

        System.out.printf("%-15s | %-50s %n", "Drink", getDrink());
        System.out.println(underBorder);

        System.out.printf("%-15s | %-50s %n", "Total Calories", getCalories());
        System.out.println(underBorder);

        System.out.printf("%-15s | %-50s %n", "Total Price", getPrice());

        System.out.println(border);
        System.out.println(border);
    }


}
