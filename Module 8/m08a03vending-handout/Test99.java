// Do not modify this file!

// The code below inspects the structure of a class or interface you should have
// defined for the solution of this assessment.  To this end, this code uses
// some methods defined in the file ClassTestUtils.java.  You do not need to
// fully understand the code below.

class Test99 {
    public static void main(String[] args) {
        ClassTestUtils.checkConstructorImplPublic(VendingMachine.class, new Class<?>[] {String.class, int.class, int.class});

        ClassTestUtils.checkMethodImplPublic(VendingMachine.class, "serveCoffee", new Class<?>[] {});
        ClassTestUtils.checkMethodImplPublic(VendingMachine.class, "serveChocolate", new Class<?>[] {});
        ClassTestUtils.checkMethodImplPublic(VendingMachine.class, "serveWienerMelange", new Class<?>[] {});
        ClassTestUtils.checkMethodImplPublic(VendingMachine.class, "putCash", new Class<?>[] {int.class});
        ClassTestUtils.checkMethodImplPublic(VendingMachine.class, "retrieveCash", new Class<?>[] {});
        ClassTestUtils.checkMethodImplPublic(VendingMachine.class, "description", new Class<?>[] {});

        ClassTestUtils.checkFieldsPrivate(VendingMachine.class);
    }
}