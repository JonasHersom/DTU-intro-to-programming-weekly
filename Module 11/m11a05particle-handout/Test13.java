// Do not modify this file!

class Test13 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Creating a particle at (5,6) in an 8x13 grid, direction NW");
        var p = new Particle(5, 6, 8, 13, "NW");

        // Should we display an animation?
        var animate = args.length == 1 && args[0].equals("animate");

        for (var i = 0; animate || i < 24; i++) {
            var output = p.display();

            if (animate) {
                // ANSI terminal escape codes: clear screen + home
                // See https://en.wikipedia.org/wiki/ANSI_escape_code
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }

            System.out.print(output);

            if (animate) {
                System.out.println("Press Ctrl+C to interrupt the animation.");
                Thread.sleep(200); // Delay in milliseconds
            } else {
                System.out.println("");
            }

            p.move();
        }
    }
}
