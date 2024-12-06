// Do not modify this file!

// The code below inspects the structure of a class or interface you should have
// defined for the solution of this assessment.  To this end, this code uses
// some methods defined in the file ClassTestUtils.java.  You do not need to
// fully understand the code below.

class Test99 {
    public static void main(String[] args) {
        ClassTestUtils.checkConstructorImplPublic(Monster.class, new Class<?>[] {String.class, String.class, int.class, double.class, double.class});
        ClassTestUtils.checkMethodImplPublic(Monster.class, "getSymbol", new Class<?>[] {});
        ClassTestUtils.checkMethodImplPublic(Monster.class, "curseAll", new Class<?>[] {});
        ClassTestUtils.checkMethodImplPublic(Monster.class, "uncurseAll", new Class<?>[] {});
        ClassTestUtils.checkFieldsPrivate(Monster.class);

        ClassTestUtils.checkSuperclass(Wumpus.class, Monster.class);
        ClassTestUtils.checkConstructorImplPublic(Wumpus.class, new Class<?>[] {String.class});
        ClassTestUtils.checkFieldsPrivate(Wumpus.class);

        ClassTestUtils.checkSuperclass(Owlbear.class, Monster.class);
        ClassTestUtils.checkConstructorImplPublic(Owlbear.class, new Class<?>[] {String.class});
        ClassTestUtils.checkFieldsPrivate(Owlbear.class);

        ClassTestUtils.checkSuperclass(Demogorgon.class, Monster.class);
        ClassTestUtils.checkConstructorImplPublic(Demogorgon.class, new Class<?>[] {String.class});
        ClassTestUtils.checkFieldsPrivate(Demogorgon.class);

        ClassTestUtils.checkSuperclass(Thing.class, Monster.class);
        ClassTestUtils.checkConstructorImplPublic(Thing.class, new Class<?>[] {String.class});
        ClassTestUtils.checkFieldsPrivate(Thing.class);
    }
}
