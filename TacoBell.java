package com.company;

import java.text.DecimalFormat;

public class TacoBell {
    private String food;
    private String side;
    private String drink;
    private double price;
    private int foodCalories ;

    public TacoBell() {
        System.out.println("\nWelcome to Taco Bell!");
        System.out.println("Here is a sample order from Taco Bell");
        price = 0.00;
        foodCalories = 0;
    }

    public void NonVegBeefAndPork() {
        int randomNumber = (int) (Math.random() * 5) + 1;

        switch (randomNumber) {
            case 1:
                food = "Naked Chicken Chalupa";
                foodCalories += 470;
                price += 3.49;
                break;
            case 2:
                food = "Soft Taco";
                foodCalories += 180;
                price += 1.39;
                break;
            case 3:
                food = "Soft Taco Supreme";
                foodCalories += 210;
                price += 1.89;
                break;
            case 4:
                food = "Crunchy Taco";
                foodCalories += 170;
                price += 1.39;
                break;
            case 5:
                food = "Crunchy Taco Supreme";
                foodCalories += 190;
                price += 1.89;
                break;
            case 6:
                food = "Chalupa Supreme";
                foodCalories += 350;
                price += 3.39;
                break;
            default:
                food = "Crunchwrap Supreme";
                foodCalories += 530;
                price += 3.89;
        }
    }

    public void NonVeg() {
        int randomNumber = (int) (Math.random() * 5) + 1;

        switch (randomNumber) {
            case 1:
                food = "Naked Chicken Chalupa";
                foodCalories += 470;
                price += 3.49;
                break;
            default:
                food = "Chicken Quesadilla";
                foodCalories += 510;
                price += 3.89;
        }
    }

    public void Veg() {
        int randomNumber = (int) (Math.random() * 5) + 1;

        switch (randomNumber) {
            case 1:
                food = "Spicy Potato Soft Taco";
                foodCalories += 240;
                price += 1.00;
                break;
            case 2:
                food = "Black Bean Chalupa";
                foodCalories += 330;
                price += 3.29;
                break;
            case 3:
                food = "Cheese Quesadilla";
                foodCalories += 470;
                price += 3.29;
                break;
            case 4:
                food = "Veggie Nachos Party Pack";
                foodCalories += 1170;
                price += 9.99;
                break;
            case 5:
                food = "Black Bean Quesarito";
                foodCalories += 630;
                price += 3.29;
                break;
            case 6:
                food = "Cheese Quesadilla";
                foodCalories += 470;
                price += 3.29;
            default:
                food = "Black Bean Crunchwrap Supreme";
                foodCalories += 520;
                price += 3.89;
                break;
        }
    }

    public void Sides() {
        int randomNumber = (int) (Math.random() * 5) + 1; //this will return a random double, convert to int, number
        switch (randomNumber) {
            case 1:
                side = "Cheesy Fiest Potatoes";
                foodCalories += 230;
                price += 1.69;
                break;
            case 2:
                side = "Cinnamon Twists";
                foodCalories += 170;
                price += 1.00;
                break;
            case 3:
                side = "Cinnamon Delights (2-pack)";
                foodCalories += 160;
                price += 1.29;
                break;
            default:
                side = "Hash Browns";
                foodCalories += 160;
                price += 1.29;
                break;
        }
    }

    public void Drinks() {
        int randomNumber = (int) (Math.random() * 5) + 1;

        switch (randomNumber) {
            case 1:
                drink = "Baja Blast Colada Freeze (small)";
                foodCalories += 210;
                price += 2.89;
                break;

            case 2:
                drink = "Blue Raspberry Freeze (small)";
                foodCalories += 120;
                price += 2.89;
                break;

            case 3:
                drink = "Wild Strawberry Freeze (small)";
                foodCalories += 150;
                price += 2.89;
                break;

            case 4:
                drink = "Pepsi (small)";
                foodCalories += 200;
                price += 1.99;
                break;
            case 5:
                drink = "Diet Pepsi";
                foodCalories += 0;
                price += 1.99;
                break;
            default:
                drink = "Cup of Water";
                foodCalories += 0;
                price += 0;
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
