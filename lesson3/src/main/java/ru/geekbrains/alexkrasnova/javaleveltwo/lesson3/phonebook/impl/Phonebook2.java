package ru.geekbrains.alexkrasnova.javaleveltwo.lesson3.phonebook.impl;

import ru.geekbrains.alexkrasnova.javaleveltwo.lesson3.phonebook.Phonebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook2 implements Phonebook {

    Map<String, List<String>> data;

    public Phonebook2(){
        data = new HashMap<>();
    }

    @Override
    public void add(String surname, String phoneNumber){
        List<String> phoneNumbers;
        if (data.containsKey(surname)){
            phoneNumbers = data.get(surname);
        } else {
            phoneNumbers = new ArrayList<>();
        }
        phoneNumbers.add(phoneNumber);
        data.put(surname, phoneNumbers);
    }

    @Override
    public List<String> get(String surname){
        return data.get(surname);
    }

    @Override
    public void print(){
        System.out.println(data);
    }
}
