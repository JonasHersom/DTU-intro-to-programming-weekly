class Conversion {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);
        int seconds = scanner.nextInt();
        scanner.close();

        int minutesTotal = seconds / 60;
        int secondsRemaining = seconds % 60;
        int hoursTotal = minutesTotal / 60;
        int minutesRemaining = minutesTotal % 60;
        int daysTotal = hoursTotal / 24;
        int hoursRemaining = hoursTotal % 24;

        System.out.println(seconds + " seconds equals " + daysTotal + " days, " + hoursRemaining + " hours, " + minutesRemaining + " minutes and " + secondsRemaining + " seconds.");

    }
}
