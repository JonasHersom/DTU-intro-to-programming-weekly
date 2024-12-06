// Do not modify this file!

class Test08 {
    public static void main(String[] args) throws java.io.IOException {
        var filename = "test08.csv";

        var people = new Person[] {
            new Guest("Laura Lund", 123),
            new Employee("Alceste Scalas", "DTU Compute"),
            new Employee("Oliver Olesen", "DTU Construct"),
            new Guest("Emma Ebbesen", 75),
            new Employee("Ida Iversen", "DTU Aqua")
        };

        System.out.println("Saving file: " + filename + "...");
        FileUtils.save(people, filename);

        System.out.println("");
        System.out.println("Contents of " + filename + ":");
        System.out.println("- - - - - - - Contents begin here - - - - - - -");
        for (var l: java.nio.file.Files.readAllLines(java.nio.file.Paths.get(filename))) {
            System.out.println(l);
        }
        System.out.println("- - - - - - - - Contents end here - - - - - - -");
    }
}
