class Utils {
    static double max(double[] values) {
        double i = values[0];
        for (double x: values) {
            if (x > i) {i = x;}
        }
        return i;
    }
}
