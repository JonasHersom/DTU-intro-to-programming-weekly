class Character {
    String name;
    int speed;
    int strength;

    Character(String name, int speed, int strength) {
        this.name = name;
        this.speed = speed;
        this.strength = strength;
    }

    String description() {
        return name + " (speed = " + speed + ", strength = " + strength + ")";
    }

    void powerUp(int amount) {
        this.speed += amount;
        this.strength += amount;
    }

    void nerf(int amount) {
        this.speed -= amount;
        this.strength -= amount;
    }

    boolean isBetterThan(Character other) {
        if (this.speed > other.speed && this.strength > other.strength) return true;
        else return false;
    }

    static void printBest(Character[] characters) {
        if (characters.length == 0) {
            System.out.println("The array is empty!");
            return;
        }

        var best = new Character("a", 0, 0);
        boolean thereIsBest = true;
        for (int i = 0; i < characters.length; i++) {
            if (characters[i].isBetterThan(best)) best = characters[i];
        }
        for (int i = 0; i < characters.length; i++) {
            if (!best.isBetterThan(characters[i]) && !best.equals(characters[i])) thereIsBest = false;
        }
        if (thereIsBest) System.out.println("Best character: " + best.description());
        else System.out.println("There is no best character in the array!");
    }

}
