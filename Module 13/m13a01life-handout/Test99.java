// Do not modify this file!

// The code below inspects the structure of a class or interface you should have
// defined for the solution of this assessment.  To this end, this code uses
// some methods defined in the file ClassTestUtils.java.  You do not need to
// fully understand the code below.

class Test99 {
    public static void main(String[] args) {
        ClassTestUtils.checkConstructorImplPublic(Life.class, new Class<?>[] {int.class, int.class});
        ClassTestUtils.checkMethodImplPublic(Life.class, "setCell", new Class<?>[] {int.class, int.class, boolean.class});
        ClassTestUtils.checkMethodImplPublic(Life.class, "display", new Class<?>[] {});
        ClassTestUtils.checkMethodImplPublic(Life.class, "step", new Class<?>[] {});
        ClassTestUtils.checkFieldsPrivate(Life.class);
    }
}
