class Minivan implements Vehicle{
    private String model;
    private String plate;
    public int seats;

    public Minivan(String model, String plate, int seats) {
        this.model = model;
        this.plate = plate;
        this.seats = seats;
    }

    public String getModel(){
        return this.model;
    }
    public String getRegistrationPlate(){
        return this.plate;
    }
}

class Truck implements Vehicle{
    private String model;
    private String plate;
    public double maxLoad;

    public Truck(String model, String plate, double maxLoad) {
        this.model = model;
        this.plate = plate;
        this.maxLoad = maxLoad;
    }

    public String getModel(){
        return this.model;
    }
    public String getRegistrationPlate(){
        return this.plate;
    }
}

public interface Vehicle {
    public String getModel();
    public String getRegistrationPlate();
}