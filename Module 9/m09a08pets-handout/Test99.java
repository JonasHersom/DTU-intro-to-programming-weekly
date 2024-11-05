// Do not modify this file!

// The code below inspects the structure of a class or interface you should have
// defined for the solution of this assessment.  To this end, this code uses
// some methods defined in the file ClassTestUtils.java.  You do not need to
// fully understand the code below.

class Test99 {
    public static void main(String[] args) {
        ClassTestUtils.checkConstructorImplPublic(Pet.class, new Class<?>[] {String.class, String.class});
        ClassTestUtils.checkMethodImplPublic(Pet.class, "getDescription", new Class<?>[] {});
        ClassTestUtils.checkMethodImplPublic(Pet.class, "getSound", new Class<?>[] {});
        ClassTestUtils.checkFieldsPrivate(Pet.class);

        ClassTestUtils.checkSuperclass(Dog.class, Pet.class);
        ClassTestUtils.checkConstructorImplPublic(Dog.class, new Class<?>[] {String.class});
        ClassTestUtils.checkMethodInherited(Dog.class, "getDescription", new Class<?>[] {});
        ClassTestUtils.checkMethodImplPublic(Dog.class, "getSound", new Class<?>[] {});
        ClassTestUtils.checkFieldsPrivate(Dog.class);

        ClassTestUtils.checkSuperclass(Greyhound.class, Dog.class);
        ClassTestUtils.checkConstructorImplPublic(Greyhound.class, new Class<?>[] {String.class});
        ClassTestUtils.checkMethodInherited(Greyhound.class, "getDescription", new Class<?>[] {});
        ClassTestUtils.checkMethodImplPublic(Greyhound.class, "getSound", new Class<?>[] {});
        ClassTestUtils.checkFieldsPrivate(Greyhound.class);

        ClassTestUtils.checkSuperclass(Chihuahua.class, Dog.class);
        ClassTestUtils.checkConstructorImplPublic(Chihuahua.class, new Class<?>[] {String.class});
        ClassTestUtils.checkMethodInherited(Chihuahua.class, "getDescription", new Class<?>[] {});
        ClassTestUtils.checkMethodImplPublic(Chihuahua.class, "getSound", new Class<?>[] {});
        ClassTestUtils.checkFieldsPrivate(Chihuahua.class);

        ClassTestUtils.checkSuperclass(Cat.class, Pet.class);
        ClassTestUtils.checkConstructorImplPublic(Cat.class, new Class<?>[] {String.class});
        ClassTestUtils.checkMethodInherited(Cat.class, "getDescription", new Class<?>[] {});
        ClassTestUtils.checkMethodImplPublic(Cat.class, "getSound", new Class<?>[] {});
        ClassTestUtils.checkFieldsPrivate(Cat.class);

        ClassTestUtils.checkSuperclass(NorwegianForestCat.class, Cat.class);
        ClassTestUtils.checkConstructorImplPublic(NorwegianForestCat.class, new Class<?>[] {String.class});
        ClassTestUtils.checkMethodInherited(NorwegianForestCat.class, "getDescription", new Class<?>[] {});
        ClassTestUtils.checkMethodImplPublic(NorwegianForestCat.class, "getSound", new Class<?>[] {});
        ClassTestUtils.checkFieldsPrivate(NorwegianForestCat.class);

        ClassTestUtils.checkSuperclass(Frog.class, Pet.class);
        ClassTestUtils.checkConstructorImplPublic(Frog.class, new Class<?>[] {String.class});
        ClassTestUtils.checkMethodInherited(Frog.class, "getDescription", new Class<?>[] {});
        ClassTestUtils.checkMethodImplPublic(Frog.class, "getSound", new Class<?>[] {});
        ClassTestUtils.checkFieldsPrivate(Frog.class);

        ClassTestUtils.checkSuperclass(HornedFrog.class, Frog.class);
        ClassTestUtils.checkConstructorImplPublic(HornedFrog.class, new Class<?>[] {String.class});
        ClassTestUtils.checkMethodInherited(HornedFrog.class, "getDescription", new Class<?>[] {});
        ClassTestUtils.checkMethodImplPublic(HornedFrog.class, "getSound", new Class<?>[] {});
        ClassTestUtils.checkFieldsPrivate(HornedFrog.class);
    }
}
