// Do not modify this file!

class Test02 {
    public static void main(String[] args) {
        var m1 = new VendingMachine("DTU building 324", 1, 1);
        var m2 = new VendingMachine("Lyngby Station", 1, 0);
        var m3 = new VendingMachine("CPH Airport Gate A10", 22, 13);
        var machines = new VendingMachine[] {m1, m2, m3};

        TestUtils.serveChocolate(machines);

        System.out.println("Putting some cash in all machines...");
        m1.putCash(0);
        m2.putCash(15);
        m3.putCash(20);
        System.out.println(""); // Empty line for spacing

        TestUtils.serveChocolate(machines);

        TestUtils.retrieveCash(machines);

        TestUtils.serveChocolate(machines);
    }
}
