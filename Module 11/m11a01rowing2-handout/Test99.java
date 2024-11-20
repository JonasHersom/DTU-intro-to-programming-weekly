// Do not modify this file!

// The code below inspects the structure of a class or interface you should have
// defined for the solution of this assessment.  To this end, this code uses
// some methods defined in the file ClassTestUtils.java.  You do not need to
// fully understand the code below.

class Test99 {
    public static void main(String[] args) {
        ClassTestUtils.checkConstructorImplPublic(Boat.class, new Class<?>[] {int.class});
        ClassTestUtils.checkMethodImplPublic(Boat.class, "print", new Class<?>[] {});
        ClassTestUtils.checkMethodImplPublic(Boat.class, "isFull", new Class<?>[] {});
        ClassTestUtils.checkMethodImplPublic(Boat.class, "assignMember", new Class<?>[] {Member.class});
        ClassTestUtils.checkFieldsPrivate(Boat.class);
    }
}
