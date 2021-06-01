package com.company;

import java.text.DecimalFormat;

public class Dominos {
    private String food;
    private String side;
    private String drink;
    private double price;
    private int foodCalories = 0;

    public Dominos() {
        System.out.println("\nWelcome to Domino's!");
        System.out.println("Here is a sample order from Domino's");
        price = 0.00;
    }

    public void NonVegBeefAndPork() {
        int randomNumber = (int) (Math.random() * 5) + 1;

        switch (randomNumber) {
            case 1:
                food = "Crispy Bacon & Tomato Wings (12-piece)";
                price += 5.99;
                foodCalories += 780;
                break;
            case 2:
                food = "Classic Hot Buffalo Wings (12-piece)";
                foodCalories += 570;
                price += 5.99;
                break;
            case 3:
                food = "Spicy Jalapeno Pineapple Wings (12-piece)";
                foodCalories += 570;
                price += 5.99;
                break;
            case 4:
                food = "Sweet BBQ Bacon Wings (12-piece)";
                foodCalories += 660;
                price += 5.99;
                break;
            case 5:
                food = "Hot Buffalo Wings (8-piece)";
                foodCalories += 520;
                price += 7.99;
                break;
            case 6:
                food = "Honey BBQ Wings (8-piece)";
                foodCalories += 620;
                price += 7.99;
                break;
            case 7:
                food = "Plain Wings (8-piece";
                foodCalories += 500;
                price += 7.99;
                break;
            case 8:
                food = "Sweet Mango Habenero Wings (8-piec)";
                price += 7.99;
                foodCalories += 620;
                break;
            case 9:
                food = "Garlic Parmesan Wings (8-piece)";
                price += 7.99;
                foodCalories += 780;
                break;
            case 10:
                food = "Chicken Taco Pizza (14-inch)";
                foodCalories += 2800;
                price += 18.99;
                break;
            case 11:
                food = "Cheeseburger Pizza (14-inch)";
                foodCalories += 3040;
                price += 18.99;
                break;
            case 12:
                food = "ExtravaganZZa Pizza (14-inch)";
                foodCalories += 3120;
                price += 18.99;
                break;
            case 13:
                food = "MeatZZa Pizza (14-inch)";
                foodCalories += 2960;
                price += 18.99;
                break;
            default:
                food = "Boneless Chicken (8-piece)";
                price += 6.99;
                foodCalories += 453;
                break;
        }
    }

    public void NonVeg() {
        int randomNumber = (int) (Math.random() * 5) + 1;

        switch (randomNumber) {

            case 2:
                food = "Classic Hot Buffalo Wings (12-piece)";
                foodCalories += 570;
                price += 5.99;
                break;
            case 3:
                food = "Spicy Jalapeno Pineapple Wings (12-piece)";
                foodCalories += 570;
                price += 5.99;
                break;

            case 5:
                food = "Hot Buffalo Wings (8-piece)";
                foodCalories += 520;
                price += 7.99;
                break;

            case 7:
                food = "Plain Wings (8-piece";
                foodCalories += 500;
                price += 7.99;
                break;
            case 8:
                food = "Sweet Mango Habenero Wings (8-piec)";
                price += 7.99;
                foodCalories += 620;
                break;
            case 9:
                food = "Garlic Parmesan Wings (8-piece)";
                price += 7.99;
                foodCalories += 780;
                break;
            case 10:
                food = "Chicken Taco Pizza (14-inch)";
                foodCalories += 2800;
                price += 18.99;
                break;
            default:
                food = "Boneless Chicken (8-piece)";
                price += 6.99;
                foodCalories += 453;
                break;
        }
    }



    public void Veg() {
        int randomNumber = (int) (Math.random() * 5) + 1;

        switch (randomNumber) {
            case 1:
                food = "Pacific Veggie Pizza (14-inch)";
                price += 18.99;
                foodCalories += 2480;
                break;
            case 2:
                food = "Honolulu Hawaiian Pizza (14-inch)";
                price += 18.99;
                foodCalories += 2640;
                break;
            case 3:
                food = "Deluxe Pizza (14-inch)";
                price += 18.99;
                foodCalories += 2480;
                break;
            case 4:
                food = "Spinach & Feta Pizza (14-inch)";
                price += 18.99;
                foodCalories += 2560;
                break;
            default:
                food = "Wisconsin 6 Cheese Pizza (14-inch)";
                price += 18.99;
                foodCalories += 2720;
                break;
        }
    }


    public void Sides() {
        int randomNumber = (int) (Math.random() * 5) + 1; //this will return a random double, convert to int, number
        switch (randomNumber) {
            case 1:
                side = "Cinnamon Bread Twists (8-piece)";
                foodCalories += 1220;
                price += 5.99;
                break;

            case 2:
                side = "Marbled Cookie Brownie (9 piece)";
                foodCalories += 1800;
                price += 6.49;
                break;

            default:
                side = "Chocolate Lava Crunch Cakes (2 pieces)";
                foodCalories += 180;
                price += 4.99;
                break;
        }
    }

    public void Drinks() {
        int randomNumber = (int) (Math.random() * 5) + 1;

        switch (randomNumber) {
            case 1:
                drink = "Coke (20oz)";
                foodCalories += 240;
                price += 1.99;
                break;

            case 2:
                drink = "Diet Coke (20oz)";
                foodCalories += 0;
                price += 1.99;
                break;

            case 3:
                drink = "Sprite (20oz)";
                foodCalories += 230;
                price += 1.99;
                break;

            case 4:
                drink = "Pibb Xtra (20oz)";
                foodCalories += 230;
                price += 1.99;
                break;

            case 5:
                drink = "Fanta Orange (20oz)";
                foodCalories += 270;
                price += 1.99;
                break;

            default:
                drink = "Dasani Water (20oz)";
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
