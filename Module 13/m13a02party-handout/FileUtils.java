class FileUtils {
    public static Person[] load(String fname) throws java.io.IOException {
        var file = new java.io.File(fname);

        var scanner = new java.util.Scanner(file);
        scanner.useLocale(java.util.Locale.ENGLISH);

        int peopleInFile = countFileLines(fname) - 1; // subtract the header
        scanner.nextLine();
        var people = new Person[peopleInFile];
        
        for (int i = 0; i < peopleInFile; i++) {
            String person = scanner.nextLine();
            String[] personDetails = person.split(",");
            
            if (personDetails[1].equals("guest")) {
                people[i] = new Guest(personDetails[0], Integer.parseInt(personDetails[3]));
            }
            
            if (personDetails[1].equals("employee")) {
                people[i] = new Employee(personDetails[0], personDetails[2]);
            }

        }
        scanner.close();
        return people;
    }

    public static void save(Person[] people, String fname) throws java.io.IOException {
        var file = new java.io.File(fname);
        var printer = new java.io.PrintWriter(file);
        printer.println("Name,Type,Department,Ticket"); // header

        for (int i = 0; i < people.length; i++) {
            printer.println(people[i].toCSV());
        }
        printer.close();

    }

    


    /**
     * Return the number of lines contained in the file with the given name.
     * @param fname the name of the file to read
     * @return the number of lines in the file called 'fname'
     * @throws java.io.FileNotFoundException if 'fname' does not exist
     */
    private static int countFileLines(String fname) throws java.io.IOException {
        return (int)java.nio.file.Files.lines(java.nio.file.Paths.get(fname)).count();
    }
}
