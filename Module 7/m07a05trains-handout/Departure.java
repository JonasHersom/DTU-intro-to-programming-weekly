class Departure {
    int hour;
    int minutes;
    String destination;

    Departure(int hour, int minutes, String destination) {
        this.hour = hour;
        this.minutes = minutes;
        this.destination = destination;
    }

    String description() {
        return this.hour + ":" + this.minutes + " to " + destination;
    }

    boolean leavesBefore(Departure other) {
        if (this.hour < other.hour || this.hour == other.hour && this.minutes < other.minutes) return true;
        else return false;
    }

    void delay(int minutes) {
        this.minutes += minutes;
        while (this.minutes >= 60) {
            this.minutes -= 60;
            this.hour++;
        }

    }
}
