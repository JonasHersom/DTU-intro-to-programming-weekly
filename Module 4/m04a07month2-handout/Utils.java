class Utils {

    public static Object max(int a, int b, int c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'max'");
    }
    // Write your code here. Note that you need to define two static methods!
    public static int monthNumber(String monthName) {

        int number = switch(monthName.toLowerCase()) {
            case "january" -> 1;
            case "february" -> 2;
            case "march" -> 3;
            case "april" -> 4;
            case "may" -> 5;
            case "june" -> 6;
            case "july" -> 7;
            case "august" -> 8;
            case "september" -> 9;
            case "october" -> 10;
            case "november" -> 11;
            case "december" -> 12;
            default -> 0;
        };
        return number;
    }
    public static int daysInMonth (int monthNumber, int year) {
        int days = 0;
        switch (monthNumber) {
            case 1: days = 31; break;
            case 2:
                if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {days = 29;} 
                else {days = 28;} break;
            case 3: days = 31; break;
            case 4: days = 30; break;
            case 5: days = 31; break;
            case 6: days = 30; break;
            case 7: days = 31; break;
            case 8: days = 31; break;
            case 9: days = 30; break;
            case 10: days = 31; break;
            case 11: days = 30; break;
            case 12: days = 31; break;
            default: days = 0;
        };
        return days;
    }
}
