class Monster {
    public String name;
    public int maxhealth;
    public int health;
    public String species;
    public double hitDamageFactor;
    public double burnDamageFactor;

    public Monster(String species, String name, int maxHealth, double hitDamageFactor, double burnDamageFactor) {
        this.species = species;
        this.name = name;
        this.hitDamageFactor = hitDamageFactor;
        this.burnDamageFactor = burnDamageFactor;  
        this.maxhealth = maxHealth;      
        this.health = maxhealth;
    }

    public String getDescription() {
        return this.name + " (" + this.species.toLowerCase() +  "; health: " + this.health + ")";
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
        double damageTaken = damage * this.hitDamageFactor;
        this.health -= (int)damageTaken;
        if (this.health < 0) this.health = 0;
    }

    public void burn(int damage) {
        double damageTaken = damage * this.burnDamageFactor;
        this.health -= (int)damageTaken;
        if (this.health < 0) this.health = 0;
    }

    public char getSymbol() {
        String uppercaseSpecies = this.species.toUpperCase(); 
        return uppercaseSpecies.charAt(0);
    }
}

class Wumpus extends Monster{
    public Wumpus(String name) {
        super("Wumpus", name, 20, 1, 1);
    }
}
class Owlbear extends Monster{
    
    public Owlbear(String name) {
        super("Owlbear", name, 59, 0.5, 1);

    }
}
class Demogorgon extends Monster{
    
    public Demogorgon(String name) {
        super("Demogorgon", name, 200, 1, 0.5);

    }
}
class Thing extends Monster{
    
    public Thing(String name) {
        super("Thing", name, 30, 1, 2);

    }
}


