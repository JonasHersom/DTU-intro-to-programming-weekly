// Do not modify this file!

class Test03 {
    public static void main(String[] args) {
        var d1 = new Departure(10, 25, "Aarhus");
        var d2 = new Departure(9, 33, "Roskilde");
        var d3 = new Departure(9, 55, "Aalborg");
        var d4 = new Departure(13, 45, "Odense");
        var d5 = new Departure(17, 22, "Esbjerg");

        // Note: to create the strings below, Java automatically calls the
        // methods d1.toString(), d2.toString(), etc.
        System.out.println("'" + d1.description()
                            + "' leaves before '" + d2.description()
                            + "': " + d1.leavesBefore(d2));
        System.out.println("'" + d1.description()
                            + "' leaves before '" + d3.description()
                            + "': " + d1.leavesBefore(d3));
        System.out.println("'" + d3.description()
                            + "' leaves before '" + d1.description()
                            + "': " + d3.leavesBefore(d1));
        System.out.println("'" + d2.description()
                            + "' leaves before '" + d3.description()
                            + "': " + d2.leavesBefore(d3));
        System.out.println("'" + d3.description()
                            + "' leaves before '" + d2.description()
                            + "': " + d3.leavesBefore(d2));
        System.out.println("'" + d1.description()
                            + "' leaves before '" + d4.description()
                            + "': " + d1.leavesBefore(d4));
        System.out.println("'" + d1.description()
                            + "' leaves before '" + d5.description()
                            + "': " + d1.leavesBefore(d5));
    }
}
