package com.example.design.structural.decorator;

public class DecoratorPatternDriver {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);

        System.out.println(coffee.getDescription()); // Output: Simple Coffee, Milk, Sugar
        System.out.println("Total Cost: $" + coffee.getCost()); // Output: 8.0
    }
}
