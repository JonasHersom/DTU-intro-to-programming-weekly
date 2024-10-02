class Utils {
    static int max(int x, int y, int z) {
        int xOrY = (x > y) ? x : y;
        int xOrZ = 0;
        int yOrZ = 0;
        if (xOrY == x) {
            xOrZ = (x > z) ? x : z;
            return xOrZ;
        }
        else if (xOrY == y) {
            yOrZ = (y > z) ? y : z;
            return yOrZ;
        }
    int result = (xOrZ > yOrZ) ? xOrZ : yOrZ; 
    return result;
    }
}
