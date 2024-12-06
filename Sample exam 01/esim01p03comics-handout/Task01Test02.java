// Do not modify this file!

class Task01Test02 {
    public static void main(String[] args) {
        ClassTestUtils.checkConstructorImplPublic(Comic.class, new Class[] {String.class, int.class, String.class, int.class});
        ClassTestUtils.checkMethodImplPublic(Comic.class, "getDescription", new Class[] {});;
        ClassTestUtils.checkFieldsPrivate(Comic.class);
    }
}
