// Do not modify this file!

// The code below inspects the structure of a class or interface you should have
// defined for the solution of this assessment.  To this end, this code uses
// some methods defined in the file ClassTestUtils.java.  You do not need to
// fully understand the code below.

class Test99 {
    public static void main(String[] args) {
        ClassTestUtils.checkConstructorImplPublic(Contact.class, new Class<?>[] {String.class, String.class, String.class, String.class});

        ClassTestUtils.checkMethodImplPublic(Contact.class, "getName", new Class<?>[] {});
        ClassTestUtils.checkMethodImplPublic(Contact.class, "getSurname", new Class<?>[] {});
        ClassTestUtils.checkMethodImplPublic(Contact.class, "getPhone", new Class<?>[] {});
        ClassTestUtils.checkMethodImplPublic(Contact.class, "getEmail", new Class<?>[] {});

        ClassTestUtils.checkMethodImplPublic(Contact.class, "setName", new Class<?>[] {String.class});
        ClassTestUtils.checkMethodImplPublic(Contact.class, "setSurname", new Class<?>[] {String.class});
        ClassTestUtils.checkMethodImplPublic(Contact.class, "setPhone", new Class<?>[] {String.class});
        ClassTestUtils.checkMethodImplPublic(Contact.class, "setEmail", new Class<?>[] {String.class});

        ClassTestUtils.checkFieldsPrivate(Contact.class);
    }
}
