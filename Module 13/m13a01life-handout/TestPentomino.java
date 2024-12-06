// Do not modify this file!

class TestPentomino {
    public static void main(String[] args) {
        var life = new Life(15, 40);

        // Various "pentomino" patterns
        life.setCell(1, 1, true);
        life.setCell(1, 2, true);
        life.setCell(1, 3, true);
        life.setCell(2, 1, true);
        life.setCell(3, 1, true);

        life.setCell(7, 18, true);
        life.setCell(7, 19, true);
        life.setCell(7, 20, true);
        life.setCell(8, 19, true);
        life.setCell(9, 19, true);

        life.setCell(10, 37, true);
        life.setCell(11, 37, true);
        life.setCell(12, 37, true);
        life.setCell(11, 36, true);
        life.setCell(10, 38, true);

        if ((args.length) == 2 && (args[0].equals("animate"))) {
            TestUtils.animate(life, Integer.parseInt(args[1]));
            return;
        }

        System.out.println("Initial cells:");
        life.display();

        for (var i = 0; i < 8; i++) {
            System.out.println("");
            System.out.println("Advancing the simulation by one step...");
            life.step();
            System.out.println("Updated cells:");
            life.display();
        }
    }
}
