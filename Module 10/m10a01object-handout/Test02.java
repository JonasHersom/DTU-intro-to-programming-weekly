// Do not modify this file!

class Test02 {
    public static void main(String[] args) {
        var p1 = new MehPoint3D(0.3333, 2.0 - 0.0001, 3.0);

        var p2 = new MehPoint3D(0.3333, 2.0, 3.0 + 0.0001);

        var p3 = new MehPoint3D(1.0 / 3.0, 2.0, 3.0);

        TestUtils.testPointsEqual(p1, p2, p3);
    }
}
