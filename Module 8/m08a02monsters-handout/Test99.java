// Do not modify this file!

// The code below inspects the structure of a class or interface you should have
// defined for the solution of this assessment.  To this end, this code uses
// some methods defined in the file ClassTestUtils.java.  You do not need to
// fully understand the code below.

class Test99 {
    public static void main(String[] args) {
        ClassTestUtils.checkConstructorImplPublic(Monster.class, new Class<?>[] {String.class});

        ClassTestUtils.checkMethodImplPublic(Monster.class, "getDescription", new Class<?>[] {});
        ClassTestUtils.checkMethodImplPublic(Monster.class, "getHealth", new Class<?>[] {});
        ClassTestUtils.checkMethodImplPublic(Monster.class, "heal", new Class<?>[] {int.class});
        ClassTestUtils.checkMethodImplPublic(Monster.class, "hit", new Class<?>[] {int.class});
        ClassTestUtils.checkMethodImplPublic(Monster.class, "burn", new Class<?>[] {int.class});
        ClassTestUtils.checkMethodImplPublic(Monster.class, "isDead", new Class<?>[] {});

        ClassTestUtils.checkFieldsPrivate(Monster.class);
    }
}
