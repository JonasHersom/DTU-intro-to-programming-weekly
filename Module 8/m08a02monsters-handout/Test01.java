// Do not modify this file!

class Test01 {
    public static void main(String[] args) {
        var m1 = new Monster("Slagstep");
        var m2 = new Monster("Horrorface");
        var m3 = new Monster("Vileling");
        var monsters = new Monster[] {m1, m2, m3};

        System.out.println("monsters:");
        for (var m: monsters) {
            System.out.println("    - " + m.getDescription());
        }

        System.out.println("Hitting each monster...");
        m1.hit(55);
        m2.hit(71);
        m3.hit(61);

        System.out.println("monsters now:");
        for (var m: monsters) {
            System.out.println("    - " + m.getDescription());
        }

        System.out.println("Healing each monster...");
        m1.heal(1);
        m2.heal(70);
        m3.heal(70);

        System.out.println("monsters now:");
        for (var m: monsters) {
            System.out.println("    - " + m.getDescription());
        }

        System.out.println("Burning each monster...");
        m1.burn(46);
        m2.burn(3);
        m3.burn(120);

        System.out.println("monsters now:");
        for (var m: monsters) {
            var deadMsg = m.isDead() ? " - DEAD!" : "";
            System.out.println("    - " + m.getDescription() + deadMsg);
        }
    }
}
