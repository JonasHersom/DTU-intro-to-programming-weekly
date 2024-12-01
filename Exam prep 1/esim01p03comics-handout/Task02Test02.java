// Do not modify this file!

class Task02Test02 {
    public static void main(String[] args) {
        ClassTestUtils.checkSuperclass(IronMan.class, Comic.class);
        ClassTestUtils.checkConstructorImplPublic(IronMan.class, new Class[] {int.class, String.class, int.class});
        ClassTestUtils.checkMethodInherited(IronMan.class, "getDescription", new Class[] {});;
        ClassTestUtils.checkFieldsPrivate(IronMan.class);

        System.out.println("");

        ClassTestUtils.checkSuperclass(WonderWoman.class, Comic.class);
        ClassTestUtils.checkConstructorImplPublic(WonderWoman.class, new Class[] {int.class, String.class, int.class});
        ClassTestUtils.checkMethodInherited(WonderWoman.class, "getDescription", new Class[] {});;
        ClassTestUtils.checkFieldsPrivate(WonderWoman.class);
    }
}
