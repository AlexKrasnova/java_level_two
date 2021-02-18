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

        String[][] array2 = {
                {"0", "1", "2", "3"},
                {"0", "1", "2", "3"},
                {"0", "1", "2"},
                {"0", "1", "2", "3"}
        };

        String[][] array3 = {
                {"0", "1", "d", "3"},
                {"0", "1", "2", "3"},
                {"0", "1", "2", "3"},
                {"0", "1", "2", "3"}
        };

        String[][] array4 = {
                {"0", "1", "2", "3"},
                {"0", "1", "2", "3"},
                {"0", "1", "2", "3"},
                {"0", "`", "2", "3"}
        };

        String[][] array5 = {
                {"0", "1", "2", "3"},
                {"0", "1", "2", "3"},
                {"0", "1", "2", "3"},
                {"0", "1", "2", "3"}
        };

        test(array1);
        test(array2);
        test(array3);
        test(array4);
        test(array5);

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

    public static void test(String[][] array) {
        try {
            System.out.println("Сумма элементов массива равна " + convertAndSumArray(array));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
            array[e.getIndex1()][e.getIndex2()] = "0";
            test(array);
        }
    }
}
