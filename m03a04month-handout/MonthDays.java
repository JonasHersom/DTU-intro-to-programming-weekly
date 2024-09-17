class MonthDays {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);
        
        String inputMonth = scanner.nextLine();
        int year = scanner.nextInt();
        int daysInMonth = 0;

        switch (inputMonth.toLowerCase()) {
            case "january":
                daysInMonth = 31;

            case "february":
                daysInMonth = 28;

            case "march":
                daysInMonth = 31;
           
            case "april":
                daysInMonth = 30;
          
            case "may":
                daysInMonth = 31;
            case "june":
                daysInMonth = 30;
            case "juli":
                daysInMonth = 31;
            case "august":
                daysInMonth = 30;
            case "september":
                daysInMonth = 31;
            case "october":
                daysInMonth = 30;
            case "november":
                daysInMonth = 31;
            case "december":
                daysInMonth = 30;
            default:
                daysInMonth = 31;
        };
        
        System.out.println("The month of " + inputMonth + " has " + daysInMonth + " days");

        
        //System.out.println(month);

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
