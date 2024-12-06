class CowSay {
    
    public static void main(String args[]) {

        String message = " _________________________________________" + System.lineSeparator() + 
                         "| ";

        String cow ="        \\   ^__^" + System.lineSeparator() +
        "         \\  (oo)\\_______" + System.lineSeparator() +
        "            (__)\\       )\\/\\" + System.lineSeparator() +
        "                ||----w |" + System.lineSeparator() +
        "                ||     ||";

        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);
        String userInput = scanner.nextLine();
        scanner.close();

        String[] splitInput = userInput.split(" ");
        
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

        System.out.println(message + cow);
    }

}
