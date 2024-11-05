// Do not modify this file!

class Test01 {
    public static void main(String[] args) {
        var vehicles = new Vehicle[] {
            new Vehicle("VEB Sachsenring Trabant P 50", "XY 12 3143"),
            new Vehicle("Citroen 2CV", "AB 33 1234"),
            new Vehicle("Brems No. 1 Type A", "ZZ 11 3411")
        };

        System.out.println("Vehicles:");
        for (var v: vehicles) {
            System.out.println("  - " + v.getModel()
                                + " [" + v.getRegistrationPlate() + "]");
        }
    }
}
