// Do not modify this file!

class Test02 {
    public static void main(String[] args) {
        System.out.println("Testing: containsNull(Company c)");
        System.out.println("");

        var e1 = new Employee("Asta Astrup", 52);
        var e2 = new Employee("Niels Nielsen", 34);
        var e3 = new Employee("Luna Lund", 20);
        var e4 = new Employee(null, 20);

        // Here, '(Company)null' means: take a null value, and treat it as a
        // (missing) reference to a Company object
        System.out.println("NullFinder.containsNull(null) returns: "
                           + NullFinder.containsNull((Company)null));

        var c1 = new Company("Black Mesa A/S", new Employee[] {e1, e2});
        System.out.println("NullFinder.containsNull(c1) returns: "
                           + NullFinder.containsNull(c1));

        var c2 = new Company("Black Mesa A/S", new Employee[] {});
        System.out.println("NullFinder.containsNull(c2) returns: "
                           + NullFinder.containsNull(c2));

        var c3 = new Company(null, new Employee[] {e3});
        System.out.println("NullFinder.containsNull(c3) returns: "
                           + NullFinder.containsNull(c3));

        var c4 = new Company("Black Mesa A/S", null);
        System.out.println("NullFinder.containsNull(c4) returns: "
                           + NullFinder.containsNull(c4));

        var c5 = new Company("Black Mesa A/S", new Employee[] {e1, null, e2});
        System.out.println("NullFinder.containsNull(c5) returns: "
                           + NullFinder.containsNull(c5));

        var c6 = new Company("Black Mesa A/S", new Employee[] {e1, e4});
        System.out.println("NullFinder.containsNull(c6) returns: "
                           + NullFinder.containsNull(c6));
    }
}
