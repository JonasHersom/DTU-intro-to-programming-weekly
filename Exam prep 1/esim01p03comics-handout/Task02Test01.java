// Do not modify this file!

class Task02Test01 {
    public static void main(String[] args) {
        var comics = new Comic[] {
            new WonderWoman(10, "Spies from Saturn", 1944),
            new WonderWoman(181, "The Wrath of Dr. Cyber", 1969),
            new IronMan(1, "The Golden Avenger", 2014),
            new IronMan(13, "Stark Wars", 2015)
        };

        TestUtils.displayComics(comics);
    }
}
