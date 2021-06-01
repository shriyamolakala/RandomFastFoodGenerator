package com.company;

import java.text.DecimalFormat;

public class Subway {
    private String food;
    private String side;
    private String drink;
    private double price;
    private int foodCalories = 0;

    public Subway() {
        System.out.println("\nWelcome to Subway!");
        System.out.println("Here is a sample order from Subway");
        price = 0.00;
    }

    public void NonVegBeefAndPork() {
        int randomNumber = (int) (Math.random() * 5) + 1;

        switch (randomNumber) {
            case 1:
                food = "BLT Sub";
                foodCalories += 680;
                price += 6.29;
                break;
            case 2:
                food = "Black Forest Ham Sub";
                foodCalories += 520;
                price += 6.29;
                break;
            case 3:
                food = "Buffalo Chicken Sub";
                foodCalories += 710;
                price += 7.99;
                break;
            case 4:
                food = "Chicken & Bacon Ranch Sub";
                foodCalories += 1070;
                price += 8.39;
                break;
            case 5:
                food = "Chicken Pizziola Sub";
                foodCalories += 830;
                price += 8.19;
                break;
            case 6:
                food = "Cold Cut Combo Sub";
                foodCalories += 610;
                price += 6.19;
                break;
            case 7:
                food = "Oven Roasted Chicken Sub";
                foodCalories += 540;
                price += 7.19;
                break;
            default:
                food = "Spicy Italian";
                foodCalories += 900;
                price += 6.29;
        }
    }

    public void NonVeg() {
        int randomNumber = (int) (Math.random() * 5) + 1;

        switch (randomNumber) {
            case 1:
                food = "Buffalo Chicken Sub";
                foodCalories += 710;
                price += 7.99;
                break;
            default:
                food = "Oven Roasted Chicken Sub";
                foodCalories += 540;
                price += 7.19;
                break;
        }
    }

    public void Veg() {
        int randomNumber = (int) (Math.random() * 5) + 1;

        switch (randomNumber) {

            case 1:
                food = "Veggie Delite Wrap";
                foodCalories += 330;
                price += 6.99;
                break;
            case 2:
                food = "Personal Cheese Pizza";
                foodCalories += 720;
                price += 4.99;
                break;
            default:
                food = "Veggie Delite Sub";
                foodCalories += 380;
                price += 6.19;
                break;
        }
    }

    public void Sides() {
        int randomNumber = (int) (Math.random() * 5) + 1; //this will return a random double, convert to int, number
        switch (randomNumber) {
            case 1:
                side = "Jalapeno Chips";
                foodCalories += 210;
                price += 1.19;
                break;
            case 2:
                side = "Chocolate Chip Cookie";
                foodCalories += 210;
                price += 0.69;
                break;
            default:
                side = "Lays Chips";
                foodCalories += 240;
                price += 1.19;
                break;
        }
    }

    public void Drinks() {
        int randomNumber = (int) (Math.random() * 5) + 1;

        switch (randomNumber) {
            case 1:
                drink = "Coca Cola (small)";
                foodCalories += 240;
                price += 1.89;
                break;

            case 2:
                drink = "Milk";
                foodCalories += 110;
                price += 1.59;
                break;

            case 3:
                drink = "Fanta Orange (small)";
                foodCalories += 150;
                break;
            case 4:
                drink = "vitaminwater XXX";
                foodCalories += 0;
                price += 1.99;
                break;
            case 5:
                drink = "Orange Juice";
                foodCalories += 160;
                price += 1.79;
                break;
            case 6:
                drink = "Super Fruit Punch";
                foodCalories += 35;
                price += 1.19;
                break;
            case 7:
                drink = "Gatorade Cool Blue";
                foodCalories += 140;
                price += 1.79;
                break;
            case 8:
                drink = "Chocolate Flavored Millk";
                foodCalories += 170;
                price += 1.59;
                break;
            default:
                drink = "Dasani Water";
                foodCalories += 0;
                price += 1.99;
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
