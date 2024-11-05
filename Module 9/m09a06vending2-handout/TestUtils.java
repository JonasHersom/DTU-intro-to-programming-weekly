class TestUtils {
    public static void serveCoffee(VendingMachine[] machines) {
        System.out.println("Trying to get coffee from all machines...");
        for (var m: machines) {
            var descr = m.description();
            var result = m.serveCoffee();
            System.out.println("  - " + descr + ": " + result);
            if (result) {
                System.out.println("    --> " + m.description());
            }
        }
        System.out.println(""); // Empty line for spacing
    }

    public static void serveChocolate(VendingMachine[] machines) {
        System.out.println("Trying to get chocolate from all machines...");
        for (var m: machines) {
            var descr = m.description();
            var result = m.serveChocolate();
            System.out.println("  - " + descr + ": " + result);
            if (result) {
                System.out.println("    --> " + m.description());
            }
        }
        System.out.println(""); // Empty line for spacing
    }

    public static void serveWienerMelange(VendingMachine[] machines) {
        System.out.println("Trying to get Wiener melange from all machines...");
        for (var m: machines) {
            var descr = m.description();
            var result = m.serveWienerMelange();
            System.out.println("  - " + descr + ": " + result);
            if (result) {
                System.out.println("    --> " + m.description());
            }
        }
        System.out.println(""); // Empty line for spacing
    }

    public static void retrieveCash(VendingMachine[] machines) {
        System.out.println("Trying to get cash from all machines...");
        for (var m: machines) {
            var descr = m.description();
            var result = m.retrieveCash();
            System.out.println("  - " + descr + ": " + result);
            if (result > 0) {
                System.out.println("    --> " + m.description());
            }
        }
        System.out.println(""); // Empty line for spacing
    }

    public static void serveCoffees(AdvancedVendingMachine[] machines, int n) {
        System.out.println("Trying to get " + n + " coffees from all machines...");
        for (var m: machines) {
            var descr = m.description();
            var result = m.serveCoffees(n);
            System.out.println("  - " + descr);
            System.out.println("    Got " + result + " coffees");
            System.out.println("    --> " + m.description());
        }
        System.out.println(""); // Empty line for spacing
    }

    public static void serveChocolates(AdvancedVendingMachine[] machines, int n) {
        System.out.println("Trying to get " + n + " chocolates from all machines...");
        for (var m: machines) {
            var descr = m.description();
            var result = m.serveChocolates(n);
            System.out.println("  - " + descr);
            System.out.println("    Got " + result + " chocolates");
            System.out.println("    --> " + m.description());
        }
        System.out.println(""); // Empty line for spacing
    }

    public static void serveWienerMelanges(AdvancedVendingMachine[] machines, int n) {
        System.out.println("Trying to get " + n + " Wiener melanges from all machines...");
        for (var m: machines) {
            var descr = m.description();
            var result = m.serveWienerMelanges(n);
            System.out.println("  - " + descr);
            System.out.println("    Got " + result + " Wiener melanges");
            System.out.println("    --> " + m.description());
        }
        System.out.println(""); // Empty line for spacing
    }
}
