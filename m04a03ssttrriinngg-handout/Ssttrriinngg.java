class Ssttrriinngg {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);
        
        int number = Integer.parseInt(scanner.nextLine());
        String text = scanner.nextLine();
        String output = "";
        
        scanner.close();

        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            for (int j = 0; j < number; j++) {
                output = output + letter;
            }
        }

        System.out.println(output);
    }
}
