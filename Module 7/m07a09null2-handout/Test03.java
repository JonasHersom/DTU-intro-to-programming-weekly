// Do not modify this file!

class Test03 {
    public static void main(String[] args) {
        System.out.println("Testing: containsNull(Company[] arr)");
        System.out.println("");

        var e1 = new Employee("Asta Astrup", 52);
        var e2 = new Employee("Niels Nielsen", 34);
        var e3 = new Employee("Luna Lund", 20);
        var e4 = new Employee(null, 20);

        var c1 = new Company("Weyland-Yutani Corporation",
                             new Employee[] {e1, e2});
        var c2 = new Company("Weyland-Yutani Corporation",
                             new Employee[] {});
        var c3 = new Company("Weyland-Yutani Corporation",
                             new Employee[] {e1, e2, e3});
        var c4 = new Company("Weyland-Yutani Corporation",
                             new Employee[] {e1, null, e3});
        var c5 = new Company("Weyland-Yutani Corporation",
                             new Employee[] {e1, e2, e4});
        var c6 = new Company("Weyland-Yutani Corporation",
                             null);
        var c7 = new Company(null,
                             new Employee[] {e1, e2, e3});

        // Here, '(Company[])null' means: take a null value, and treat it as a
        // (missing) reference to an array of Company objects
        System.out.println("NullFinder.containsNull(null) returns: "
                           + NullFinder.containsNull((Company[])null));

        var arr1 = new Company[] {c1, c2, c3};
        System.out.println("NullFinder.containsNull(arr1) returns: "
                           + NullFinder.containsNull(arr1));

        var arr2 = new Company[] {};
        System.out.println("NullFinder.containsNull(arr2) returns: "
                           + NullFinder.containsNull(arr2));

        var arr3 = new Company[] {c1, null, c3};
        System.out.println("NullFinder.containsNull(arr3) returns: "
                           + NullFinder.containsNull(arr3));

        var arr4 = new Company[] {c1, c2, c4};
        System.out.println("NullFinder.containsNull(arr4) returns: "
                           + NullFinder.containsNull(arr4));

        var arr5 = new Company[] {c1, c2, c6};
        System.out.println("NullFinder.containsNull(arr5) returns: "
                           + NullFinder.containsNull(arr5));

        var arr6 = new Company[] {c1, c2, c5};
        System.out.println("NullFinder.containsNull(arr6) returns: "
                           + NullFinder.containsNull(arr6));

        var arr7 = new Company[] {c1, c2, c7};
        System.out.println("NullFinder.containsNull(arr7) returns: "
                           + NullFinder.containsNull(arr7));
    }
}
