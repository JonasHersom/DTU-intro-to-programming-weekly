class Monster {
    private String name;
    private int maxhealth;
    private int health;
    
    public Monster (String name) {
        this.name = name;
        this.maxhealth = 100;
        this.health = this.maxhealth;

    }

    public String getDescription() {
        return this.name + " (health: " + this.health + ")";
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
