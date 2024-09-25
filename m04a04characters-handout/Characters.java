class Characters {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);

        while (scanner.hasNextLine()) { 
        
            String input = scanner.nextLine();
            for (int i = 0; i < input.length(); i++) {
                char character = input.charAt(i);

                if (character == '#' || character == '!' || character == '+' || character == '\\') {System.out.println("The character '" + character + "' is a special symbol"); }
                else if (character < 58 && character > 47) {System.out.println("The character '" + character + "' is a digit");}
                else if (character > 64 && character < 91) {System.out.println("The character '" + character + "' is an uppercase letter");}
                else if (character > 96 && character < 122){System.out.println("The character '" + character + "' is a lowercase letter");}
                else {System.out.println("The character '" + character + "' is not known");}
            }
        }
        scanner.close();
    }
}
