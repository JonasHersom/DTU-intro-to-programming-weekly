// Do not modify this file!

class Test07 {
    public static void main(String[] args) {
        var people = new Person[] {
            new Guest("Laura Lund", 123),
            new Guest("Emma Ebbesen", 75)
        };

        peopleToCSV(people);
    }

    static void peopleToCSV(Person[] people) {
        for (var p: people) {
            System.out.println(p.toCSV());
        }
    }
}
