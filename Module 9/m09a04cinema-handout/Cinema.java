class Cinema {
    private int[] seatsOnRows;
    private boolean[][] bookedSeats;

    public Cinema(int[] seatsOnRows) {
        this.seatsOnRows = seatsOnRows;
        this.bookedSeats = new boolean[this.seatsOnRows.length][]; 

        for (int i = 0; i < this.seatsOnRows.length; i++) {
            this.bookedSeats[i] = new boolean[this.seatsOnRows[i]]; 
        }
    }

    public int rows() {
        return this.seatsOnRows.length;
    }

    public int seatsOnRow(int row) {
        if (row < 0 || row >= this.seatsOnRows.length) return 0;

        return this.seatsOnRows[row];
    }
    public int seats() {
        int totalSeats = 0;
        for (int rowOfSeats: this.seatsOnRows) {
            totalSeats += rowOfSeats;
        }
        return totalSeats;
    }
    public int rowVacancies(int row) {
        if (row < 0 || row >= this.seatsOnRows.length) return 0;
        int vacancies = 0;
        for (int i = 0; i < this.seatsOnRows[row]; i++) {
            if (this.bookedSeats[row][i] == false) vacancies++;
        }
        return vacancies;
    }
    public int vacancies() {
        int vacancies = 0;
        for (int i = 0; i < this.seatsOnRows.length; i++) {
            for (int j = 0; j < this.seatsOnRows[i]; j++) {
                if (this.bookedSeats[i][j] == false) vacancies++;
            }
        }
        return vacancies;
    }
    public void book(int row, int column) {
        if (row < 0 || row >= this.seatsOnRows.length || column < 0 || column >= this.seatsOnRows[row]) return;

        this.bookedSeats[row][column] = true;
    }
    public void release(int row, int column) {
        if (row < 0 || row >= this.seatsOnRows.length || column < 0 || column >= this.seatsOnRows[row]) return;

        this.bookedSeats[row][column] = false;
    }
    public String seatMap() {
        String map = "";
        for (int i = 0; i < this.seatsOnRows.length; i++) {
            for (int j = 0; j < this.seatsOnRows[i]; j++) {
                if (this.bookedSeats[i][j] == true) map += "X";
                else map += ".";
            }
            map += System.lineSeparator();
        }
        return map;
    }

}