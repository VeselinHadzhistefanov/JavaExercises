package org.example.exercises.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Collections2 {
    public static void main(String[] args) {
        Collection<String> c1 = new ArrayList<>();
        Collection<String> c2 = new ArrayList<>();

        Collections.addAll(c1, "a", "b", "c");
        c2.addAll(c1);

        System.out.println(c1 == c2);
        System.out.println(c1.equals(c2));
    }
}
