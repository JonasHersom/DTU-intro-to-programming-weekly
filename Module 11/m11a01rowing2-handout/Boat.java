class Boat {
    private int seats;
    private Member[] m;

    public Boat(int seats) {
        this.seats = seats;
        this.m = new Member[seats];
    }

    public void print() {
        if (this.m == null) {
            for (int i = 0; i < seats; i++) {
                System.out.println("<Empty seat>");
            }
            return;
        }

        for (int i = 0; i < seats; i++) {
            if (this.m[i] != null) System.out.println(this.m[i].description());
            else System.out.println("<Empty seat>");
        }
    }

    public boolean isFull() {
        if (this.m == null) return false;

        for (int i = 0; i < seats; i++) {
            if (this.m[i] == null) return false;
        }
        return true;
    }
    public boolean assignMember(Member m) {
        if (this.m == null) return false;

        for (int i = 0; i < this.m.length; i++) {
            if (this.m[i] != null) {
                if (this.m[i].equals(m)) return false;
            }
        }

        for (int i = 0; i < this.m.length; i++) {
            if (this.m[i] == null) {
                this.m[i] = m;
                return true;
            }
        }

        return false;
    }
}