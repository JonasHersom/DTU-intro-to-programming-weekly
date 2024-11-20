class Minivan extends Vehicle{
    public int seats;

    public Minivan(String model, String plate, int seats) {
        super(model, plate);
        this.seats = seats;
    }
}

class Truck extends Vehicle{
    public double maxLoad;

    public Truck(String model, String plate, double maxLoad) {
        super(model, plate);
        this.maxLoad = maxLoad;
    }
}

public class Vehicle {
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

}