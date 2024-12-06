// Do not modify this file!

class Test15 {
    public static void main(String[] args) {
        var playground = GameUtils.createPlayground(8, 8);
        playground[3][4] = new Wumpus("Slagstep");
        playground[6][7] = new Owlbear("Toxinpest");
        playground[3][6] = new Monster("beholder", "Krashos", 70, 1.0, 2.0);
        playground[1][2] = new Thing("Raurgoch");
        playground[4][5] = new Monster("Dragon", "Despayr", 1000, 0.5, 0.5);
        playground[7][2] = new Demogorgon("Emberteeth");

        System.out.println("Playground with non-cursed monsters:");
        GameUtils.displayPlayground(playground, 3, 5);
        GameUtils.displayMonsters(playground);

        System.out.println();

        Monster.curseAll();
        System.out.println("Playground with cursed monsters:");
        GameUtils.displayPlayground(playground, 3, 5);
        GameUtils.displayMonsters(playground);

        System.out.println();

        System.out.println("Player hits while at row 3, column 5 (damage 6)");
        GameUtils.hit(playground, 3, 5, 6);

        System.out.println();

        System.out.println("Updated playground with cursed monsters:");
        GameUtils.displayPlayground(playground, 3, 5);
        GameUtils.displayMonsters(playground);

        System.out.println();

        System.out.println("Player burns while at row 3, column 5 (damage 6)");
        GameUtils.burn(playground, 3, 5, 6);

        System.out.println();

        System.out.println("Updated playground with cursed monsters:");
        GameUtils.displayPlayground(playground, 3, 5);
        GameUtils.displayMonsters(playground);

        System.out.println();

        Monster.uncurseAll();
        System.out.println("Updated playground with non-cursed monsters:");
        GameUtils.displayPlayground(playground, 3, 5);
        GameUtils.displayMonsters(playground);

        System.out.println();

        System.out.println("Player hits while at row 3, column 5 (damage 6)");
        GameUtils.hit(playground, 3, 5, 6);

        System.out.println();

        System.out.println("Updated playground with non-cursed monsters:");
        GameUtils.displayPlayground(playground, 3, 5);
        GameUtils.displayMonsters(playground);

        System.out.println();

        System.out.println("Player burns while at row 3, column 5 (damage 6)");
        GameUtils.burn(playground, 3, 5, 6);

        System.out.println();

        Monster.uncurseAll();
        System.out.println("Updated playground with non-cursed monsters:");
        GameUtils.displayPlayground(playground, 3, 5);
        GameUtils.displayMonsters(playground);
    }
}
