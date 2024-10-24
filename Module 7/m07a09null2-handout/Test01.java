// Do not modify this file!

class Test01 {
    public static void main(String[] args) {
        System.out.println("Testing: containsNull(Employee[] arr)");
        System.out.println("");

        // Here, '(Employee[])null' means: take a null value, and treat it as a
        // (missing) reference to an array of Employees
        System.out.println("NullFinder.containsNull(null) returns: "
                           + NullFinder.containsNull((Employee[])null));

        var arr1 = new Employee[] {}; // Array of length 0
        System.out.println("NullFinder.containsNull(arr1) returns: "
                           + NullFinder.containsNull(arr1));

        var arr2 = new Employee[] { new Employee("Niels Nielsen", 33),
                                    null };
        System.out.println("NullFinder.containsNull(arr2) returns: "
                           + NullFinder.containsNull(arr2));

        var arr3 = new Employee[] { new Employee("Niels Nielsen", 33),
                                    new Employee("Asta Astrup", 21) };
        System.out.println("NullFinder.containsNull(arr3) returns: "
                           + NullFinder.containsNull(arr3));

        var arr4 = new Employee[] { new Employee("Niels Nielsen", 33),
                                    new Employee(null, 21) };
        System.out.println("NullFinder.containsNull(arr4) returns: "
                           + NullFinder.containsNull(arr4));
    }
}
