class ArrayUtils {
    static int[] rotateLeft(int[] arr){

        if (arr.length == 0) {return arr;}

        int first = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {arr[i] = first;}
            else {arr[i] = arr[i+1];}
        }
        return arr;
    }

    static int[] rotateLeft(int[] arr, int n){
        
        if (arr.length == 0) {return arr;}
        else if (n % arr.length == 0) {return arr;}
        else if (n > arr.length) {n = n % arr.length;}

        int[] arr2 = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            if (i + n < arr.length) {arr2[i] = arr[i + n];}
            else if (i + n >= arr.length) {arr2[i] = arr[i + n - arr.length];}
        }
        return arr2;
    }
}
