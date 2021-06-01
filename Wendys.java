package com.company;

import java.text.DecimalFormat;

public class Wendys {
    private String food;
    private String side;
    private String drink;
    private double price;
    private int foodCalories = 0;

    public Wendys() {
        System.out.println("\nWelcome to Wendy's!");
        System.out.println("Here is a sample order from Wendy's");
        price = 0.00;
    }

    public void NonVeg() {
        int randomNumber = (int) (Math.random() * 5) + 1;

        switch (randomNumber) {
            case 1:
                food = "Spicy Jalapeno Popper Sandwich";
                foodCalories += 600;
                price += 6.19;
                break;
            case 2:
                food = "Spicy Chicken Nugget (10-piece)";
                foodCalories += 470;
                price += 3.89;
                break;
            case 3:
                food = "Spicy Chicken Sandwich";
                foodCalories += 500;
                price += 5.19;
                break;
            case 4:
                food = "Classic Chicken Sandwich";
                foodCalories += 490;
                price += 5.19;
                break;
            case 5:
                food = "Crispy Chicken Sandwich";
                foodCalories += 340;
                price += 1.59;
                break;
            case 6:
                food = "Crispy Chicken Nuggets (6-piece)";
                foodCalories += 270;
                price += 2.39;
                break;
            default:
                food = "Crispy Chicken Nuggets (4-piece)";
                foodCalories += 180;
                price += 1.59;
        }
    }

    public void Veg() {
        int randomNumber = (int) (Math.random() * 5) + 1;

        switch (randomNumber) {
            case 1:
                food = "Jalapeno Popper Salad";
                foodCalories += 660;
                price += 6.99;
                break;
            case 2:
                food = "Parmesan Caesar Salad";
                foodCalories += 440;
                price += 6.99;
            case 3:
                food = "Southwest Avocado Salad";
                foodCalories += 570;
                price += 6.99;
            default:
                food = "Taco Salad";
                foodCalories += 690;
                price += 6.99;
        }
    }

    public void Sides() {
        int randomNumber = (int) (Math.random() * 5) + 1; //this will return a random double, convert to int, number
        switch (randomNumber) {
            case 1:
                side = "French Fries (small)";
                foodCalories += 230;
                price += 1.59;
                break;

            case 2:
                side = "Pub Fries (small)";
                foodCalories += 270;
                price += 3.19;
                break;

            case 3:
                side = "Cheese Fries (small)";
                foodCalories += 560;
                price += 2.99;
                break;
            case 4:
                side = "Plain Baked Potato";
                foodCalories += 220;
                price += 1.99;
                break;
            default:
                side = "Apple Bites";
                price += 0.99;
                foodCalories += 35;
        }
    }

    public void Drinks() {
        int randomNumber = (int) (Math.random() * 5) + 1;

        switch (randomNumber) {
            case 1:
                drink = "Pinapple Mango Lemonade (small)";
                foodCalories += 240;
                price += 2.39;
                break;

            case 2:
                drink = "Tropical Berry Lemonade (small)";
                foodCalories += 230;
                price += 2.39;
                break;

            case 3:
                drink = "Coca Cola";
                foodCalories += 240;
                price += 1.89;
                break;

            case 4:
                drink = "Sprite";
                foodCalories += 230;
                price += 1.89;
                break;

            case 5:
                drink = "Diet Coke (small)";
                foodCalories += 0;
                price += 1.89;
                break;

            case 6:
                drink = "Classic Chocolare Frosty (small)";
                foodCalories += 200;
                price += 1.00;
                break;

            case 7:
                drink = "Vanilla Frosty (small)";
                foodCalories += 190;
                price += 1.00;
                break;

            default:
                drink = "Bottles Water";
                foodCalories += 0;
                price += 1.59;
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
