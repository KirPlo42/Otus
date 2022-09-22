package main.animals;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Animal {
    private String name;
    private Integer age;
    private Double weight;
    private String color;

    public Animal(String name, Integer age, Double weight, String color) {
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void say(){
        System.out.println("Я говорю");
    }

    public void go(){
        System.out.println("Я иду");
    }

    public void drink(){
        System.out.println("Я пью");
    }

    public void eat(){
        System.out.println("Я ем");
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name +
                ", мне " + getPrefix(age) +
                ", я вешу " + weight +
                " кг, мой цвет - " + color;
    }

    private String getPrefix(int age) {
        int ageLastNumber = age % 10;
        boolean exclusion = (age % 100 >= 11) && (age % 100 <= 14);
        String old = "";

        if (ageLastNumber == 1)
            old = "год";
        else if(ageLastNumber == 0 || ageLastNumber >= 5)
            old = "лет";
        else if(ageLastNumber >= 2)
            old = "года";
        if (exclusion)
            old = "лет";
        return age + " " + old;
    }

    public static void createAnimal(ArrayList<Animal> animalsListForAdding, Animal animal){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = sc.next();
        System.out.println("Введите возраст:");
        Integer age = checkAge(sc);
        System.out.println("Введите вес:");
        Double weight = checkWeight(sc);
        System.out.println("Введите цвет:");
        String color = sc.next();
        animal.setName(name);
        animal.setAge(age);
        animal.setWeight(weight);
        animal.setColor(color);
        animalsListForAdding.add(animal);
    }

    public static int checkAge(Scanner scanner) {
        int age;
        do {
            while (!scanner.hasNextInt()) {
                if (scanner.hasNextBigInteger()) {
                    System.out.println("Введите значение поменьше");
                } else {
                    System.out.println("Введите значение в формате числа");
                }
                scanner.next();
            }
            age = scanner.nextInt();
            if (age < 0) {
                System.out.println("Введите положительное число");
            }
        }
        while (age < 0);
        return age;
    }
    public static Double checkWeight(Scanner scanner) {
        Double weight;
        do {
            while (!scanner.hasNextDouble()) {
                if (scanner.hasNextBigInteger()) {
                    System.out.println("Введите значение поменьше");
                } else {
                    System.out.println("Введите значение в формате числа (допустим ввод числа с дробной частью через запятую)");
                }
                scanner.next();
            }
            weight = scanner.nextDouble();
            if (weight < 0) {
                System.out.println("Введите положительное число");
            }
        }
        while (weight < 0);
        return weight;
    }

}
