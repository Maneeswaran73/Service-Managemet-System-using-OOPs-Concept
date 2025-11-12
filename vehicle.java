import java.util.Scanner;

abstract class Vehicle {
    private String brand;
    private String model;
    private double price;

    // Constructor
    public Vehicle(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Getters & Setters (Encapsulation)
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Abstract Method
    abstract void displayInfo();

    // Common method
    public void start() {
        System.out.println(brand + " " + model + " is starting...");
    }
}
