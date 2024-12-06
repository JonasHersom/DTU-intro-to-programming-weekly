// Do not modify this file!

class Task01Test02 {
    public static void main(String[] args) {
        ClassTestUtils.checkConstructorImplPublic(Alien.class, new Class<?>[] {String.class, String.class, String.class});
        ClassTestUtils.checkMethodImplPublic(Alien.class, "description", new Class<?>[] {});
        ClassTestUtils.checkFieldsPrivate(Alien.class);
    }
}
