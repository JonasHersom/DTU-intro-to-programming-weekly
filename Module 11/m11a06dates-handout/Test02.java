// Do not modify this file!

class Test02 {
    public static void main(String[] args) {
        // Years, months, and days used to test the Date class below
        var yearsMonthsDays = new int[][] { {2000, 1, 1},
                                            {2001, 6, 19},
                                            {2002, 20, 20},
                                            {2003, 3, 0},
                                            {2004, 2, 29},
                                            {2005, 2, 29},
                                            {2006, 6, 31},
                                            {2007, 0, 0},
                                            {2008, 10, 50} };

        for (var ymd: yearsMonthsDays) {
            var y = ymd[0];
            var m = ymd[1];
            var d = ymd[2];
            System.out.print("Is Date(" + y + ", " + m + ", " + d + ") valid? ");
            try {
                var date = new Date(y, m, d);
                System.out.println("Yes.  The 'date' object contains:");
                System.out.println("    - date.year = " + date.year);
                System.out.println("    - date.month = " + date.month);
                System.out.println("    - date.day = " + date.day);
            } catch (IllegalArgumentException e) {
                System.out.println("No.");
            }
            System.out.println("");
        }
    }
}
