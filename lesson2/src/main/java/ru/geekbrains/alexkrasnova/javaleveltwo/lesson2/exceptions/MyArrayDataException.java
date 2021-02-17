package ru.geekbrains.alexkrasnova.javaleveltwo.lesson2.exceptions;

public class MyArrayDataException extends MyArrayException {
    private int index1;
    private int index2;
    private String value;

    public int getIndex1() {
        return index1;
    }

    public int getIndex2() {
        return index2;
    }

    public String getValue() {
        return value;
    }

    public MyArrayDataException(int index1, int index2, String value) {
        super("Был найден некорректный элемент массива X[" + index1 + "][" + index2 + "] =  " + value);
        this.index1 = index1;
        this.index2 = index2;
        this.value = value;
    }

}
