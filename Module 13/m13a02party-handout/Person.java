abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public abstract String toCSV();

    public abstract String getInfo();
}

class Employee extends Person {
    private String department;

    public Employee(String name, String department) {
        super(name);
        this.department = department;
    }

    @Override
    public String toCSV() {
        return super.getName() + ",employee," + this.department + ",";
    }
    
    @Override
    public String getInfo() {
        return "Employee, " + this.department;
    }
}

class Guest extends Person {
    private int ticketNumber;
    
    public Guest(String name, int ticketNumber) {
        super(name);
        this.ticketNumber = ticketNumber;
    }
    
    @Override
    public String toCSV() {
        return super.getName() + ",guest,," + this.ticketNumber;
    }

    @Override
    public String getInfo() {
        return "Guest, ticket " + this.ticketNumber;
    }
}
