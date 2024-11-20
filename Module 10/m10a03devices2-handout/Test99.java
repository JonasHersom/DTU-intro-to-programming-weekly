// Do not modify this file!

// The code below inspects the structure of a class or interface you should have
// defined for the solution of this assessment.  To this end, this code uses
// some methods defined in the file ClassTestUtils.java.  You do not need to
// fully understand the code below.

class Test99 {
    public static void main(String[] args) {
        ClassTestUtils.checkFieldsPrivate(Device.class);
        ClassTestUtils.checkMethodImplPublic(Device.class, "getModel", new Class<?>[] {});

        ClassTestUtils.checkSuperclass(Camera.class, Device.class);
        ClassTestUtils.checkInterface(Camera.class, "CanTakePictures");
        ClassTestUtils.checkMethodInherited(Camera.class, "getModel", new Class<?>[] {});
        ClassTestUtils.checkFieldsPrivate(Camera.class);

        ClassTestUtils.checkSuperclass(MusicPlayer.class, Device.class);
        ClassTestUtils.checkInterface(MusicPlayer.class, "CanPlayMusic");
        ClassTestUtils.checkMethodInherited(MusicPlayer.class, "getModel", new Class<?>[] {});
        ClassTestUtils.checkFieldsPrivate(MusicPlayer.class);

        ClassTestUtils.checkSuperclass(Featurephone.class, Device.class);
        ClassTestUtils.checkInterface(Featurephone.class, "CanMakeCalls");
        ClassTestUtils.checkMethodInherited(Featurephone.class, "getModel", new Class<?>[] {});
        ClassTestUtils.checkFieldsPrivate(Featurephone.class);

        ClassTestUtils.checkSuperclass(Smartphone.class, Device.class);
        ClassTestUtils.checkInterface(Smartphone.class, "CanMakeCalls");
        ClassTestUtils.checkInterface(Smartphone.class, "CanPlayMusic");
        ClassTestUtils.checkInterface(Smartphone.class, "CanTakePictures");
        ClassTestUtils.checkMethodInherited(Smartphone.class, "getModel", new Class<?>[] {});
        ClassTestUtils.checkFieldsPrivate(Smartphone.class);
    }
}
