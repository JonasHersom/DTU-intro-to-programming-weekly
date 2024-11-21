class Date {
    public final int year;
    public final int month;
    public final int day;

    public Date(int y, int m, int d) {
        this.year = y;
        this.month = m;
        this.day = d;
        if (!isValid()) throw new IllegalArgumentException("Invalid date"); 
    }

    String toISO() {
        if (this.day <= 9 && this.month <= 9) return this.year + "-0" + this.month + "-0" + this.day;
        else if (this.month <= 9) return this.year + "-0" + this.month + "-" + this.day;
        else if (this.day <= 9) return this.year + "-" + this.month + "-0" + this.day;
        else return this.year + "-" + this.month + "-" + this.day;
    }

    private boolean isValid() {

        if (this.day <= 0) return false;
        
        if (this.day <= daysInMonth(this.month, this.year)) return true;
        else return false;
    }

    int daysUntil(Date target) {
        int currentDay = this.day;
        int currentMonth = this.month;
        int currentYear = this.year;
        int daysAway = 0;
    
        if (currentYear == target.year && currentMonth == target.month && currentDay == target.day) {
            return 0;
        }
    
        while (currentYear < target.year) {
            daysAway += (isLeapYear(currentYear)) ? 366 : 365;
            currentYear++;
        }
    
        while (currentMonth < target.month) {
            daysAway += daysInMonth(currentMonth, currentYear);
            currentMonth++;
        }
    
        while (currentMonth > target.month) {
            currentMonth--;
            daysAway -= daysInMonth(currentMonth, currentYear);
        }
    
        daysAway += (target.day - currentDay);
    
        return daysAway;
    }
    
    boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    
    int daysInMonth(int month, int year) {
        switch (month) {
            case 1: return 31;
            case 2: return (isLeapYear(year)) ? 29 : 28;
            case 3: return 31;
            case 4: return 30;
            case 5: return 31;
            case 6: return 30;
            case 7: return 31;
            case 8: return 31;
            case 9: return 30;
            case 10: return 31;
            case 11: return 30;
            case 12: return 31;
            default: return 0; 
        }
    }
    

}

