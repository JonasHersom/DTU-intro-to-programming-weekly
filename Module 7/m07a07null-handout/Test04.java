// Do not modify this file!

class Test04 {
    public static void main(String[] args) {
        System.out.println("Testing: containsNull(String[][] arr)");
        System.out.println("");

        // Here, '(String[][])null' means: take a null value, and treat it as a
        // (missing) reference to an array of arrays of strings
        System.out.println("NullFinder.containsNull(null) returns: "
                           + NullFinder.containsNull((String[][])null));

        var arr1 = new String[][] {}; // Array containing zero arrays
        System.out.println("NullFinder.containsNull(arr1) returns: "
                           + NullFinder.containsNull(arr1));

        var arr2 = new String[][] { null };
        System.out.println("NullFinder.containsNull(arr2) returns: "
                           + NullFinder.containsNull(arr2));

        var arr3 = new String[][] { {"a", "b", "c"} };
        System.out.println("NullFinder.containsNull(arr3) returns: "
                           + NullFinder.containsNull(arr3));

        var arr4 = new String[][] { {"a", "b", null} };
        System.out.println("NullFinder.containsNull(arr4) returns: "
                           + NullFinder.containsNull(arr4));

        var arr5 = new String[][] { {"a", "b", "c"}, null };
        System.out.println("NullFinder.containsNull(arr5) returns: "
                           + NullFinder.containsNull(arr5));

        var arr6 = new String[][] { {"a", "b", "c"}, {"d", "e", "f"} };
        System.out.println("NullFinder.containsNull(arr6) returns: "
                           + NullFinder.containsNull(arr6));

        var arr7 = new String[][] { {"a", "b", "c"}, {null, "e", "f"} };
        System.out.println("NullFinder.containsNull(arr7) returns: "
                           + NullFinder.containsNull(arr7));

        // Array containing two arrays, each one having length 0
        var arr8 = new String[][] { {}, {} };
        System.out.println("NullFinder.containsNull(arr8) returns: "
                           + NullFinder.containsNull(arr8));
    }
}
