// Do not modify this file!

class Test02 {
    public static void main(String[] args) {
        var c1 = new Car();
        c1.brand = "Ford";
        c1.model = "Fiesta";
        c1.numberPlate = "AF 54539";
        c1.color = "red";
        
        var c2 = new Car();
        c2.brand = "FIAT";
        c2.model = "Topolino";
        c2.numberPlate = "EZ 13623";
        c2.color = "blue";

        System.out.println("Car 1: " + Car.description(c1));
        System.out.println("Car 2: " + Car.description(c2));
    }
}
