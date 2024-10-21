class Matrix {
    static double[][] mult(double[][] a, double[][] b) {

        if (a[0].length != b.length) {
            System.out.println("ERROR: the matrices cannot be multiplied");
            return new double[][]{};
        }

        int rows = a.length;
        int cols = b[0].length;
        int commonDimension = b.length;

        double[][] multipliedMatrix = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                multipliedMatrix[i][j] = 0;
                for (int k = 0; k < commonDimension; k++) {
                    multipliedMatrix[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return multipliedMatrix;
    }
}
