package com.company;

import java.text.DecimalFormat;

public class ChikFilA  {
    private String food;
    private String side;
    private String drink;
    private int foodCalories = 0;
    private double price;

    public ChikFilA() {
        System.out.println("\nWelcome to Chik Fil A!");
        System.out.println("Here is a sample order from Chik Fil A");
        price = 0.00;
    }

    public void NonVeg() {
        int randomNumber = (int) (Math.random() * 5) + 1;

        switch (randomNumber) {
            case 1:
                food = "Chicken Sandwich";
                foodCalories += 440;
                price += 4.29;
                break;
            case 2:
                food = "Deluxe Sandwich";
                foodCalories += 500;
                price += 4.99;
                break;
            case 3:
                food = "Spicy Chicken Sandwich";
                foodCalories += 460;
                price += 4.55;
                break;
            case 4:
                food = "Spicy Deluxe Sandwich";
                foodCalories += 550;
                price += 5.25;
                break;
            case 5:
                food = "Grilled Chicken Sandwich";
                foodCalories += 320;
                price += 5.85;
                break;
            case 6:
                food = "Grilled Nuggets (8-piece)";
                foodCalories += 130;
                price += 5.19;
                break;
            case 7:
                food = "Chick-n-Strips";
                foodCalories += 310;
                price += 4.69;
                break;
            case 8:
                food = "Chicken Noodle Soup";
                foodCalories += 145;
                price += 3.49;
                break;
            default:
                food = "Nuggets (8-piece)";
                foodCalories += 250;
                price += 4.35;
        }
    }

    public void Veg() {
        int randomNumber = (int) (Math.random() * 5) + 1;

        switch (randomNumber) {
            case 1:
                food = "Cool Wrap";
                foodCalories += 350;
                price += 7.25;
                break;
            case 2:
                food = "Mac & Cheese (medium)";
                foodCalories += 450;
                price += 3.59;
                break;
            default:
                food = "Salad";
                foodCalories += 470;
                price += 3.59;
                break;
        }
    }

    public void Sides() {
        int randomNumber = (int) (Math.random() * 5) + 1; //this will return a random double, convert to int, number
        switch (randomNumber) {
            case 1:
                side = "Fruit Cup (medium)";
                foodCalories += 60;
                price += 3.59;
                break;

            case 2:
                side = "Kale Crunch Side";
                foodCalories += 120;
                price += 2.15;
                break;
            case 3:
                side = "Greek Yogurt Parfait w/ Granola";
                foodCalories += 270;
                price += 4.29;
                break;
            case 4:
                side = "Waffle Potato Chips";
                foodCalories += 220;
                price += 1.99;
                break;
            case 5:
                side = "Apple Sauce";
                foodCalories += 45;
                price += 2.19;
            default:
                side = "Waffle Potato Fries (small)";
                foodCalories += 420;
                price += 2.15;
                break;
        }
    }

    public void Drinks() {
        int randomNumber = (int) (Math.random() * 5) + 1;

        switch (randomNumber) {
            case 1:
                drink = "Coca-Cola (small)";
                foodCalories += 140;
                price += 1.89;
                break;

            case 2:
                drink = "Sprite (small)";
                foodCalories += 190;
                price += 1.89;
                break;

            case 3:
                drink = "Coca-Cola Cherry (small)";
                foodCalories += 200;
                price += 1.89;
                break;

            case 4:
                drink = "Dr. Pepper (small)";
                foodCalories += 180;
                price += 1.89;
                break;

            case 5:
                drink = "Diet Coke (small)";
                foodCalories += 0;
                price += 1.89;
                break;

            case 6:
                drink = "Lemonade";
                foodCalories += 220;
                price += 2.25;
                break;

            case 7:
                drink = "Diet Lemonade";
                foodCalories += 50;
                price += 2.25;
                break;

            case 8:
                drink = "Iced Tea Sweetened";
                foodCalories += 120;
                price += 1.89;
                break;

            case 9:
                drink = "Iced Tea Unsweetened";
                foodCalories += 0;
                price += 1.89;
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
