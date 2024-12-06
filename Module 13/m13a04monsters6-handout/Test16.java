// Do not modify this file!

class Test16 {
    public static void main(String[] args) {
        var w = new Wumpus("Vileling");
        var m = new Monster("Mindflayer", "Brainy", 300, 1.0, 1.0);
        var s = new Monster("Skeleton", "Toothless", 20, 2.0, 0.5);

        var playground = GameUtils.createPlayground(10, 10);
        playground[2][2] = m;
        playground[3][4] = s;
        playground[8][7] = w;

        GameUtils.playGame(playground);
    }
}
