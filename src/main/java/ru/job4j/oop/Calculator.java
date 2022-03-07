package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return x - y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int a) {
        return a / x;
    }

    public int sumAllOperation(int a) {
        return sum(a) + minus(a) + multiply(a) + divide(a);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(sum(5));
        System.out.println(minus(4));
        System.out.println(calculator.multiply(3));
        System.out.println(calculator.divide(10));
        System.out.println(calculator.sumAllOperation(5));
    }
}
