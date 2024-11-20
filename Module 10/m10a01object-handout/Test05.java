// Do not modify this file!

class Test05 {
    public static void main(String[] args) {
        var p1 = new ExcellentPoint3D(0.3333, 2.0 - 0.0001, 3.0);

        var p2 = new ExcellentPoint3D(0.3333, 2.0 + 0.0002, 3.0);

        var p3 = new ExcellentPoint3D(1.0 / 3.0, 2.0, 3.0);

        TestUtils.testPointsEqual(p1, p2, p3);
        TestUtils.testToString(p1, p2, p3);
    }
}
