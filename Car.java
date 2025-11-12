class Car extends Vehicle implements Service {

    private int noOfDoors;

    public Car(String brand, String model, double price, int noOfDoors) {
        super(brand, model, price);
        this.noOfDoors = noOfDoors;
    }

    // Overriding abstract method
    @Override
    void displayInfo() {
        System.out.println("\n🚘 Car Details:");
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Price: ₹" + getPrice());
        System.out.println("No of Doors: " + noOfDoors);
    }

    // Implementing interface method
    @Override
    public void performService() {
        System.out.println(getBrand() + " " + getModel() + " car is being serviced 🚗");
    }

    // Overloading method
    public void start(String mode) {
        System.out.println(getBrand() + " " + getModel() + " is starting in " + mode + " mode.");
    }
}

