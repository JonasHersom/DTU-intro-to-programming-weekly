// Do not modify this file!

class Test03 {
    public static void main(String[] args) {
        var life = new Life(8, 8);
        life.setCell(2, 2, true);
        life.setCell(2, 3, true);
        life.setCell(2, 4, true);

        if ((args.length) == 2 && (args[0].equals("animate"))) {
            TestUtils.animate(life, Integer.parseInt(args[1]));
            return;
        }

        System.out.println("Initial cells:");
        life.display();

        for (var i = 0; i < 3; i++) {
            System.out.println("");
            System.out.println("Advancing the simulation by one step...");
            life.step();
            System.out.println("Updated cells:");
            life.display();
        }
    }
}
