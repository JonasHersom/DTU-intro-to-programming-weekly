// Do not modify this file!

class Test04 {
    public static void main(String[] args) {
        // Contact data used to test the class 'Contact' below
        var contactsData = new String[][] {
            { "Magnus", "Magnusen", "+449876543", "m.m@outlook.com" },
            { null, null, "+449876543", "m.m@outlook.com" },
            { "Magnus", "", "4+49876543", "m.m@outlook.com" },
            { "", "", "449876543", "m.m@outlook.com" },
            { "Magnus", "Magnusen", "+44e9876543", "m.m@@outlook.com" },
            { "", "Magnusen", "+44e9876543", "m.m@outlook.com" },
            { "Magnus", "Magnusen", null, "m.m" },
            { "Magnus", "Magnusen", "+", "m.m" },
        };

        for (var data: contactsData) {
            var name = data[0];
            var surname = data[1];
            var phone = data[2];
            var email = data[3];
            System.out.println("Creating contact: '"
                             + name + "', '" + surname + "', '"
                              + phone + "', '" + email + "'...");
            try {
                var contact = new Contact(name, surname, phone, email);
                System.out.println("    - OK");

            } catch (IllegalArgumentException e) {
                System.out.println("    - Failed");
            }
        }
    }
}
