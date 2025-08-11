package dev.ecommerce.helloworld;

public class MyFirstJavaProgram {

    /* This is my first java program.
    * This will print 'Hello World' as the output
    * This is an example of multi-line comments.
     */
    int a, b, c;         // Declares three ints, a, b, and c.
    int a1 = 10, b1 = 10;  // Example of initialization
    byte B = 22;         // initializes a byte type variable B.
    double pi = 3.14159; // declares and assigns a value of PI.
    char a2 = 'a';        // the char variable a iis initialized with value 'a'
    // Method example
    //A method is a named block of code you can call anytime.

    public void setValues() {
        a = 10;  // Assignments inside a method are valid
        b = 20;
        c = 30;
    }

    // Method example
    //A method is a named block of code you can call anytime.
    public void MyFirstJavaProgram() {
        a = 101;  // Assignments inside a method are valid
        b = 202;
        c = 303;
    }
    // Constructor example 
    //A constructor runs automatically when you create an object.
    //It has no return type and same name as the class.

    public MyFirstJavaProgram(int p, int q) {
        a = p;
        b = q;
    }
    // Initializer block
    //An initializer block runs every time an object is created, before the constructor.
    //It’s wrapped in { } and not part of a method.

    {
        a = 1000;
        b = 2000;
    }

    public static void main(String[] args) {
        // This is an example of single line comment
        /* This is also an example of single line comment. */
        System.out.println("Hello World");
        MyFirstJavaProgram ex = new MyFirstJavaProgram(1, 2);
        System.out.println("a = " + ex.a + ", b = " + ex.b);
        ex.setValues();
        System.out.println("a = " + ex.a + ", b = " + ex.b);
        ex.MyFirstJavaProgram();
        System.out.println("a = " + ex.a + ", b = " + ex.b);
    }
}
