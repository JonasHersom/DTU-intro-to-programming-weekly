// Do not modify this file!

// The code below inspects the structure of a class or interface you should have
// defined for the solution of this assessment.  To this end, this code uses
// some methods defined in the file ClassTestUtils.java.  You do not need to
// fully understand the code below.

class Test99 {
    public static void main(String[] args) {
        ClassTestUtils.checkConstructorImplPublic(Car.class, new Class<?>[] {String.class, String.class, String.class, String.class});

        ClassTestUtils.checkMethodImplPublic(Car.class, "getBrand", new Class<?>[] {});
        ClassTestUtils.checkMethodImplPublic(Car.class, "getModel", new Class<?>[] {});
        ClassTestUtils.checkMethodImplPublic(Car.class, "getNumberPlate", new Class<?>[] {});
        ClassTestUtils.checkMethodImplPublic(Car.class, "getColor", new Class<?>[] {});
        ClassTestUtils.checkMethodImplPublic(Car.class, "description", new Class<?>[] {});
        ClassTestUtils.checkMethodImplPublic(Car.class, "equals", new Class<?>[] {Car.class});
        ClassTestUtils.checkMethodImplPublic(Car.class, "isAlike", new Class<?>[] {Car.class});

        ClassTestUtils.checkFieldsPrivate(Car.class);
    }
}
