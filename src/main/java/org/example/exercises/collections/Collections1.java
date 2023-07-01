package org.example.exercises.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Collections1 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "a", "b", "c");
        String[] stringArray = collection.toArray(new String[0]);

        System.out.println(Arrays.toString(stringArray));
    }
}