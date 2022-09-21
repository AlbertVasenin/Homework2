package com.company;

public class Main {
    public static void main(String[] args){
        System.out.println("Задание 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        System.out.println();

        System.out.println("Задание 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        System.out.println();

        System.out.println("Задание 3");
        System.out.println(dog - 3.5);
        System.out.println(cat - 1.6);
        System.out.println(paper - 7639);
        System.out.println();

        System.out.println("Задание 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println();

        System.out.println("Задание 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        System.out.println();

        System.out.println("Задание 6");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = firstBoxer + secondBoxer;
        System.out.println("Общий вес двух боксеров: " + totalWeight + "кг");
        var differenceWeight = totalWeight % firstBoxer;
        System.out.println("Разница в весе боксеров: " + differenceWeight + "кг");
        System.out.println();

        System.out.println("Задание 7");
        System.out.println("Разница в весе (вычитание) " + (secondBoxer-firstBoxer) + "кг");
        System.out.println("Остаток от деления " + (secondBoxer % firstBoxer) + "кг");
        System.out.println();

        System.out.println("Задание 8");
        var hours = 640;
        var dayHours = 8;
        var workers = hours / dayHours;
        System.out.println("Всего работников в компании – " + workers + " человек");
        workers = workers + 94;
        hours = workers * 8;
        System.out.println("Если в компании работает " + workers + " человек, то всего " + hours + " часов работы может быть поделено между сотрудниками");


    }
}
