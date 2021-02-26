package ru.geekbrains.alexkrasnova.javaleveltwo.lesson3;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        testArrayFunctions();

        testPhonebook();
    }

    public static List<String> getUniqueElements(List<String> array) {
        return new ArrayList<>(new HashSet<>(array));
    }

    public static Map<String, Integer> getMap(List<String> array) {
        Map<String, Integer> map = new HashMap<>();
        for (String element : array) {
            if (map.containsKey(element)) {
                map.put(element, map.get(element) + 1);
            } else {
                map.put(element, 1);
            }
        }
        return map;
    }


    public static void testArrayFunctions() {
        List<String> words = new ArrayList<>(Arrays.asList("Собака", "Кошка", "Корова", "Кошка", "Лошадь", "Лошадь", "Курица", "Лошадь", "Лягушка", "Собака", "Собака", "Собака", "Курица", "Овца", "Утконос", "Лягушка", "Крокодил", "Попугай", "Собака", "Лягушка"));

        System.out.println(words);
        System.out.println(words.size());

        System.out.println(getUniqueElements(words));
        System.out.println(getUniqueElements(words).size());

        System.out.println(getMap(words));
        System.out.println(getMap(words).size());
    }

    public static void testPhonebook() {

        Phonebook phonebook = new Phonebook();

        phonebook.add("Крылов", "+79054443322");
        phonebook.add("Крылов", "+79034566655");
        phonebook.add("Есенин", "+79033344555");
        phonebook.add("Цветаева", "+79031234567");
        phonebook.add("Куприн", "+790311122233");
        phonebook.add("Северянин", "+79030009988");
        phonebook.add("Куприн", "+790311122233");
        phonebook.add("Куприн", "+790311122233");
        phonebook.add("Куприн", "+790311122233");
        phonebook.add("Куприн", "+790311122233");
        phonebook.add("Куприн", "+790311122233");
        phonebook.add("Куприн", "+790311122234");

        phonebook.print();

        System.out.println(phonebook.get("Есенин"));
        System.out.println(phonebook.get("Куприн"));
        System.out.println(phonebook.get("Иванов"));
    }
}
