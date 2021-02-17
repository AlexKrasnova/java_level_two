package ru.geekbrains.alexkrasnova.javaleveltwo.lesson1.obstacles;

import ru.geekbrains.alexkrasnova.javaleveltwo.lesson1.athletes.Athlete;

public interface Obstacle {

    boolean overcomeObstacle(Athlete athlete);

    String getDescription();
}
