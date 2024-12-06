class Movie {
    private String title;
    private String opinion;

    public Movie(String title, String opinion) {
        titleValid(title);
        this.title = title;
        opinionValid(opinion);
        this.opinion = opinion;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        titleValid(title);
        this.title = title;
    }

    public String getOpinion() {
        return this.opinion;
    }

    public void setOpinion(String opinion) {
        opinionValid(opinion);
        this.opinion = opinion;
    }

    public boolean isBetterThan(Movie other) {
        return (opinionToNumber(this.opinion) > opinionToNumber(other.opinion));
    }

    public static void titleValid(String title) {
        String printError = "Invalid title: '" + title + "'";
        if (title == null) throw new IllegalArgumentException (printError);
        if (title.length() == 0) throw new IllegalArgumentException (printError);
        if (title.charAt(0) == ' ') throw new IllegalArgumentException (printError);
        if (title.charAt(title.length() - 1) == ' ') throw new IllegalArgumentException (printError);
        boolean lastWasSpace = false;
        for (int i = 0; i < title.length(); i++) {
            if (title.charAt(i) == ' ' && lastWasSpace) throw new IllegalArgumentException (printError); // Could have done something with title.charAt(i - 1 / i + 1) but could create OOB errors so not worth the bother
            if (title.charAt(i) == ' ') lastWasSpace = true;
            else lastWasSpace = false;
        }
    }

    public static void opinionValid(String opinion) {
        String printError = "Invalid opinion: '" + opinion + "'";
        if (opinion == null) throw new IllegalArgumentException (printError);
        if (opinion.length() == 0) throw new IllegalArgumentException (printError);
        if (!opinion.equals("rotten") && 
            !opinion.equals("meh") && 
            !opinion.equals("legit") && 
            !opinion.equals("rad") && 
            !opinion.equals("wicked")
        ) throw new IllegalArgumentException (printError);
    }

    public static int opinionToNumber (String opinion) {
        int number = switch(opinion) {
            case "rotten" -> 1;
            case "meh" -> 2;
            case "legit" -> 3;
            case "rad" -> 4;
            case "wicked" -> 5;
            default -> 0;
        };
        return number;
    }
}
