// Do not modify this file!

class Test04 {
    public static void main(String[] args) {
        var m1 = new VendingMachine("DTU building 324", 100, 100);
        var m2 = new VendingMachine("Lyngby Station", 10, 1);
        var m3 = new VendingMachine("CPH Airport Gate A10", 2, 12);
        var machines = new VendingMachine[] {m1, m2, m3};

        TestUtils.serveCoffee(machines);
        TestUtils.serveChocolate(machines);
        TestUtils.serveWienerMelange(machines);

        System.out.println("Putting some cash in all machines...");
        m1.putCash(10);
        m2.putCash(30);
        m3.putCash(50);
        System.out.println(""); // Empty line for spacing

        TestUtils.serveCoffee(machines);
        TestUtils.serveChocolate(machines);
        TestUtils.serveWienerMelange(machines);

        TestUtils.retrieveCash(machines);

        TestUtils.serveCoffee(machines);
        TestUtils.serveChocolate(machines);
        TestUtils.serveWienerMelange(machines);
    }
}
