package com.company;

import java.text.DecimalFormat;

public class Chipotle {
    private String food;
    private String side;
    private String drink;
    private int foodCalories = 0;
    private double price;

    public Chipotle() {
        System.out.println("\nWelcome to Chipotle!");
        System.out.println("Here is a sample order from Chipotle");
        price = 0.00;
    }

    public void NonVegBeefAndPork() {
        int randomNumber = (int) (Math.random() * 5) + 1;

        switch (randomNumber) {
            case 1:
                food = "Chicken Quesadilla";
                foodCalories += 540;
                price += 7.80;
                break;
            case 2:
                food = "Chicken Burrito";
                foodCalories += 795;
                price += 7.25;
                break;

            case 3:
                food = "Steak Burrito";
                foodCalories += 765;
                price += 8.60;
                break;
            case 4:
                food = "Steak Burrito Bowl";
                foodCalories += 845;
                price += 8.60;
                break;
            case 5:
                food = "Steak Quesadilla";
                foodCalories += 510;
                price += 9.15;
                break;
            default:
                food = "Chicken Burrito Bowl";
                foodCalories += 875;
                price += 7.25;
                break;
        }
    }

    public void NonVeg() {
        int randomNumber = (int) (Math.random() * 5) + 1;

        switch (randomNumber) {
            case 1:
                food = "Chicken Quesadilla";
                foodCalories += 540;
                price += 7.80;
                break;
            case 2:
                food = "Chicken Burrito";
                foodCalories += 795;
                price += 7.25;
                break;
            default:
                food = "Chicken Burrito Bowl";
                foodCalories += 875;
                price += 7.25;
                break;
        }
    }

    public void Veg() {
        int randomNumber = (int) (Math.random() * 5) + 1;

        switch (randomNumber) {
            case 1:
                food = "Veg Quesadilla";
                foodCalories += 600;
                price += 7.80;
                break;
            case 2:
                food = "Veg Burrito";
                foodCalories += 865;
                price += 7.25;
                break;
            case 3:
                food = "Veg Taco";
                foodCalories += 945;
                price += 7.25;
                break;
            default:
                food = "Veg Burrito Bowl";
                foodCalories += 715;
                price += 7.25;
        }
    }

    public void Sides() {
        int randomNumber = (int) (Math.random() * 5) + 1; //this will return a random double, convert to int, number
        switch (randomNumber) {
            case 1:
                side = "Chips & Queso Blanco";
                foodCalories += 780;
                price += 3.70;
                break;
            case 2:
                side = "Chips & Fresh Tomato Salsa";
                foodCalories += 570;
                price += 2.05;
                break;

            default:
                side = "Chips & Guacamole";
                foodCalories += 770;
                price += 3.70;
                break;
        }
    }

    public void Drinks() {
        int randomNumber = (int) (Math.random() * 5) + 1;

        switch (randomNumber) {
            case 1:
                drink = "Organic Lemonade (small)";
                foodCalories += 110;
                price += 2.40;
                break;

            case 2:
                drink = "Organic Hibiscus Lemonade (small)";
                foodCalories += 110;
                price += 2.40;
                break;

            case 3:
                drink = "Mexican Sprite";
                foodCalories += 160;
                price += 3.00;
                break;

            case 4:
                drink = "Mexican Coca-Cola";
                foodCalories += 150;
                price += 3.00;
                break;

            default:
                drink = "Bottled Water";
                foodCalories += 0;
                price += 2.45;
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
