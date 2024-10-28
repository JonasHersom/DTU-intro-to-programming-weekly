// Do not modify this file!

class Test01 {
    public static void main(String[] args) {
        var m1 = new VendingMachine("DTU building 324", 1, 1);
        var m2 = new VendingMachine("Lyngby Station", 33, 12);
        var m3 = new VendingMachine("CPH Airport Gate A10", 0, 12);
        var machines = new VendingMachine[] {m1, m2, m3};

        TestUtils.serveCoffee(machines);

        System.out.println("Putting some cash in all machines...");
        m1.putCash(30);
        m2.putCash(5);
        m3.putCash(10);
        System.out.println(""); // Empty line for spacing

        TestUtils.serveCoffee(machines);

        TestUtils.retrieveCash(machines);

        TestUtils.serveCoffee(machines);
    }
}
