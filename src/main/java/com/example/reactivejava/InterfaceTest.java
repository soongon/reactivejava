package com.example.reactivejava;

@FunctionalInterface
public interface InterfaceTest {

    int MY_INT = 5;

    int mul(int a, int b);

    default int add(int a, int b) {
        test();
        return a + b;
    }
    private void test() {
        System.out.println("hello"); // IO
    }
    static int sub(int a, int b) {
        return a - b;
    }

}

