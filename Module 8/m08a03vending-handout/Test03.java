// Do not modify this file!

class Test03 {
    public static void main(String[] args) {
        var m1 = new VendingMachine("DTU building 324", 10, 1);
        var m2 = new VendingMachine("Lyngby Station", 42, 12);
        var m3 = new VendingMachine("CPH Airport Gate A10", 0, 1);
        var machines = new VendingMachine[] {m1, m2, m3};

        TestUtils.serveWienerMelange(machines);

        System.out.println("Putting some cash in all machines...");
        m1.putCash(10);
        m2.putCash(45);
        m3.putCash(40);
        System.out.println(""); // Empty line for spacing

        TestUtils.serveWienerMelange(machines);

        TestUtils.retrieveCash(machines);

        TestUtils.serveWienerMelange(machines);
    }
}
