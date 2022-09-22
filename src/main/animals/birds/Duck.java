package main.animals.birds;

import main.animals.Animal;

public class Duck extends Animal implements Flying {


    public Duck(String name, Integer age, Double weight, String color) {
        super(name, age, weight, color);
    }
    public Duck() {
        super();
    }

       @Override
    public  void fly() {
        System.out.println("Я лечу");
    }

    public void say() {
        System.out.println("Кря");
    }

}
