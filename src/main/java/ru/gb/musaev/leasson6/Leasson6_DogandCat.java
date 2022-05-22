package ru.gb.musaev.leasson6;

import java.util.Random;

public class Leasson6_DogandCat {
// 1. Создать классы Собака и Кот с наследованием от класса Животное.
// 2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
// Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
// 3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не
// умеет плавать, собака 10 м.).
// 4. * Добавить подсчет созданных котов, собак и животных.

public static void main(String[] args){
    Animal[] animals ={
            new Cat("Том"),
            new Dog("Рекс"),
            new Cat("Мурка"),
            new Dog("Бобик"),
            new Cat("Кискис"),
            new Dog("Джери"),
    };
    Random random = new Random();
    System.out.println(" Животные = " + Animal.getCount());
    System.out.println(" Коты = " + Cat.getCount());
    System.out.println(" Собаки = " + Dog.getCount());
    for (Animal animal: animals) {
        animal.run(random.nextInt(800));
        animal.swim(random.nextInt(40));

        
    }

}


}
