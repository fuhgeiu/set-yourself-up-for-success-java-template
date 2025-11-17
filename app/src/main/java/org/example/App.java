package org.example;

import java.util.List;
import java.util.ArrayList;

public class App {

    public String getGreeting() {
        return "Remove Duplicates";
    }

    public static void main(String[] args) {

        System.out.println(new App().getGreeting());

        ArrayList<Integer> list = new ArrayList<>(List.of());
        ArrayList<Integer> list0 = new ArrayList<>(List.of(1));
        ArrayList<Integer> list1 = new ArrayList<>(List.of(1, 2, 3));
        ArrayList<String> list3 = new ArrayList<>(List.of("a", "b", "c"));
        ArrayList<Integer> list4 = new ArrayList<>(List.of(1,1,3,3,5,5));

        RemoveDuplicates.removeDuplicates(list); // Returns []
        RemoveDuplicates.removeDuplicates(list0); // Returns [1]
        RemoveDuplicates.removeDuplicates(list1); // Returns [1, 2, 3]
        RemoveDuplicates.removeDuplicates(list3); // Returns ["A", "B"]
        RemoveDuplicates.removeDuplicates(list4); // Returns [1, 3, 5]

    }
}
