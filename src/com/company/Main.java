package com.company;

public class Main {

    public static void main(String[] args) {
        Animal shark = new Shark(500.6, "Blue", true);
        Animal turtle = new Turtle(150.5, "Brown", 4);
        Animal eagle = new Eagle(3.5, "Black",  3);

       Animal[] animals = {new Shark(), new Turtle(), new Eagle()};

       Shark[] fish = new Shark[1];
       Turtle[] reptile = new Turtle[1];
       Eagle[] bird = new Eagle[1];

       int count = 0;
       int count1 = 0;
       int count2 = 0;

       for(Animal animal:animals){
           if(animal instanceof Shark) {
               ((Shark) animal).attack();
               fish[count++] = (Shark) animal;

           }
           if (animal.getClass().getName().equals("com.company.Shark")){
               ((Shark) animal).attack();
           }
           if(animal instanceof Turtle){
               ((Turtle) animal).swim();
               reptile[count1++] = (Turtle) animal;

           }
           if (animal.getClass().getName().equals("com.company.Turtle")){
               ((Turtle) animal).swim();
           }
           if(animal instanceof Eagle){
               ((Eagle) animal).fly();
               bird[count2++]= (Eagle) animal;

           }
           if (animal.getClass().getName().equals("com.company.Eagle")){
               ((Eagle) animal).fly();

           }
       }
    }
}
