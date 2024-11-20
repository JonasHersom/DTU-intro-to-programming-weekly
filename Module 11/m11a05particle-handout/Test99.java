// Do not modify this file!

// The code below inspects the structure of a class or interface you should have
// defined for the solution of this assessment.  To this end, this code uses
// some methods defined in the file ClassTestUtils.java.  You do not need to
// fully understand the code below.

class Test99 {
    public static void main(String[] args) {
        ClassTestUtils.checkConstructorImplPublic(Particle.class, new Class<?>[] {int.class, int.class, int.class, int.class, String.class});

        ClassTestUtils.checkMethodImplPublic(Particle.class, "getRow", new Class<?>[] {});
        ClassTestUtils.checkMethodImplPublic(Particle.class, "getColumn", new Class<?>[] {});
        ClassTestUtils.checkMethodImplPublic(Particle.class, "getDirection", new Class<?>[] {});
        ClassTestUtils.checkMethodImplPublic(Particle.class, "move", new Class<?>[] {});
        ClassTestUtils.checkMethodImplPublic(Particle.class, "display", new Class<?>[] {});

        ClassTestUtils.checkFieldsPrivate(Particle.class);
    }
}
