package com.company;

public class Turtle extends Animal {

    private int age;

    public Turtle() {
    }

    public Turtle(double weight, String color, int age) {
        super(weight, color);
        this.age = age;
    }

    public void swim() {
        System.out.println("Turtles swim very slowly");
    }

    @Override
    public void eat() {
        super.eat();
    }


    @Override
    public String toString() {
        return "Turtle information: " +'\n'+
                "age=" + age +'\n'+
                super.toString();
    }
}
