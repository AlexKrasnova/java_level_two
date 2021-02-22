package ru.geekbrains.alexkrasnova.javaleveltwo.lesson3.phonebook;

public class Person {
    public String surname;
    public String phoneNumber;

    public Person(String surname, String phoneNumber) {
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return surname + ": " + phoneNumber;
    }
}
