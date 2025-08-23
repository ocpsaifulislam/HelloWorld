package dev.operators.ecom;

public class LogicalExample {

    public static void main(String[] args) {
        boolean A = true, B = false;

        System.out.println("A && B: " + (A && B)); // false
        System.out.println("A || B: " + (A || B)); // true
        System.out.println("!A: " + (!A)); // false
        System.out.println("!B: " + (!B)); // true
    }
}
