package ru.geekbrains.alexkrasnova.javaleveltwo.lesson1.obstacles.impl;

import ru.geekbrains.alexkrasnova.javaleveltwo.lesson1.athletes.Athlete;
import ru.geekbrains.alexkrasnova.javaleveltwo.lesson1.obstacles.Obstacle;

public class RunningTrack implements Obstacle {

    private int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    @Override
    public boolean overcomeObstacle(Athlete athlete) {
        return athlete.run(length);
    }

    @Override
    public String getDescription() {
        return "препятствие длиной " + length + " м";
    }
}
