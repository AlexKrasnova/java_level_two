package ru.geekbrains.alexkrasnova.javaleveltwo.lesson2;

import ru.geekbrains.alexkrasnova.javaleveltwo.lesson2.exceptions.MyArrayDataException;
import ru.geekbrains.alexkrasnova.javaleveltwo.lesson2.exceptions.MyArrayException;
import ru.geekbrains.alexkrasnova.javaleveltwo.lesson2.exceptions.MyArraySizeException;

public class MainApp {

    private static final int ARRAY_SIZE = 4;

    public static void main(String[] args) {

        String[][] array1 = {
                {"0", "1", "2", "3"},
                {"0", "1", "2", "3"},
                {"0", "1", "2", "3"}
        };

        try {
            System.out.println("Сумма элементов массива равна " + convertAndSumArray(array1));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }


        String[][] array2 = {
                {"0", "1", "2", "3"},
                {"0", "1", "2", "3"},
                {"0", "1", "2"},
                {"0", "1", "2", "3"}
        };

        try {
            System.out.println("Сумма элементов массива равна " + convertAndSumArray(array2));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }


        String[][] array3 = {
                {"0", "1", "d", "3"},
                {"0", "1", "2", "3"},
                {"0", "1", "2", "3"},
                {"0", "1", "2", "3"}
        };

        try {
            System.out.println("Сумма элементов массива равна " + convertAndSumArray(array3));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }


        String[][] array4 = {
                {"0", "1", "2", "3"},
                {"0", "1", "2", "3"},
                {"0", "1", "2", "3"},
                {"0", "`", "2", "3"}
        };

        try {
            System.out.println("Сумма элементов массива равна " + convertAndSumArray(array4));
        } catch (MyArrayException e) {
            e.printStackTrace();
        }


        String[][] array5 = {
                {"0", "1", "2", "3"},
                {"0", "1", "2", "3"},
                {"0", "1", "2", "3"},
                {"0", "1", "2", "3"}
        };

        try {
            System.out.println("Сумма элементов массива равна " + convertAndSumArray(array5));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }

    }

    public static int convertAndSumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != ARRAY_SIZE) {
            throw new MyArraySizeException();
        }
        for (String[] array1 : array) {
            if (array1.length != ARRAY_SIZE) {
                throw new MyArraySizeException();
            }
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j, array[i][j]);
                }
            }
        }
        return sum;
    }
}
