class Point {
    double x;
    double y;

    static void move(Point p, double dx, double dy) {
        p.x = p.x + dx;
        p.y = p.y + dy;
    }

    static Point translate(Point p, double dx, double dy) {
        Point p1 = new Point();
        p1.x = p.x + dx;
        p1.y = p.y + dy;
        return p1;
    }
}
