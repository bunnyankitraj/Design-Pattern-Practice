package com.example.design.creational.prototype;

public class Student implements Prototype {
    String name;
    int age;
    private int roll;

    public Student(String name, int age, int roll) {
        this.name = name;
        this.age = age;
        this.roll = roll;
    }

    @Override
    public Prototype clonable() {
        return new Student(name, age, roll);
    }

}
