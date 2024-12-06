class Particle {
    private int particleRow;
    private int particleColumn;
    private int gridRows;
    private int gridColumns;
    private String direction;
    

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
    public String getDirection() {
        return this.direction;
    }

    public void move() {

        switch (this.direction.charAt(0)) {
            case 'N': {
                if (this.particleRow == 0) {
                    this.direction = this.direction.replace('N', 'S');
                    this.particleRow++;
                }
                if (this.direction.charAt(0) == 'N') this.particleRow --;
                break; 
            }
            case 'E': {
                if (this.particleColumn == this.gridColumns - 1) {
                    this.direction = this.direction.replace('E', 'W');
                    this.particleColumn--;
                }
                if (this.direction.charAt(0) == 'E') this.particleColumn ++;
                break; 
            }
            case 'S': {
                if (this.particleRow == this.gridRows - 1) {
                    this.direction = this.direction.replace('S', 'N');
                    this.particleRow--;
                }
                if (this.direction.charAt(0) == 'S') this.particleRow ++;
                break; 
            }
            case 'W': {
                if (this.particleColumn == 0) {
                    this.direction = this.direction.replace('W', 'E');
                    this.particleColumn ++;
                }
                if (this.direction.charAt(0) == 'W') this.particleColumn --;
                break; 
            }
            default: break; 
        }

        // second direction

        if (this.direction.length() == 2) {
            switch (this.direction.charAt(1)) {
                case 'N': {
                    if (this.particleRow == 0) {
                        this.direction = this.direction.replace('N', 'S');
                        this.particleRow++;
                    }
                    if (this.direction.charAt(1) == 'N') this.particleRow --;
                    break; 
                }
                case 'E': {
                    if (this.particleColumn == this.gridColumns - 1) {
                        this.direction = this.direction.replace('E', 'W');
                        this.particleColumn--;
                    }
                    if (this.direction.charAt(1) == 'E') this.particleColumn ++;
                    break; 
                }
                case 'S': {
                    if (this.particleRow == this.gridRows - 1) {
                        this.direction = this.direction.replace('S', 'N');
                        this.particleRow--;
                    }
                    if (this.direction.charAt(1) == 'S') this.particleRow ++;
                    break; 
                }
                case 'W': {
                    if (this.particleColumn == 0) {
                        this.direction = this.direction.replace('W', 'E');
                        this.particleColumn ++;
                    }
                    if (this.direction.charAt(1) == 'W') this.particleColumn --;
                    break; 
                }
                default: break; 
            }
        }
    }

    public String display() {
        StringBuilder grid = new StringBuilder();
    
        grid.append("+");
        for (int i = 0; i < this.gridColumns; i++) {
            grid.append("-");
        }
        grid.append("+\n");
    
        for (int i = 0; i < this.gridRows; i++) {
            grid.append("|");
            for (int j = 0; j < this.gridColumns; j++) {
                if (i == this.particleRow && j == this.particleColumn) {
                    grid.append("*"); 
                } else {
                    grid.append(" "); 
                }
            }
            grid.append("|\n");
        }
    
        grid.append("+");
        for (int i = 0; i < this.gridColumns; i++) {
            grid.append("-");
        }
        grid.append("+\n");
    
        grid.append("Position: (" + this.particleRow + "," + this.particleColumn + "); direction: " + this.direction + System.lineSeparator());
        return grid.toString();
    }
    
}