package ru.geekbrains.alexkrasnova.javaleveltwo.lesson3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {

    Map<String, List<String>> data;

    public Phonebook() {
        data = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        List<String> phoneNumbers;
        if (data.containsKey(surname)) {
            phoneNumbers = data.get(surname);
        } else {
            phoneNumbers = new ArrayList<>();
            data.put(surname, phoneNumbers);
        }
        phoneNumbers.add(phoneNumber);

    }

    public List<String> get(String surname) {
        return data.get(surname);
    }

    public void print() {
        System.out.println(data);
    }
}
