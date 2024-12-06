public class ArrayUtils {
    public static boolean contains(int[] arr1, int[] arr2) {
        if (arr2.length == 0) {
            return true;
        }
        
        int arr2Index = 0;
        
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[arr2Index]) {
                arr2Index++;
                
                if (arr2Index == arr2.length) {
                    return true;
                }
            }
        }
        return false;
    }
}
