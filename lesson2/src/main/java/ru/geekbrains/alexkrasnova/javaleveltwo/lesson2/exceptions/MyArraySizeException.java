package ru.geekbrains.alexkrasnova.javaleveltwo.lesson2.exceptions;

public class MyArraySizeException extends MyArrayException {

    public MyArraySizeException() {
        super("Неверный размер массива");
    }
}
