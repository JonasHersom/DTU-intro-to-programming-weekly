class UniqueArgs {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            boolean duplicate = false;
            for (int j = 0; j < args.length; j++) {
                if ( i != j) {
                    if (args[i].equals(args[j])) {
                            duplicate = true;
                    }
                }
            }
            if (duplicate == false) {
                System.out.println(args[i]);
            }
        }
    }
}