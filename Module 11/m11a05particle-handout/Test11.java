// Do not modify this file!

class Test11 {
    public static void main(String[] args) {
        System.out.println("Creating a particle at (5,6) in an 8x12 grid, direction NW");
        var p = new Particle(5, 6, 8, 12, "NW");

        for (var i = 0; i < 24; i++) {
            System.out.println("Moving the particle...");
            p.move();
            System.out.println("The particle is now at ("
                                + p.getRow() + "," + p.getColumn()
                                + "), direction " + p.getDirection());
        }
    }
}