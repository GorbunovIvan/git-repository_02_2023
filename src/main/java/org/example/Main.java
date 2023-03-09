package org.example;

public class Main {
    public static void main(String[] args) {
        int id = new NewClass(5).getId();
        System.out.println(id);
    }

    public static void doSome1() {
        System.out.println("Doing something");
    }

    public static void some2() {
        System.out.println("first");
        System.out.println("second");
    }

    public static int intFunc() {
        return 2;
    }
}