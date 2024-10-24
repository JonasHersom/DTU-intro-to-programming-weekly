// Do not modify this file!

class Test05 {
    public static void main(String[] args) {
        var c1 = new Character("Link", 15, 15);
        var c2 = new Character("Lara Croft", 17, 13);
        var c3 = new Character("Doomguy", 90, 90);
        var c4 = new Character("Guybrush Threepwood", 9, 8);
        var c5 = new Character("Princess Peach", 12, 9);

        var arr1 = new Character[] { c4, c2, c5};
        System.out.println("(1) Looking for the best character among:");
        display(arr1);
        Character.printBest(arr1);

        System.out.println("");

        var arr2 = new Character[] { c5, c4 };
        System.out.println("(2) Looking for the best character among:");
        display(arr2);
        Character.printBest(arr2);

        System.out.println("");

        var arr3 = new Character[] { c1 };
        System.out.println("(3) Looking for the best character among:");
        display(arr3);
        Character.printBest(arr3);

        System.out.println("");

        var arr4 = new Character[] { };
        System.out.println("(4) Looking for the best character among:");
        System.out.println("    <empty array>");
        Character.printBest(arr4);

        System.out.println("");

        var arr5 = new Character[] { c1, c2 };
        System.out.println("(5) Looking for the best character among:");
        display(arr5);
        Character.printBest(arr5);

        System.out.println("");

        var arr6 = new Character[] { c5, c1, c4, c2 };
        System.out.println("(6) Looking for the best character among:");
        display(arr6);
        Character.printBest(arr6);

        System.out.println("");

        var arr7 = new Character[] { c1, c2, c3, c4, c5 };
        System.out.println("(7) Looking for the best character among:");
        display(arr7);
        Character.printBest(arr7);
    }

    // Utility method to display an array of characters
    static void display(Character[] characters) {
        for (var c: characters) {
            System.out.println("    - " + c.description());
        }
    }
}
