class BoatUtils {
    public static Member[] createBoat(int seats) {
        return new Member[seats];
    }

    public static void printBoat(Member[] boat) {
        for (Member x: boat) {
            if (x == null) System.out.println("<Empty seat>");
            else System.out.println(x.description());
        }
    }
    public static boolean isBoatFull(Member[] boat) {
        for (Member x:  boat) {
            if (x == null) return false;
        }
        return true;
    }
    public static boolean assignMember(Member[] boat, Member m) {
        int freeSpot = -1;
    
        for (int i = 0; i < boat.length; i++) {
            if (boat[i] == null) {
                if (freeSpot == -1) freeSpot = i;
            }
            else if (boat[i].equals(m)) return false; 
        }
        if (freeSpot >= 0) {
            boat[freeSpot] = m;
            return true;
        }
        else return false;
    }
}