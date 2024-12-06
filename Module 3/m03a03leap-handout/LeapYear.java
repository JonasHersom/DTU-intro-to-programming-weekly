class LeapYear {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);
        
        int year = scanner.nextInt();
        int remainder4 = year % 4;
        int remainder100 = year % 100;
        int remainder400 = year % 400;

        if (remainder4 == 0) {
            if (remainder100 == 0) {
                if (remainder400 == 0) { System.out.println("The year " + year + " is a leap year");
                } else System.out.println("The year " + year + " is not a leap year");
            } else System.out.println("The year " + year + " is a leap year");
        } else System.out.println("The year " + year + " is not a leap year");

        scanner.close();
    }
}
