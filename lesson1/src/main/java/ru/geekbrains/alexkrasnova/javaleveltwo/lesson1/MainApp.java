package ru.geekbrains.alexkrasnova.javaleveltwo.lesson1;

import ru.geekbrains.alexkrasnova.javaleveltwo.lesson1.athletes.Athlete;
import ru.geekbrains.alexkrasnova.javaleveltwo.lesson1.athletes.impl.Cat;
import ru.geekbrains.alexkrasnova.javaleveltwo.lesson1.athletes.impl.Human;
import ru.geekbrains.alexkrasnova.javaleveltwo.lesson1.athletes.impl.Robot;
import ru.geekbrains.alexkrasnova.javaleveltwo.lesson1.obstacles.Obstacle;
import ru.geekbrains.alexkrasnova.javaleveltwo.lesson1.obstacles.impl.RunningTrack;
import ru.geekbrains.alexkrasnova.javaleveltwo.lesson1.obstacles.impl.Wall;

public class MainApp {
    public static void main(String[] args) {

        Athlete[] athletes = {
                new Human("Han", "Solo"),
                new Cat("Chewbacca", "Brown", 4),
                new Human("Luke", "Skywalker"),
                new Robot("C-3PO"),
                new Robot("R2-D2", 1000, 0),
                new Human("Leia", "Organa"),
                new Cat("Yoda", "Green", 850, 1000, 1000),
                new Human("Qui-Gon", "Jinn")
        };

        Obstacle[] obstacles = {
                new RunningTrack(100),
                new Wall(50),
                new RunningTrack(300),
                new RunningTrack(250),
                new Wall(200),
                new Wall(100),
                new Wall(500),
                new RunningTrack(500),
                new RunningTrack(200),
                new Wall(30),
                new Wall(150)
        };

        int successfulAttempts = 0;

        for (Athlete athlete : athletes) {
            boolean success = true;
            for (Obstacle obstacle : obstacles) {
                if(!obstacle.overcomeObstacle(athlete)){
                    System.out.printf("Атлет %s выбыл, не преодолев %s\n\n", athlete.getIdentifier(), obstacle.getDescription());
                    success = false;
                    break;
                }
            }
            if (success) {
                successfulAttempts++;
                System.out.printf("Атлет %s успешно преодолел полосу препятствий\n\n", athlete.getIdentifier());
            }
        }
        System.out.printf("Количество атлетов, успешно преодолевших полосу перпятствий: %d\n", successfulAttempts);
    }
}
