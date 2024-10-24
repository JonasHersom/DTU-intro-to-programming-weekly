// Do not modify this file!

class Test01 {
    public static void main(String[] args) {
        System.out.println("Testing: containsNull(int[] arr)");
        System.out.println("");

        // Here, '(int[])null' means: take a null value, and treat it as a
        // (missing) reference to an array of integers
        System.out.println("NullFinder.containsNull(null) returns: "
                           + NullFinder.containsNull((int[])null));

        var arr1 = new int[] {}; // Array of length 0
        System.out.println("NullFinder.containsNull(arr1) returns: "
                           + NullFinder.containsNull(arr1));

        var arr2 = new int[] { 10, 20, 30 };
        System.out.println("NullFinder.containsNull(arr2) returns: "
                           + NullFinder.containsNull(arr2));
    }
}
