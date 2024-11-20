// Do not modify this file!

// The code below inspects the structure of a class or interface you should have
// defined for the solution of this assessment.  To this end, this code uses
// some methods defined in the file ClassTestUtils.java.  You do not need to
// fully understand the code below.

class Test99 {
    public static void main(String[] args) {
        ClassTestUtils.checkConstructorImplPublic(Vehicle.class, new Class<?>[] {String.class, String.class});
        ClassTestUtils.checkMethodImplPublic(Vehicle.class, "getModel", new Class<?>[] {});
        ClassTestUtils.checkMethodImplPublic(Vehicle.class, "getRegistrationPlate", new Class<?>[] {});
        ClassTestUtils.checkMethodImplPublic(Vehicle.class, "getCostPerKm", new Class<?>[] {});
        ClassTestUtils.checkFieldsPrivate(Vehicle.class);

        ClassTestUtils.checkSuperclass(Minivan.class, Vehicle.class);
        ClassTestUtils.checkConstructorImplPublic(Minivan.class, new Class<?>[] {String.class, String.class, int.class});
        ClassTestUtils.checkFieldImplPublic(Minivan.class, "seats");
        ClassTestUtils.checkFieldsPrivateExcept(Minivan.class, new String[] {"seats"});
        ClassTestUtils.checkMethodInherited(Minivan.class, "getModel", new Class<?>[] {});
        ClassTestUtils.checkMethodInherited(Minivan.class, "getRegistrationPlate", new Class<?>[] {});
        ClassTestUtils.checkMethodImplPublic(Minivan.class, "getCostPerKm", new Class<?>[] {});

        ClassTestUtils.checkSuperclass(Truck.class, Vehicle.class);
        ClassTestUtils.checkConstructorImplPublic(Truck.class, new Class<?>[] {String.class, String.class, double.class});
        ClassTestUtils.checkFieldImplPublic(Truck.class, "maxLoad");
        ClassTestUtils.checkFieldsPrivateExcept(Truck.class, new String[] {"maxLoad"});
        ClassTestUtils.checkMethodInherited(Truck.class, "getModel", new Class<?>[] {});
        ClassTestUtils.checkMethodInherited(Truck.class, "getRegistrationPlate", new Class<?>[] {});
        ClassTestUtils.checkMethodImplPublic(Truck.class, "getCostPerKm", new Class<?>[] {});
    }
}
