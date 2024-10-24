// Do not modify this file!

class Test04 {
    public static void main(String[] args) {
        var d1 = new Departure(10, 25, "Aarhus");
        var d2 = new Departure(9, 55, "Aalborg");
        var d3 = new Departure(13, 45, "Odense");
        var d4 = new Departure(17, 22, "Esbjerg");

        System.out.println(d1.description() + " is delayed by 10 minutes");
        System.out.println(d2.description() + " is delayed by 15 minutes");
        System.out.println(d3.description() + " is delayed by 14 minutes");
        System.out.println(d4.description() + " is delayed by 170 minutes");

        System.out.print("Applying delays...");
        d1.delay(10);
        d2.delay(15);
        d3.delay(14);
        d4.delay(170);
        System.out.println(" done.");

        System.out.println(d1.description());
        System.out.println(d2.description());
        System.out.println(d3.description());
        System.out.println(d4.description());
    }
}
