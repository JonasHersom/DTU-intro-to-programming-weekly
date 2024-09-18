class MonthDays {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);
        
        String inputMonth = scanner.nextLine();
        int year = scanner.nextInt();
        int daysInMonth = 0;
        boolean leap = false;
        scanner.close();

        switch (inputMonth.toLowerCase()) {
            case "january":
                daysInMonth = 31;
                break;
            case "february":
                int remainder4 = year % 4;
                int remainder100 = year % 100;
                int remainder400 = year % 400;

                if (remainder4 == 0) {
                    if (remainder100 == 0) {
                        if (remainder400 == 0) { leap = true;
                        } else leap = false;
                    } else leap = true;
                } else leap = false;
            if (leap == true) {
                daysInMonth = 29;
            } else {
                daysInMonth = 28; 
            }
            break;

            case "march":
                daysInMonth = 31;
                break;
            case "april":
                daysInMonth = 30;
                break;
            case "may":
                daysInMonth = 31;
                break;
            case "june":
                daysInMonth = 30;
                break;
            case "july":
                daysInMonth = 31;
                break;
            case "august":
                daysInMonth = 30;
                break;
            case "september":
                daysInMonth = 31;
                break;
            case "october":
                daysInMonth = 30;
                break;
            case "november":
                daysInMonth = 31;
                break;
            case "december":
                daysInMonth = 30;
                break;
        };
        System.out.println("The month of " + inputMonth + " " + year + " has " + daysInMonth + " days");
        
    }
}
