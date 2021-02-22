package ru.geekbrains.alexkrasnova.javaleveltwo.lesson3.phonebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook2 {
    Map<String, List<String>> data;

/*    public Phonebook2(Map<String, List<String>> data) {
        this.data = data;
    }*/

    public Phonebook2(){
        data = new HashMap<>();
    }

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

    public List<String> get(String surname){
        return data.get(surname);
    }

    public void print(){
        System.out.println(data);
    }
}
