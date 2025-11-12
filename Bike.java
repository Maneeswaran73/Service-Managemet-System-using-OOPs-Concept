class Bike extends Vehicle implements Service {

    private boolean hasDiscBrake;

    public Bike(String brand, String model, double price, boolean hasDiscBrake) {
        super(brand, model, price);
        this.hasDiscBrake = hasDiscBrake;
    }

    @Override
    void displayInfo() {
        System.out.println("\n🏍️ Bike Details:");
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Price: ₹" + getPrice());
        System.out.println("Disc Brake: " + (hasDiscBrake ? "Yes" : "No"));
    }

    @Override
    public void performService() {
        System.out.println(getBrand() + " " + getModel() + " bike is being serviced 🏍️");
    }
}

