class Utils {
    static int count(int v, int[] values) {
        int i = 0;
        for (int x: values) {
            if (x == v) {i++;}
        }
        return i;
    }
}
