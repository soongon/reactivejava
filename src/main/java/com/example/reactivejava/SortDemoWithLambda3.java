package com.example.reactivejava;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortDemoWithLambda3 {
    public static void main(String[] args) {
        List<String> listOfString = Arrays.asList("red", "blue", "white", "pink", "black");
        System.out.println(listOfString);

        listOfString.sort((o1, o2) -> o1.length() - o2.length());

        System.out.println(listOfString);
    }
}
