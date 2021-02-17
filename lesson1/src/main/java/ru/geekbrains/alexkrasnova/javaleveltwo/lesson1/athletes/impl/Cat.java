package ru.geekbrains.alexkrasnova.javaleveltwo.lesson1.athletes.impl;

import ru.geekbrains.alexkrasnova.javaleveltwo.lesson1.athletes.Athlete;

import java.awt.*;

public class Cat implements Athlete {

    private String name;
    private String color;
    private int age;

    private int maxRunningDistance = 500;
    private int maxJumpingHeight = 150;


    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Cat(String name, String color, int age, int maxRunningDistance, int maxJumpingHeight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.maxRunningDistance = maxRunningDistance;
        this.maxJumpingHeight = maxJumpingHeight;
    }

    @Override
    public boolean run(int distance) {
        if (distance <= maxRunningDistance) {
            System.out.printf("%s котик по имени %s в возрасте %d лет пробежал %d м\n", color, name, age, distance);
            return true;
        } else {
            return false;
        }

    }

    @Override
    public boolean jump(int height) {
        if (height <= maxJumpingHeight) {
            System.out.printf("%s котик по имени %s в возрасте %d лет перепрыгнул препятствие высотой %d см\n", color, name, age, height);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getIdentifier() {
        return name;
    }
}
