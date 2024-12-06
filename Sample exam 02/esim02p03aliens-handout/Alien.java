class Alien {
    private String name;
    private String species;
    private String planet;

    public Alien (String name, String species, String planet) {
        this.name = name;
        this.species = species;
        this.planet = planet;
    }

    public String description() {
        return this.name + " (" + this.species + " from planet " + this.planet + ")";
    }

}

class Gorn extends Alien {
    private String isFriendly;

    public Gorn(String name, boolean isFriendly) {
        super(name, "Gorn", "Arcturus");
        this.isFriendly = isFriendly ? "friendly" : "aggressive";
    }

    @Override
    public String description() {
        return super.description() + " - " + isFriendly;
    }
}

class Cardassian extends Alien {
    private String preferredGem;

    public Cardassian(String name, String prefferedGem) {
        super(name, "Cardassian", "Bajor");
        this.preferredGem = prefferedGem;
    }

    @Override
    public String description() {
        return super.description() + " - preferred gem: " + preferredGem;
    }
}