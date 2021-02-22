package ru.geekbrains.alexkrasnova.javaleveltwo.lesson3.phonebook;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    private List<Person> persons;

    public Phonebook(List<Person> persons) {
        this.persons = persons;
    }

    public List<String> get(String surname) {
        List<String> phoneNumbers = new ArrayList<>();
        for (Person person : persons) {
            if (person.surname.equals(surname)) {
                phoneNumbers.add(person.phoneNumber);
            }
        }
        return phoneNumbers;
    }

    public void add(String surname, String phoneNumber) {
        persons.add(new Person(surname, phoneNumber));
    }

    public void print() {
        System.out.println(persons);
    }
}
