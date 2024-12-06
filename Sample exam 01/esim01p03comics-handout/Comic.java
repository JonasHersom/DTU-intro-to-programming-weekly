import java.io.FileNotFoundException;

class Comic {
    private String series;
    private int number;
    private String title;
    private int year;

    public Comic(String series, int number, String title, int year) {
        this.series = series;
        this.number = number;
        this.title = title;
        this.year = year;
    }

    public String getDescription() {
        return  this.series + " no. " + this.number + " - " + this.title + " (" + this.year + ")"; 
    }

    public static void saveComics(Comic[] comics, String filename) throws FileNotFoundException {
        var printer = new java.io.PrintWriter(filename);
        for (int i = 0; i < comics.length; i++){
            printer.println(i + 1 + ". " + comics[i].getDescription());
        }
        printer.close();
    }

}
class IronMan extends Comic {

    public IronMan(int number, String title, int year) {
        super("Iron Man", number, title, year);
    }
}
class WonderWoman extends Comic {

    public WonderWoman(int number, String title, int year) {
        super("Wonder Woman", number, title, year);
    }
}
