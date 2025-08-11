package dev.ecommerce.helloworld;

public class DataTypeCarExample implements Vehicle {

    private final String brand;

    public DataTypeCarExample(String brand) {
        this.brand = brand;
    }

    @Override
    public void start() {
        System.out.println(brand + " is starting...");
    }

    @Override
    public void stop() {
        System.out.println(brand + " has stopped.");
    }

    public static void main(String[] args) {
        DataTypeCarExample v = new DataTypeCarExample("Toyota");
        v.start();
        v.stop();
    }

}
