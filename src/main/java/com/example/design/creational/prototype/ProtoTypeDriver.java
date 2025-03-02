package com.example.design.creational.prototype;

public class ProtoTypeDriver {

    Student student = new Student("Ankit", 21, 83);
    Student clone = (Student) student.clonable();
//    Student clone = (Student) student.clonable();


}
