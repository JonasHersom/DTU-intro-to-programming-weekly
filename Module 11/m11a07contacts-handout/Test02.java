// Do not modify this file!

class Test02 {
    public static void main(String[] args) {
        // Contact data used to test the class 'Contact' below
        var contactsData = new String[][] {
            { "Oliver", "Olesen", "+45123456", "Oliver.Olesen@dtu.dk" },
            { "Oliver", "Olesen", null, "OliverOlesen@dtu.dk" },
            { "Oliver", "Olesen", "", "OliverOlesen@dtu.dk" },
            { "Oliver", "Olesen", "+", "OliverOlesen@dtu.dk" },
            { "Oliver", "Olesen", "+42", "OliverOlesen@dtu.dk" },
            { "Oliver", "Olesen", "42+", "OliverOlesen@dtu.dk" },
            { "Oliver", "Olesen", "+45123x123", "OliverOlesen@dtu.dk" },
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
                System.out.println("    - Failed: " + e.getMessage());
            }
        }
    }
}
