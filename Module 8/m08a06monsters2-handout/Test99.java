// Do not modify this file!

// The code below inspects the structure of a class or interface you should have
// defined for the solution of this assessment.  To this end, this code uses
// some methods defined in the file ClassTestUtils.java.  You do not need to
// fully understand the code below.

class Test99 {
    public static void main(String[] args) {
        ClassTestUtils.checkInterface(Wumpus.class, "Monster");
        ClassTestUtils.checkConstructorImplPublic(Wumpus.class, new Class<?>[] {String.class});
        ClassTestUtils.checkFieldsPrivate(Wumpus.class);

        ClassTestUtils.checkInterface(Owlbear.class, "Monster");
        ClassTestUtils.checkConstructorImplPublic(Owlbear.class, new Class<?>[] {String.class});
        ClassTestUtils.checkFieldsPrivate(Owlbear.class);

        ClassTestUtils.checkInterface(Demogorgon.class, "Monster");
        ClassTestUtils.checkConstructorImplPublic(Demogorgon.class, new Class<?>[] {String.class});
        ClassTestUtils.checkFieldsPrivate(Demogorgon.class);
    }
}
