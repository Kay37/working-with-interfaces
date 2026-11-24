package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> myFamily = new ArrayList<Person>();
        myFamily.add(new Person("Jack", "Smith", 25));
        myFamily.add(new Person("Juliet", "Smith", 25));
        myFamily.add(new Person("Joseph", "Smith", 25));
        myFamily.add(new Person("Josiah", "Smith", 25));
        myFamily.add(new Person("Jaron", "Smith", 25));
        myFamily.add(new Person("Joaquin", "Smith", 25));
        Collections.sort(myFamily);

        for (Person person : myFamily) {
            System.out.println(person.getFirstName() + " " + person.getLastName() + ", Age: "  + person.getAge());
        }
    }
}
