package dev.operators.ecom;

public class BitwiseExample {

    public static void main(String[] args) {
        int A = 60; // 0011 1100
        int B = 13; // 0000 1101

        System.out.println("A & B: " + (A & B)); // 12  (0000 1100)
        System.out.println("A | B: " + (A | B)); // 61  (0011 1101)
        System.out.println("A ^ B: " + (A ^ B)); // 49  (0011 0001)
        System.out.println("~A: " + (~A)); // -61  (1100 0011 in 2's complement)
        System.out.println("A << 2: " + (A << 2)); // 240 (1111 0000)
        System.out.println("A >> 2: " + (A >> 2)); // 15  (0000 1111)
        System.out.println("A >>> 2: " + (A >>> 2)); // 15  (0000 1111)
    }
}
