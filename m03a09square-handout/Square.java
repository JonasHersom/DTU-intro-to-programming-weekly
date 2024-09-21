class Square {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);
        
        int input = scanner.nextInt();
        String square = "";

        scanner.close();

        int i = input;
        int j = input;

        while (i != 0) {
            while (j != 0) {
                square = square + "#";
                j = j - 1;
            }
            System.out.println(square);
            j = input;
            i = i - 1;
            square = "";
        }
    }
}
