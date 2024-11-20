class Particle {
    int particleRow;
    int particleColumn;
    int gridRows;
    int gridColumns;
    String direction;
    

    public Particle(int row, int column, int gridRows, int gridColumns, String direction) {
        this.particleRow = row;
        this.particleColumn = column;
        this.gridRows = gridRows;
        this.gridColumns = gridColumns;
        this.direction = direction;
    }

    public int getRow() {
        return this.particleRow;
    }

    public int getColumn() {
        return this.particleColumn;
    }
}