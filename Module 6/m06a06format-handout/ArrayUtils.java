class ArrayUtils {
    static String format(int[] arr) {
        String formattedNumbers = "";
        for (int x: arr) {
            formattedNumbers = formattedNumbers + x;
            if (x != arr[arr.length - 1]) formattedNumbers = formattedNumbers + " ";
        }
        return formattedNumbers;
    }

    static String format(int[][] arr) {
        String formattedNumbers = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                formattedNumbers = formattedNumbers + arr[i][j];
                if (j != arr[i].length - 1) formattedNumbers = formattedNumbers + " ";
            }
            if (i != arr.length - 1) formattedNumbers = formattedNumbers + System.lineSeparator();
        }
        return formattedNumbers;
    }
    
}
