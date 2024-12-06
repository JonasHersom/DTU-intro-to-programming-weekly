// Do not modify this file!

class TestUtils {
    /**
     * Display an animation of the given game of life.
     * @param life the game of life to animate
     * @param fps number of frames (i.e. simulation steps) per second
     */
    public static void animate(Life life, int fps) {
        for(var i = 0; true; i++) {
            try {
                // ANSI terminal escape codes: clear screen + home
                // See https://en.wikipedia.org/wiki/ANSI_escape_code
                System.out.print("\033[H\033[2J");
                System.out.flush(); 

                System.out.println("Conway's Game of Life simulation step " + i);
                System.out.println();
                life.display();
                Thread.sleep(1000 / fps); // Delay in milliseconds
                life.step();
            } catch (InterruptedException e) {
                System.out.println("Animation interrupted!");
            }
        }
    }
}
