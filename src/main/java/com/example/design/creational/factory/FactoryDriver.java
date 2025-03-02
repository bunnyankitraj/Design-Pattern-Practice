package com.example.design.creational.factory;

public class FactoryDriver {

    public static void main(String[] args) {
        ShapeDecider shapeDecider = new ShapeDecider();
        Shape shape = shapeDecider.getShapeInstance("Circle");
        shape.getArea();
    }
}
