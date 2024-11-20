class VendingMachine {
    private String location;
    private int coffee;
    private int chocolate;
    private int cash;

    public VendingMachine(String location, int coffee, int chocolate) {
        this.location = location;
        this.coffee = coffee;
        this.chocolate = chocolate;
        this.cash = 0;
    }

    public String description() {
        return "Machine @ " + this.location + " (coffee: " + this.coffee + "; chocolate: " + this.chocolate + "; cash: " + this.cash + ")";
    }

    public void putCash(int amount) {
        this.cash += amount;
    }
    
    public boolean serveCoffee() {
        if (this.coffee > 0 && this.cash >= 10) {
            this.coffee -= 1;
            this.cash -= 10;
            return true;
        } 
        return false;
    }
    public boolean serveChocolate() {
        if (this.chocolate > 0 && this.cash >= 20) {
            this.chocolate -= 1;
            this.cash -= 20;
            return true;
        }
        return false;
    }
    public boolean serveWienerMelange() {
        if (this.coffee > 0 && this.chocolate > 0 && this.cash >= 30) {
            this.coffee -= 1;
            this.chocolate -= 1;
            this.cash -= 30;
            return true;
        }
        return false;
    }

    public int retrieveCash() {
        int returnedCash = this.cash;
        this.cash -= this.cash;
        return returnedCash;
    }
}

class AdvancedVendingMachine extends VendingMachine {


    public AdvancedVendingMachine(String location, int coffee, int chocolate) {
        super(location, coffee, chocolate);
    }

    
    public int serveCoffees(int n) {
        int timesServed = 0;
        for (int i = 0; i < n; i++) {
            if (super.serveCoffee() == true) timesServed++;
            else return timesServed;
        }
        return timesServed;
    }
    public int serveChocolates(int n) {
        int timesServed = 0;
        for (int i = 0; i < n; i++) {
            if (super.serveChocolate() == true) timesServed++;
            else return timesServed;
        }
        return timesServed;
    }
    public int serveWienerMelanges(int n) {
        int timesServed = 0;
        for (int i = 0; i < n; i++) {
            if (super.serveWienerMelange() == true) timesServed++;
            else return timesServed;
        }
        return timesServed;
    }

}