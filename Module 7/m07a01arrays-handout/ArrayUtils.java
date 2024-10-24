class ArrayUtils {
    static boolean areEqual(int[] arr1, int[] arr2) {

        if (arr1.length != arr2.length) return false; 

        for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }


    static boolean areEqual(int[][] arrArr1, int[][] arrArr2) {

        if (arrArr1.length != arrArr2.length) return false; 

        for (int i = 0; i < arrArr1.length; i++) {
            if (arrArr1[i].length != arrArr2[i].length) return false; 
            
            for (int j = 0; j < arrArr1[i].length; j++) {
                if (arrArr1[i][j] != arrArr2[i][j]) return false;
            }
        }
        return true;

    }

}
