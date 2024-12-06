// Do not modify this file!

class Task03Test02 {
    public static void main(String[] args) {
        ClassTestUtils.checkSuperclass(Cardassian.class, Alien.class);
        ClassTestUtils.checkConstructorImplPublic(Cardassian.class, new Class<?>[] {String.class, String.class});
        ClassTestUtils.checkMethodImplPublic(Cardassian.class, "description", new Class<?>[] {});
        ClassTestUtils.checkFieldsPrivate(Cardassian.class);
    }
}
