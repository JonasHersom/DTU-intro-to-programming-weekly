class CowSay {
    
    public static void main(String args[]) {
        if (args.length > 0) {
            var inputtedFile = new java.io.File(args[0]);

            if (inputtedFile.exists() == false) {
                System.out.println("Error: file " + args[1] + " not found");
                return;
            }
            if (args.length == 1) {
                try {
                    var scanner = new java.util.Scanner(inputtedFile);
                    scanner.useLocale(java.util.Locale.ENGLISH);
                    
                    String text = "";
                    while (scanner.hasNextLine()) {
                        text += scanner.nextLine();
                    }
                    scanner.close();
                    System.out.println(cowSay(text));
                    
                } catch (java.io.FileNotFoundException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            } else if (args.length == 2) {
                String text = "";
                try {
                    var scanner = new java.util.Scanner(inputtedFile);
                    scanner.useLocale(java.util.Locale.ENGLISH);
                    
                    while (scanner.hasNextLine()) {
                        text += scanner.nextLine();
                    }
                    scanner.close();

                } catch (java.io.FileNotFoundException e) {
                    System.out.println("Error: " + e.getMessage());
                }
                try {
                    var printer = new java.io.PrintWriter(args[1]);
                    printer.println(cowSay(text));
                    printer.close();

                } catch (java.io.FileNotFoundException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }else {
            var scanner = new java.util.Scanner(System.in);
            scanner.useLocale(java.util.Locale.ENGLISH);
            String text = "";
            while (scanner.hasNextLine()) {
                String userInput = scanner.nextLine();
                text += userInput;
            }
            System.out.println(cowSay(text));
            scanner.close();
        }

    }

    public static String cowSay(String input) {
        String message = " _________________________________________" + System.lineSeparator() + 
                         "| ";

        String cow ="        \\   ^__^" + System.lineSeparator() +
                    "         \\  (oo)\\_______" + System.lineSeparator() +
                    "            (__)\\       )\\/\\" + System.lineSeparator() +
                    "                ||----w |" + System.lineSeparator() +
                    "                ||     ||";

        

        String[] splitInput = input.split(" ");
        
        int amountOfCharecters = 0;

        for (int i = 0; i < splitInput.length; i++) {
            if (amountOfCharecters + splitInput[i].length() > 39) {
                for (int j = amountOfCharecters; j < 39; j++) {
                    message += " ";
                }
                message += " |" + System.lineSeparator() + "| ";
                amountOfCharecters = 0;
            }
            
            message += splitInput[i];
            amountOfCharecters += splitInput[i].length();
            
            if (i < splitInput.length - 1) {
                if (amountOfCharecters < 39) {
                    message += " ";
                    amountOfCharecters++; 
                }
            }
        }

        if (amountOfCharecters > 0 && amountOfCharecters < 39) {
            for (int j = amountOfCharecters; j < 39; j++) {
                message += " ";
            }
            message += " |";
        } else if (amountOfCharecters == 39) {
            message += " |";
        }

        message += System.lineSeparator() + " -----------------------------------------" + System.lineSeparator();

        return message + cow;
    }

}
