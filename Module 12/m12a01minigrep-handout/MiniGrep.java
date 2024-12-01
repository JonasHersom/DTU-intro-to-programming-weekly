class MiniGrep {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Error: expected 2 arguments, got " + args.length + " instead");
            return;
        }
        var inputtedFile = new java.io.File(args[1]);

        if (inputtedFile.exists() == false) {
            System.out.println("Error: file " + args[1] + " not found");
            return;
        }

        try {
            var scanner = new java.util.Scanner(inputtedFile);
            scanner.useLocale(java.util.Locale.ENGLISH);

            while (scanner.hasNextLine()) {
                var line = scanner.nextLine();
                if (line.contains(args[0])) System.out.println(line);
            }
            scanner.close();
            
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
        

    }
}
