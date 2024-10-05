// Do not modify this file!

class Test04 {
    public static void main(String[] args) {
        var p = new Point();
        p.x = 1;
        p.y = 1;
        System.out.println("Coordinates of p: " + p.x + ", " + p.y);

        var p2 = Point.translate(p, -4, 5.5);
        System.out.println("After calling Point.translate(p, ...)");
        System.out.println("Coordinates of p: " + p.x + ", " + p.y);
        System.out.println("Coordinates of p2: " + p2.x + ", " + p2.y);

        Point.move(p2, 5, 7.5);
        System.out.println("After calling Point.move(p2, ...)");
        System.out.println("Coordinates of p: " + p.x + ", " + p.y);
        System.out.println("Coordinates of p2: " + p2.x + ", " + p2.y);
    }
}
