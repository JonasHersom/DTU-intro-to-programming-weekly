// Do not modify this file!

class Test03 {
    public static void main(String[] args) {
        var p = new Point();
        p.x = 0;
        p.y = 0;
        System.out.println("Coordinates of p: " + p.x + ", " + p.y);

        var p2 = Point.translate(p, -1, 10.5);
        System.out.println("After calling Point.translate(p, ...)");
        System.out.println("Coordinates of p: " + p.x + ", " + p.y);
        System.out.println("Coordinates of p2: " + p2.x + ", " + p2.y);

        var p3 = Point.translate(p2, 5, 7.5);
        System.out.println("After calling Point.translate(p2, ...)");
        System.out.println("Coordinates of p: " + p.x + ", " + p.y);
        System.out.println("Coordinates of p2: " + p2.x + ", " + p2.y);
        System.out.println("Coordinates of p3: " + p3.x + ", " + p3.y);
    }
}
