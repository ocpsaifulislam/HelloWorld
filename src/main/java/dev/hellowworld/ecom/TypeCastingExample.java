package dev.ecommerce.helloworld;

public class TypeCastingExample {
//byte>short>char>int>long>float>double
//Widening type casting is also known as implicit type casting

    // Main driver method
    public static void main(String[] args) {
        // Define int variables
        int num1 = 5004;
        double num2 = 2.5;
        double sum = (num1 + num2);
        // show output
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);

        // Define int variable
        int num = 5004;
        // Type casting int to double
        double doubleNum = (double) num;
        // show output
        System.out.println("The value of " + num + " after converting to the double is " + doubleNum);
        // Type casting double to int
        int convertedInt = (int) doubleNum;
        // show output
        System.out.println("The value of " + doubleNum + " after converting to the int again is " + convertedInt);

    }
}
