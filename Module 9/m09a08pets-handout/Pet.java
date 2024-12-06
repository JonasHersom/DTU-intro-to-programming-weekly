class Pet {
    private String name;
    private String species;

    public Pet(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public String getDescription() {
        return this.name + " (" + this.species + ")";
    }
    public String getSound() {
        return "?";
    }
}

class Dog extends Pet {
    public Dog(String name) {
        super(name, "dog");
    }

    @Override
    public String getSound() {
        return "Woof!";
    }
}

class Greyhound extends Dog {
    public Greyhound(String name) {
        super(name);
    }

    @Override
    public String getSound() {
        return "WOOF!!!";
    }
}
class Chihuahua extends Dog {
    public Chihuahua(String name) {
        super(name);
    }

    @Override
    public String getSound() {
        return "Arf!";
    }
}


class Cat extends Pet {
    public Cat(String name) {
        super(name, "cat");
    }

    @Override
    public String getSound() {
        return "Meow!";
    }
}

class NorwegianForestCat extends Cat {
    public NorwegianForestCat(String name) {
        super(name);
    }

    @Override
    public String getSound() {
        return "MEOOOW!!!";
    }
}

class Frog extends Pet {
    public Frog(String name) {
        super(name, "frog");
    }
    @Override
    public String getSound() {
        return "Ribbit!";
    }
}

class HornedFrog extends Frog {
    public HornedFrog(String name) {
        super(name);
    }

    @Override
    public String getSound() {
        return "Croak!";
    }
}