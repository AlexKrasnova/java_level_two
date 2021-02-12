package ru.geekbrains.alexkrasnova.javaleveltwo.lesson1.athletes;

public interface Athlete {

    boolean run(int distance);

    boolean jump(int height);

    String getIdentifier();
}
