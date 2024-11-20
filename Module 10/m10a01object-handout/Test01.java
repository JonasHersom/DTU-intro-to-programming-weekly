// Do not modify this file!

class Test01 {
    public static void main(String[] args) {
        var p1 = new UglyPoint3D();
        p1.x = 0.3333;
        p1.y = 2.0;
        p1.z = 3.0;

        var p2 = new UglyPoint3D();
        p2.x = 0.3333;
        p2.y = 2.0 - 0.0001;
        p2.z = 3.0;

        var p3 = new UglyPoint3D();
        p2.x = 1.0 / 3.0;
        p2.y = 2.0;
        p2.z = 3.0 + 0.0001;

        TestUtils.testPointsEqual(p1, p2, p3);
    }
}
