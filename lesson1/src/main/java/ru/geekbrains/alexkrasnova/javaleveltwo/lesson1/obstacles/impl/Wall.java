package ru.geekbrains.alexkrasnova.javaleveltwo.lesson1.obstacles.impl;

import ru.geekbrains.alexkrasnova.javaleveltwo.lesson1.athletes.Athlete;
import ru.geekbrains.alexkrasnova.javaleveltwo.lesson1.obstacles.Obstacle;

public class Wall implements Obstacle {

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcomeObstacle(Athlete athlete) {
        return athlete.jump(height);
    }

    @Override
    public String getDescription() {
        return "препятствие высотой " + height + " см";
    }
}
