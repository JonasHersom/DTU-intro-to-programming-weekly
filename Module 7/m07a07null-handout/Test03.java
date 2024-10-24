// Do not modify this file!

class Test03 {
    public static void main(String[] args) {
        System.out.println("Testing: containsNull(int[][] arr)");
        System.out.println("");

        // Here, '(int[][])null' means: take a null value, and treat it as a
        // (missing) reference to an array of arrays of integers
        System.out.println("NullFinder.containsNull(null) returns: "
                           + NullFinder.containsNull((int[][])null));

        var arr1 = new int[][] {}; // Array containing zero arrays
        System.out.println("NullFinder.containsNull(arr1) returns: "
                           + NullFinder.containsNull(arr1));

        var arr2 = new int[][] { null };
        System.out.println("NullFinder.containsNull(arr2) returns: "
                           + NullFinder.containsNull(arr2));

        var arr3 = new int[][] { {1, 2, 3} };
        System.out.println("NullFinder.containsNull(arr3) returns: "
                           + NullFinder.containsNull(arr3));

        var arr4 = new int[][] { {1, 2, 3}, null };
        System.out.println("NullFinder.containsNull(arr4) returns: "
                           + NullFinder.containsNull(arr4));

        var arr5 = new int[][] { {1, 2, 3}, {4, 5, 6} };
        System.out.println("NullFinder.containsNull(arr5) returns: "
                           + NullFinder.containsNull(arr5));

        // Array containing two arrays, each one having length 0
        var arr6 = new int[][] { {}, {} };
        System.out.println("NullFinder.containsNull(arr6) returns: "
                           + NullFinder.containsNull(arr6));
    }
}
