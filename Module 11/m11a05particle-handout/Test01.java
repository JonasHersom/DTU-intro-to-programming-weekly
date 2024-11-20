// Do not modify this file!

class Test01 {
    public static void main(String[] args) {
        System.out.println("Creating a particle at (5,5) in a 10x10 grid, direction N");
        var p = new Particle(5, 5, 10, 10, "N");

        for (var i = 0; i < 5; i++) {
            System.out.println("Moving the particle...");
            p.move();
            System.out.println("The particle is now at ("
                                + p.getRow() + "," + p.getColumn()
                                + "), direction " + p.getDirection());
        }
    }
}
