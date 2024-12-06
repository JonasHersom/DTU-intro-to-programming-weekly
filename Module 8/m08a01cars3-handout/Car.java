class Car {
    private String brand;
    private String model;
    private String plate;
    private String color;

    public Car(String brand, String model, String plate, String color) {
        this.brand = brand;
        this.model = model;
        this.plate = plate;
        this.color = color;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public String getNumberPlate() {
        return this.plate;
    }

    public String getColor() {
        return this.color;
    }

    public String description() {
        return brand + " " + model + ", " + color + " [" + plate + "]";
    }

    public boolean equals(Car other) {
        if (this.brand.equals(other.brand) && this.model.equals(other.model) &&
        this.plate.equals(other.plate) && this.color.equals(other.color)) {
            return true;
        } else return false;
        
    }

    public boolean isAlike(Car other) {
        if (this.brand.equals(other.brand) && this.model.equals(other.model) &&
        this.color.equals(other.color)) {
            return true;
        } else return false;
    }

}
