// Do not modify this file!

class Test03 {
    public static void main(String[] args) {
        var c1 = new Car();
        c1.brand = "Ford";
        c1.model = "Fiesta";
        c1.numberPlate = "AF 54539";
        c1.color = "red";

        var c2 = new Car();
        c2.brand = "Ford";
        c2.model = "Fiesta";
        c2.numberPlate = "AF 11111";
        c2.color = "red";

        var c3 = new Car();
        c3.brand = "Ford";
        c3.model = "Fiesta";
        c3.numberPlate = "AF " + "1".repeat(5);
        c3.color = "red";

        var c4 = new Car();
        c4.brand = "Ford";
        c4.model = "Focus";
        c4.numberPlate = "AF 12345";
        c4.color = "red";

        System.out.println("Are c1 and c2 equal? "
                           + (Car.equals(c1, c2) ? "Yes" : "No"));
        System.out.println("Are c2 and c3 equal? "
                           + (Car.equals(c2, c3) ? "Yes" : "No"));
        System.out.println("Are c1 and c3 equal? "
                           + (Car.equals(c1, c3) ? "Yes" : "No"));
        System.out.println("Are c1 and c4 equal? "
                           + (Car.equals(c1, c4) ? "Yes" : "No"));
    }
}
