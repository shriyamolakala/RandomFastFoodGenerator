package com.company;

import java.text.DecimalFormat;

public class McDonalds {
    private String food;
    private String side;
    private String drink;
    private double price;
    private int foodCalories = 0;

    public McDonalds() {
        System.out.println("\nWelcome to McDonald's!");
        System.out.println("Here is your sample order from McDonald's");
        price = 0.00;
    }

    public void NonVegBeefAndPork() {
        int randomNumber = (int) (Math.random() * 5) + 1;

        switch (randomNumber) {
            case 1:
                food = "Big Mac";
                foodCalories += 550;
                price += 3.99;
                break;
            case 2:
                food = "Chicken Nuggets (4 pieces)";
                foodCalories += 170;
                price += 3.29;
                break;
            case 3:
                food = "Sausage Burrito";
                foodCalories += 310;
                price += 1.29;
                break;
            case 4:
                food = "McDouble";
                foodCalories += 400;
                price += 1.39;
                break;
            case 5:
                food = "Cheeseburger";
                foodCalories += 300;
                price += 1.00;
                break;
            case 6:
                food = "Deluxe Crispy Chicken";
                foodCalories += 530;
                price += 4.39;
                break;
            case 7:
                food = "McChicken";
                foodCalories += 400;
                price += 1.29;
                break;
            default:
                food = "Happy Meal";
                foodCalories += 475;
                price += 3.29;
                break;
        }
    }

    public void NonVeg() {
        int randomNumber = (int) (Math.random() * 5) + 1;

        switch (randomNumber) {
            case 1:
                food = "Chicken Nuggets (4 pieces)";
                foodCalories += 170;
                price += 3.29;
                break;
            case 2:
                food = "Deluxe Crispy Chicken";
                foodCalories += 530;
                price += 4.39;
                break;
            case 3:
                food = "McChicken";
                foodCalories += 400;
                price += 1.29;
                break;
            default:
                food = "Happy Meal";
                foodCalories += 475;
                price += 3.29;
                break;
        }
    }

    public void Sides() {
        int randomNumber = (int) (Math.random() * 5) + 1; //this will return a random double, convert to int, number
        switch (randomNumber) {
            case 1:
                side = "Apple Fritter";
                foodCalories += 510;
                price += 2.69;
                break;

            case 2:

                side = "Blueberry Muffin";
                foodCalories += 470;
                price += 2.39;
                break;

            case 3:
                side = "Cinnamon Roll";
                foodCalories += 560;
                price += 2.99;
                break;
            case 4:
                side = "Hash Browns";
                foodCalories += 140;
                price += 1.09;
                break;
            default:
                side = "French Fries (small)";
                foodCalories += 220;
                price += 1.89;
                break;
        }
    }

    public void Drinks() {
        int randomNumber = (int) (Math.random() * 5) + 1;

        switch (randomNumber) {
            case 1:
                drink = "Coca Cola (small)";
                foodCalories += 150;
                price += 1.00;
                break;

            case 2:
                drink = "Sprite (small)";
                foodCalories += 140;
                price += 1.00;
                break;

            case 3:
                drink = "Fanta Orange (small)";
                foodCalories += 150;
                price += 1.00;
                break;

            case 4:
                drink = "Dr. Pepper (small)";
                foodCalories += 140;
                price += 1.00;
                break;

            case 5:
                drink = "Diet Coke (small)";
                foodCalories += 0;
                price += 1.00;
                break;

            case 6:
                drink = "Milk";
                foodCalories += 100;
                price += 1.00;
                break;

            case 7:
                drink = "Orange Juice (small)";
                foodCalories += 150;
                price += 1.59;
                break;

            case 8:
                drink = "Pink Lemonade Slushie (small)";
                foodCalories += 190;
                price += 1.59;
                break;

            case 9:
                drink = "Strawberry Watermelon Slushie (small)";
                foodCalories += 190;
                price += 1.59;
                break;

            case 10:
                drink = "Hi-C Orange Lavaburst (small)";
                foodCalories += 160;
                price += 1.19;
                break;

            case 11:
                drink = "Chocolate Milk";
                foodCalories += 130;
                price += 0.99;
                break;

            default:
                drink = "Dasani Water";
                foodCalories += 0;
                price += 1.79;
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
