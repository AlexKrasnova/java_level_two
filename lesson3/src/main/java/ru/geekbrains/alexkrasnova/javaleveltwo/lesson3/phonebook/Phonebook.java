package ru.geekbrains.alexkrasnova.javaleveltwo.lesson3.phonebook;

import java.util.List;

public interface Phonebook {

    void add(String surname, String phoneNumber);

    List<String> get(String surname);

    void print();
}
