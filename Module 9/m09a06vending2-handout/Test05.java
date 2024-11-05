// Do not modify this file!

class Test05 {
    public static void main(String[] args) {
        var m1 = new AdvancedVendingMachine("DTU building 324", 100, 100);
        var m2 = new AdvancedVendingMachine("Lyngby Station", 10, 9);
        var m3 = new AdvancedVendingMachine("CPH Airport Gate A10", 25, 12);
        var machines = new AdvancedVendingMachine[] {m1, m2, m3};

        TestUtils.serveCoffees(machines, 5);
        TestUtils.serveChocolates(machines, 6);
        TestUtils.serveWienerMelanges(machines, 7);

        System.out.println("Putting some cash in all machines...");
        m1.putCash(90);
        m2.putCash(210);
        m3.putCash(350);
        System.out.println(""); // Empty line for spacing

        TestUtils.serveCoffees(machines, 5);
        TestUtils.serveChocolates(machines, 6);
        TestUtils.serveWienerMelanges(machines, 7);

        TestUtils.retrieveCash(machines);

        TestUtils.serveCoffees(machines, 5);
        TestUtils.serveChocolates(machines, 6);
        TestUtils.serveWienerMelanges(machines, 7);
    }
}
