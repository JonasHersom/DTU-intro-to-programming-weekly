// Do not modify this file!

// The code below inspects the structure of a class or interface you should have
// defined for the solution of this assessment.  To this end, this code uses
// some methods defined in the file ClassTestUtils.java.  You do not need to
// fully understand the code below.

class Test99 {
    public static void main(String[] args) {
        ClassTestUtils.checkInterface(CanTakePictures.class, "Device");
        ClassTestUtils.checkInterface(CanPlayMusic.class, "Device");
        ClassTestUtils.checkInterface(CanMakeCalls.class, "Device");

        ClassTestUtils.checkInterface(Camera.class, "Device");
        ClassTestUtils.checkInterface(Camera.class, "CanTakePictures");
        ClassTestUtils.checkFieldsPrivate(Camera.class);

        ClassTestUtils.checkInterface(MusicPlayer.class, "Device");
        ClassTestUtils.checkInterface(MusicPlayer.class, "CanPlayMusic");
        ClassTestUtils.checkFieldsPrivate(MusicPlayer.class);

        ClassTestUtils.checkInterface(Featurephone.class, "Device");
        ClassTestUtils.checkInterface(Featurephone.class, "CanMakeCalls");
        ClassTestUtils.checkFieldsPrivate(Featurephone.class);

        ClassTestUtils.checkInterface(Smartphone.class, "Device");
        ClassTestUtils.checkInterface(Smartphone.class, "CanMakeCalls");
        ClassTestUtils.checkInterface(Smartphone.class, "CanPlayMusic");
        ClassTestUtils.checkInterface(Smartphone.class, "CanTakePictures");
        ClassTestUtils.checkFieldsPrivate(Smartphone.class);
    }
}
