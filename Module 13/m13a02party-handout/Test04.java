// Do not modify this file!

class Test04 {
    public static void main(String[] args) {
        var filename = "test04.csv";

        System.out.println("Reading the file '" + filename + "'...");
        try {
            var people = FileUtils.load(filename);
            printPeople(people);
        } catch (java.io.IOException e) {
            System.out.println("Error!");
        }
    }

    static void printPeople(Person[] people) {
        for (var p: people) {
            System.out.println("    - " + p.getName()
                                + " (" + p.getInfo() + ")");
        }
    }
}
