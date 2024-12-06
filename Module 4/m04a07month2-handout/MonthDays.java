// Do not modify this file!

class MonthDays {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);

        var monthName = scanner.nextLine();
        var year = scanner.nextInt();

        scanner.close();

        var monthNumber = Utils.monthNumber(monthName);
        var days = Utils.daysInMonth(monthNumber, year);

        System.out.println("The month of " + monthName + " " + year + " has " + days + " days");
    }
}
