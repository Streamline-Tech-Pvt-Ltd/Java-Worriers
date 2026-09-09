package com.main.collactions;

import java.util.*;

public class Employe {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("Rahul");
        names.add("Om");
        names.add("Amit");

        // Using Iterable
        Iterable<String> iterable = names;

        // For-each loop
        for (String name : iterable) {
            System.out.println(name);
        }
    }
}