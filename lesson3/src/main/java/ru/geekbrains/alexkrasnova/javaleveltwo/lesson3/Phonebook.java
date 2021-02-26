package ru.geekbrains.alexkrasnova.javaleveltwo.lesson3;

import java.util.*;

public class Phonebook {

    Map<String, Set<String>> data;

    public Phonebook() {
        data = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        Set<String> phoneNumbers;
        if (data.containsKey(surname)) {
            phoneNumbers = data.get(surname);
        } else {
            phoneNumbers = new HashSet<>();
            data.put(surname, phoneNumbers);
        }
        phoneNumbers.add(phoneNumber);

    }

    public List<String> get(String surname) {
        if(data.containsKey(surname)) {
            return new ArrayList<>(data.get(surname));
        }
        return Collections.EMPTY_LIST;
    }

    public void print() {
        System.out.println(data);
    }
}
