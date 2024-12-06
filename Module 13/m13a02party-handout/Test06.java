// Do not modify this file!

class Test06 {
    public static void main(String[] args) {
        var people = new Person[] {
            new Employee("Ida Iversen", "DTU Aqua"),
            new Employee("Oliver Olesen", "DTU Construct"),
            new Employee("Alceste Scalas", "DTU Compute")
        };

        peopleToCSV(people);
    }

    static void peopleToCSV(Person[] people) {
        for (var p: people) {
            System.out.println(p.toCSV());
        }
    }
}
