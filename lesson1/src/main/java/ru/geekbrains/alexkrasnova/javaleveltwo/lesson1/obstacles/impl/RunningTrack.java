package ru.geekbrains.alexkrasnova.javaleveltwo.lesson1.obstacles.impl;

import ru.geekbrains.alexkrasnova.javaleveltwo.lesson1.obstacles.Obstacle;

public class RunningTrack implements Obstacle {

    private int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    @Override
    public int getSize() {
        return length;
    }
}
