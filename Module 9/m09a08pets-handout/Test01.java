// Do not modify this file!

class Test01 {
    public static void main(String[] args) {
        var pets = new Pet[] {
            new Pet("Pernille", "capibara"),
            new Pet("Gustav", "spider crab"),
            new Pet("Leopold", "blobfish")
        };

        System.out.println("Pets:");
        for (var p: pets) {
            System.out.println("  - " + p.getDescription()
                                + "; sound: " + p.getSound());
        }
    }
}
