package com.example.design.creational.factory;

import java.util.Objects;

public class ShapeDecider {

    Shape getShapeInstance(String shape){
        if(Objects.equals(shape, "Circle")){
            return new Circle();
        }
        return new Square();
    }

}
