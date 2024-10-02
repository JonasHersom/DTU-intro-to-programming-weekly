class Discount {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);
        
        double price = scanner.nextDouble();

        scanner.close();

        double discount = 0;
        String discountPrint = "";
        if (price >= 1000) {discount = 0.8; discountPrint = "20";}
        else if (price >= 500) {discount = 0.9; discountPrint = "10";}
        else if (price >= 250) {discount = 0.95; discountPrint = "5";}
        else {discount = 1; discountPrint = "0";}

        price = price * discount;

        System.out.println("The discounted price is " + price + " (discount: " + discountPrint + "%)");
    }
}
