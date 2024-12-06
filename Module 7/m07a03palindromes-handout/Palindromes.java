class Palindromes {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            boolean palindrome = true;
            for (int j = 0; j < args[i].length(); j++) {
                if (args[i].charAt(j) != args[i].charAt(args[i].length() - j - 1)) palindrome = false;
            }
            if (palindrome == true) System.out.println(args[i] + " is a palindrome");
            else System.out.println(args[i] + " is not a palindrome");
        }
    }
}
