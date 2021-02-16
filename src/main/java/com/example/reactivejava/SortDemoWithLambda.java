package com.example.reactivejava;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortDemoWithLambda {
    public static void main(String[] args) {

        List<String>  listOfString = Arrays.asList("red", "blue", "white", "pink", "black");
        System.out.println(listOfString);
        listOfString.sort(new MyComparator());

        System.out.println(listOfString);
    }
}

class MyComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}