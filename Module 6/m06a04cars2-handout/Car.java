class Car {
    String brand;
    String model;
    String numberPlate;
    String color;

    Car(String brand, String model, String numberPlate, String color) {
        this.brand = brand;
        this.model = model;
        this.numberPlate = numberPlate;
        this.color = color;

    }

    String description() {
        return this.brand + " " + this.model + ", " + this.color + " [" + this.numberPlate + "]";
    }

    boolean equals(Car other) {
        if (this.brand.equals(other.brand) && this.model.equals(other.model) &&
        this.numberPlate.equals(other.numberPlate) && this.color.equals(other.color)) {
            return true;
        } else return false;
        
    }

    boolean isAlike(Car other) {
        if (this.brand.equals(other.brand) && this.model.equals(other.model) &&
        this.color.equals(other.color)) {
            return true;
        } else return false;
    }
}
