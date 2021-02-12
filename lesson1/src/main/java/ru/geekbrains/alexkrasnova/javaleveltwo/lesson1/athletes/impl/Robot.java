package ru.geekbrains.alexkrasnova.javaleveltwo.lesson1.athletes.impl;

import ru.geekbrains.alexkrasnova.javaleveltwo.lesson1.athletes.Athlete;

public class Robot implements Athlete {

    private String model;

    private int maxRunningDistance = 2000;
    private int maxJumpingHeight = 500;

    public Robot(String model) {
        this.model = model;
    }

    public Robot(String model, int maxRunningDistance, int maxJumpingHeight) {
        this.model = model;
        this.maxRunningDistance = maxRunningDistance;
        this.maxJumpingHeight = maxJumpingHeight;
    }

    @Override
    public boolean run(int distance) {
        if (distance <= maxRunningDistance) {
            System.out.printf("Робот %s пробежал %d м\n", model, distance);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= maxJumpingHeight) {
            System.out.printf("Робот %s перепрыгнул препятствие высотой %d см\n", model, height);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getIdentifier() {
        return model;
    }
}
