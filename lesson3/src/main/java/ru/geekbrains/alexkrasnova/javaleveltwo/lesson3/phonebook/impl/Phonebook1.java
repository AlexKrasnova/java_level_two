package ru.geekbrains.alexkrasnova.javaleveltwo.lesson3.phonebook.impl;

import ru.geekbrains.alexkrasnova.javaleveltwo.lesson3.phonebook.Person;
import ru.geekbrains.alexkrasnova.javaleveltwo.lesson3.phonebook.Phonebook;

import java.util.ArrayList;
import java.util.List;

public class Phonebook1 implements Phonebook {
    private List<Person> persons;

    public Phonebook1(List<Person> persons) {
        this.persons = persons;
    }

    public Phonebook1(){
        persons = new ArrayList<>();
    }

    @Override
    public List<String> get(String surname) {
        List<String> phoneNumbers = new ArrayList<>();
        for (Person person : persons) {
            if (person.surname.equals(surname)) {
                phoneNumbers.add(person.phoneNumber);
            }
        }
        return phoneNumbers;
    }

    @Override
    public void add(String surname, String phoneNumber) {
        persons.add(new Person(surname, phoneNumber));
    }

    @Override
    public void print() {
        System.out.println(persons);
    }
}
