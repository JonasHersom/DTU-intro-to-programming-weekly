public interface Monster {
    public String getDescription();
    public int getHealth();
    public boolean isDead();
    public void heal(int points);
    public void hit(int damage);
    public void burn(int damage);
}

class Wumpus implements Monster{
    private String name;
    private int maxhealth;
    private int health;
    
    public Wumpus(String name) {
        this.name = name;
        this.maxhealth = 20;
        this.health = this.maxhealth;

    }

    public String getDescription() {
        return this.name + " (wumpus; health: " + this.health + ")";
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
        this.health -= damage;
        if (this.health < 0) this.health = 0;
    }

    public void burn(int damage) {
        this.health -= damage;
        if (this.health < 0) this.health = 0;
    }
}
class Owlbear implements Monster{
    private String name;
    private int maxhealth;
    private int health;
    
    public Owlbear(String name) {
        this.name = name;
        this.maxhealth = 59;
        this.health = this.maxhealth;

    }

    public String getDescription() {
        return this.name + " (owlbear; health: " + this.health + ")";
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
        damage /= 2;
        this.health -= damage;
        if (this.health < 0) this.health = 0;
    }

    public void burn(int damage) {
        this.health -= damage;
        if (this.health < 0) this.health = 0;
    }

}
class Demogorgon implements Monster{
    private String name;
    private int maxhealth;
    private int health;
    
    public Demogorgon(String name) {
        this.name = name;
        this.maxhealth = 200;
        this.health = this.maxhealth;

    }

    public String getDescription() {
        return this.name + " (demogorgon; health: " + this.health + ")";
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
        this.health -= damage;
        if (this.health < 0) this.health = 0;
    }

    public void burn(int damage) {
        damage /= 2;
        this.health -= damage;
        if (this.health < 0) this.health = 0;
    }

}


