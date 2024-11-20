class TestUtils {
    public static void testPointsEqual(UglyPoint3D p1, UglyPoint3D p2,
                                       UglyPoint3D p3) {
        System.out.print("Is point 1 equal to point 2? ");
        System.out.println(p1.equals(p2));
        System.out.print("Is point 2 equal to point 1? ");
        System.out.println(p2.equals(p1));
        System.out.print("Is point 1 equal to point 3? ");
        System.out.println(p1.equals(p3));
        System.out.print("Is point 3 equal to point 1? ");
        System.out.println(p3.equals(p1));
        System.out.print("Is point 2 equal to point 3? ");
        System.out.println(p2.equals(p3));
        System.out.print("Is point 3 equal to point 2? ");
        System.out.println(p3.equals(p2));
    }

    public static void testToString(Object p1, Object p2, Object p3) {
        System.out.println("Method .toString() of object 1 produces: " + p1);
        System.out.println("Method .toString() of object 2 produces: " + p2);
        System.out.println("Method .toString() of object 3 produces: " + p3);
    }
}
