package main;

import main.animals.Animal;
import main.animals.pets.Dog;
import main.animals.birds.Duck;
import main.animals.pets.Cat;
import main.data.Commands;

import java.util.ArrayList;
import java.util.Scanner;

import static main.animals.Animal.createAnimal;

public class AnimalsApp {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Commands enterCommand = null;

        while (true) {
            System.out.println("Введите команду ADD/LIST/EXIT:");

            String input = sc.next().toUpperCase().trim();
            for (Commands command : Commands.values()) {
                if (command.name().equals(input)) {
                    enterCommand = Commands.valueOf(input);
                    break;
                } else {
                    enterCommand = Commands.UNKNOWN;
                }
            }
            switch (enterCommand) {
                case ADD:
                    System.out.println("Какое животное добавляем? Cat/Dog/Duck");
                    String animalType = sc.next().toUpperCase().trim();
                    Animal animal = null;
                    switch (animalType) {
                        case "CAT":
                            animal = new Cat();
                            break;
                        case "DOG":
                            animal = new Dog();
                            break;
                        case "DUCK":
                            animal = new Duck();
                            break;
                        default:
                            System.out.println("Wrong animal");
                    }

                    if (animal != null) {
                        createAnimal(animals, animal);
                        animal.say();
                    }
                    break;
                case LIST:
                    if (animals.isEmpty()) {
                        System.out.println("Тут пока пусто. Добавьте животное");
                    } else {
                        System.out.println(animals);
                    }
                    break;
                case EXIT:
                    System.out.println("Bye bye");
                    System.exit(0);
                default:
                    System.out.println("Wrong command. Try again");
                    break;
            }
        }
    }
}
