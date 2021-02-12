package ru.geekbrains.alexkrasnova.javaleveltwo.lesson1.obstacles.impl;

import ru.geekbrains.alexkrasnova.javaleveltwo.lesson1.obstacles.Obstacle;

public class Wall implements Obstacle {

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public int getSize() {
        return height;
    }
}
