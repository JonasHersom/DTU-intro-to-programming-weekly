class Password {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);

        while (true) { 
            String password = scanner.nextLine();
            int passwordLength = password.length();

            if(passwordLength < 5){
                System.out.println("Password too short");
                
            } else if(passwordLength > 8){
                System.out.println("Password too long");

            } else {
                System.out.println("Password length OK");
                scanner.close();
                break;
            }
        }
    }
}