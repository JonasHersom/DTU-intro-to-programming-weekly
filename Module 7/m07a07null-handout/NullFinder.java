class NullFinder {
    static boolean containsNull(int[] arr) {
        if (arr==null) return true;
        else return false;
    }

    static boolean containsNull(String[] arr) {
        if (arr==null) return true;
        else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == null) return true; 
            }
        }
        return false;
    }

    static boolean containsNull(int[][] arrArr) {
        if (arrArr == null) return true;
        else {
            for (int i = 0; i < arrArr.length; i++) {
                if (arrArr[i] == null) return true; 
            }
        }
        return false;
    }

    static boolean containsNull(String[][] arrArr) {
        if (arrArr==null) return true;
        else {
            for (int i = 0; i < arrArr.length; i++) {
                if (arrArr[i] == null) return true; 
                for (int j = 0; j < arrArr[i].length; j++) {
                    if (arrArr[i][j] == null) return true; 
                }
            }
        }
        return false;
    }
}
