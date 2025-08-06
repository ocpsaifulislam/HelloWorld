package dev.ecommerce.helloworld;

public class HelloWorld {

    // ✅ Instance Variable
    private String message;

    // ✅ Constructor to initialize the instance variable
    public HelloWorld(String msg) {
        this.message = msg;
    }

    // ✅ Instance Method to display the message
    public void displayMessage() {
        System.out.println(message);
    }

    public static void main(String[] args) {
        // ✅ Create an object of HelloWorld
        HelloWorld hello = new HelloWorld("Hello World!");

        // ✅ Call instance method
        hello.displayMessage();

        // Loop from 0 to 19
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }
    }
}
