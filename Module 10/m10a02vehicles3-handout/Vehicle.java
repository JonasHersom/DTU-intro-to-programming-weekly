class Minivan extends Vehicle{
    public int seats;

    public Minivan(String model, String plate, int seats) {
        super(model, plate);
        this.seats = seats;
    }

    public double getCostPerKm() {
        return this.seats * 5;
    }
}

class Truck extends Vehicle{
    public double maxLoad;

    public Truck(String model, String plate, double maxLoad) {
        super(model, plate);
        this.maxLoad = maxLoad;
    }

    public double getCostPerKm() {
        return this.maxLoad * 0.175;
    }
}

public abstract class Vehicle {
    private String model;
    private String plate;

    public Vehicle(String model, String plate) {
        this.model = model;
        this.plate = plate;
    }

    public String getModel() {
        return this.model;
    }
    public String getRegistrationPlate() {
        return this.plate;
    }

    abstract double getCostPerKm();

}