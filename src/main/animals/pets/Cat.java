package main.animals.pets;

import main.animals.Animal;


public class Cat extends Animal {

    public Cat(String name, Integer age, Double weight, String color) {
        super(name, age, weight, color);
    }

    public Cat() {
        super();
    }

    public void say() {
        System.out.println("Мяу");
    }

}
