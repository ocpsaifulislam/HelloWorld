package dev.ecommerce.helloworld;

public class TypeCastingExample {
//byte>short>char>int>long>float>double
//Widening type casting is also known as implicit type casting

    // Main driver method
    public static void main(String[] args) {
        // Define int variables
        int num1 = 5004;
        double num2 = 2.5;
        int sum = (int) (num1 + num2);
        // show output
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
    }
}
