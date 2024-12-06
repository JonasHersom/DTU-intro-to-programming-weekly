// Do not modify this file!

class Task02Test02 {
    public static void main(String[] args) {
        ClassTestUtils.checkSuperclass(Gorn.class, Alien.class);
        ClassTestUtils.checkConstructorImplPublic(Gorn.class, new Class<?>[] {String.class, boolean.class});
        ClassTestUtils.checkMethodImplPublic(Gorn.class, "description", new Class<?>[] {});
        ClassTestUtils.checkFieldsPrivate(Gorn.class);
    }
}
