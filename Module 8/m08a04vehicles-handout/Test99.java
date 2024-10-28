// Do not modify this file!

// The code below inspects the structure of a class or interface you should have
// defined for the solution of this assessment.  To this end, this code uses
// some methods defined in the file ClassTestUtils.java.  You do not need to
// fully understand the code below.

class Test99 {
    public static void main(String[] args) {
        ClassTestUtils.checkInterface(Minivan.class, "Vehicle");
        ClassTestUtils.checkConstructorImplPublic(Minivan.class, new Class<?>[] {String.class, String.class, int.class});
        ClassTestUtils.checkFieldImplPublic(Minivan.class, "seats");
        ClassTestUtils.checkFieldsPrivateExcept(Minivan.class, new String[] {"seats"});

        ClassTestUtils.checkInterface(Truck.class, "Vehicle");
        ClassTestUtils.checkConstructorImplPublic(Truck.class, new Class<?>[] {String.class, String.class, double.class});
        ClassTestUtils.checkFieldImplPublic(Truck.class, "maxLoad");
        ClassTestUtils.checkFieldsPrivateExcept(Truck.class, new String[] {"maxLoad"});
    }
}
