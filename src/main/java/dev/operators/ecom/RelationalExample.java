package dev.operators.ecom;

public class RelationalExample {

    public static void main(String[] args) {
        int A = 10, B = 5;

        System.out.println("A == B: " + (A == B)); // false
        System.out.println("A != B: " + (A != B)); // true
        System.out.println("A > B: " + (A > B));   // true
        System.out.println("A < B: " + (A < B));   // false
        System.out.println("A >= B: " + (A >= B)); // true
        System.out.println("A <= B: " + (A <= B)); // false
    }
}
