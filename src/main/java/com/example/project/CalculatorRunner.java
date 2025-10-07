package com.example.project;

public class CalculatorRunner {
    public static void main(String[] args) {

        //test your program here
        //1. create an instance of the calculator class
        Calculator calc1 = new Calculator("Skibidi");
        //2. call any methods of that class to test
        System.out.println(calc1.performOperation("*", 1, 3));
        System.out.println(calc1.divisibleBy(4, 3));
        System.out.println(calc1.coordinatePair(4, 3));
        System.out.println(calc1.absoluteValue(4, 4));
        System.out.println(calc1.average(5, 8));
        System.out.println(calc1.info());
    }
}
