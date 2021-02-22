package ru.geekbrains.alexkrasnova.javaleveltwo.lesson3;

import ru.geekbrains.alexkrasnova.javaleveltwo.lesson3.phonebook.Person;
import ru.geekbrains.alexkrasnova.javaleveltwo.lesson3.phonebook.Phonebook;
import ru.geekbrains.alexkrasnova.javaleveltwo.lesson3.phonebook.impl.Phonebook1;
import ru.geekbrains.alexkrasnova.javaleveltwo.lesson3.phonebook.impl.Phonebook2;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        testArrayFunctions();
        testPhonebook();
        testPhonebook2();
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
        Phonebook phonebook = new Phonebook1(new ArrayList<>(Arrays
                .asList(
                        new Person("Куприн", "+74952334413"),
                        new Person("Толстой", "+74993334414"),
                        new Person("Пушкин", "+74953334444"),
                        new Person("Пушкин", "+74951544433"),
                        new Person("Лермонтов", "+74954444444"),
                        new Person("Фет", "+74952555555"),
                        new Person("Куприн", "+74951113322"),
                        new Person("Тютчев", "+74951312244"),
                        new Person("Бунин", "+74952345678"),
                        new Person("Гумилев", "+74951113456"),
                        new Person("Ахматова", "+74951513567"),
                        new Person("Гумилев", "+74953344544"),
                        new Person("Толстой", "+74957776543"),
                        new Person("Блок", "+74955456677"),
                        new Person("Пушкин", "+74995557890")
                ))
        );

        phonebook.print();
        System.out.println(phonebook.get("Пушкин"));

        phonebook.add("Крылов", "+79054443322");
        phonebook.add("Крылов", "+79034566655");
        phonebook.add("Есенин", "+79033344555");
        phonebook.add("Цветаева", "+79031234567");
        phonebook.add("Куприн", "+790311122233");
        phonebook.add("Северянин", "+79030009988");
        phonebook.print();

        System.out.println(phonebook.get("Ахматова"));
        System.out.println(phonebook.get("Есенин"));
        System.out.println(phonebook.get("Толстой"));
        System.out.println(phonebook.get("Куприн"));
    }

    public static void testPhonebook2() {
        Phonebook phonebook = new Phonebook2();

        phonebook.add("Крылов", "+79054443322");
        phonebook.add("Крылов", "+79034566655");
        phonebook.add("Есенин", "+79033344555");
        phonebook.add("Цветаева", "+79031234567");
        phonebook.add("Куприн", "+790311122233");
        phonebook.add("Северянин", "+79030009988");

        phonebook.print();

        System.out.println(phonebook.get("Куприн"));
        System.out.println(phonebook.get("Крылов"));
    }
}
