// Do not modify this file!

class Test02 {
    public static void main(String[] args) {
        System.out.println("Testing: containsNull(String[] arr)");
        System.out.println("");

        // Here, '(String[])null' means: take a null value, and treat it as a
        // (missing) reference to an array of strings
        System.out.println("NullFinder.containsNull(null) returns: "
                           + NullFinder.containsNull((String[])null));

        var arr1 = new String[] {}; // Array of length 0
        System.out.println("NullFinder.containsNull(arr1) returns: "
                           + NullFinder.containsNull(arr1));

        var arr2 = new String[] { "This", "is", "a", "test" };
        System.out.println("NullFinder.containsNull(arr2) returns: "
                           + NullFinder.containsNull(arr2));

        var arr3 = new String[] { "This", null, "a", "test" };
        System.out.println("NullFinder.containsNull(arr3) returns: "
                           + NullFinder.containsNull(arr3));
    }
}
