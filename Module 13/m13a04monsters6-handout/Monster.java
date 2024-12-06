class Monster {
    private String name;
    private int maxhealth;
    private int health;
    private String species;
    private double hitDamageFactor;
    private double burnDamageFactor;
    private static boolean cursed;

    public Monster(String species, String name, int maxHealth, double hitDamageFactor, double burnDamageFactor) {
        this.species = species;
        this.name = name;
        this.hitDamageFactor = hitDamageFactor;
        this.burnDamageFactor = burnDamageFactor;  
        this.maxhealth = maxHealth;      
        this.health = maxhealth;
        cursed = false;
    }

    public String getDescription() {
        return this.name + " (" + (cursed ? "CURSED " : "") + this.species +  "; health: " + this.health + ")";
    }

    public int getHealth() {
        return this.health;
    }

    public boolean isDead() {
        if (health == 0) return true;
        return false;
    }

    public void heal(int points) {
        this.health += points;
        if (this.health > this.maxhealth) this.health = this.maxhealth;
    }

    public void hit(int damage) {
        double damageTaken = damage * this.hitDamageFactor * (cursed ? 3 : 1);
        this.health -= (int)damageTaken;
        if (this.health < 0) this.health = 0;
    }

    public void burn(int damage) {
        double damageTaken = damage * this.burnDamageFactor * (cursed ? 3 : 1);
        this.health -= (int)damageTaken;
        if (this.health < 0) this.health = 0;
    }

    public char getSymbol() {
        String uppercaseSpecies = this.species.toUpperCase(); 
        if (cursed) uppercaseSpecies = this.species.toLowerCase(); 
        return uppercaseSpecies.charAt(0);
    }

    public static void curseAll() {
        cursed = true;
    }
    public static void uncurseAll() {
        cursed = false;
    }
}

class Wumpus extends Monster{
    public Wumpus(String name) {
        super("wumpus", name, 20, 1, 1);
    }
}
class Owlbear extends Monster{
    
    public Owlbear(String name) {
        super("owlbear", name, 59, 0.5, 1);

    }
}
class Demogorgon extends Monster{
    
    public Demogorgon(String name) {
        super("demogorgon", name, 200, 1, 0.5);

    }
}
class Thing extends Monster{
    
    public Thing(String name) {
        super("thing", name, 30, 1, 2);

    }
}


