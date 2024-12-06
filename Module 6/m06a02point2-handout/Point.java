class Point {
    double x;
    double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void move(double dx, double dy) {
        this.x = this.x + dx;
        this.y = this.y + dy;
    }

    Point translate(double dx, double dy) {
        Point p1 = new Point(this.x + dx, this.y + dy);
        return p1;
    }
}
