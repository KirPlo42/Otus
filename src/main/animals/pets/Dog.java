package main.animals.pets;

import main.animals.Animal;


public class Dog extends Animal {

    public Dog(String name, Integer age, Double weight, String color) {
        super(name, age, weight, color);
    }
    public Dog() {
        super();
    }

    public void say() {
        System.out.println("Гав");
    }

}
