package com.company;

public class Eagle extends Animal {
    private int age;

    public Eagle() {
    }

    public Eagle(double weight, String color, int age) {
        super(weight, color);
    }

    @Override
    public void eat() {
        super.eat();
    }


    public  void fly(){
        System.out.println("Eagles can fly very high in the sky");
    }


}
