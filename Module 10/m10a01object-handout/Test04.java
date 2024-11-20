// Do not modify this file!

class Test04 {
    public static void main(String[] args) {
        var p1 = new GoodPoint3D(0.3333, 1.0 - 0.0001, 11.0 / 6.0);

        var p2 = new GoodPoint3D(0.3333, 1.0 + 0.00005, 3.0);

        var p3 = new GoodPoint3D(0.3333, 1.0, 1.8333333333333333);

        TestUtils.testPointsEqual(p1, p2, p3);
    }
}
