package dev.ecommerce.helloworld;

public class MyFirstJavaProgram {

    /* This is my first java program.This will print 'Hello World' as the output*/
    public static void main(String[] args) {
        MyFirstJavaProgram program = new MyFirstJavaProgram();
//        double result = program.divide(100, 0);
//        System.out.println(result);

        try {
            double result = program.divide(100, 0);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private double divide(int dividend, int divisor) throws IllegalArgumentException {
        // if divisor is 0 throw an exception
        if (divisor == 0) {
            throw new IllegalArgumentException("divisor cannot be zero");
        }
        return (double) dividend / divisor; // returns the result of the division as double

    }
}
