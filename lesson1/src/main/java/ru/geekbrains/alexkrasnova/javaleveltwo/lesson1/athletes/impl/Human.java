package ru.geekbrains.alexkrasnova.javaleveltwo.lesson1.athletes.impl;

import ru.geekbrains.alexkrasnova.javaleveltwo.lesson1.athletes.Athlete;

public class Human implements Athlete {

    private String name;
    private String surname;

    private int maxRunningDistance = 1000;
    private int maxJumpingHeight = 100;

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Human(String name, String surname, int maxRunningDistance, int maxJumpingHeight) {
        this.name = name;
        this.surname = surname;
        this.maxRunningDistance = maxRunningDistance;
        this.maxJumpingHeight = maxJumpingHeight;
    }

    @Override
    public boolean run(int distance) {
        if (distance <= maxRunningDistance) {
            System.out.printf("Человек %s %s пробежал %d м\n", name, surname, distance);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= maxJumpingHeight) {
            System.out.printf("Человек %s %s перепрыгнул препятствие высотой %d см\n", name, surname, height);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getIdentifier() {
        return name + " " + surname;
    }
}
