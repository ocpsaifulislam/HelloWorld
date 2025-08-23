package dev.ecommerce.helloworld;

import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        // Creating an object of Scanner class
        Scanner sc = new Scanner(System.in);

        // Reading an Integer Input
        System.out.print("Input an integer value: ");
        int int_num = sc.nextInt();

        System.out.print("The input is : " + int_num);
    }
}
