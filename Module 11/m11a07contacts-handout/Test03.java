// Do not modify this file!

class Test03 {
    public static void main(String[] args) {
        // Contact data used to test the class 'Contact' below
        var contactsData = new String[][] {
            { "Tine", "Tange", "45321123", "s123890@student.dtu.dk" },
            { "Tine", "Trolle", "45321123", "" },
            { "Tine", "Trolle", "45321123", null },
            { "Tine", "Toft", "45321123", "tine" },
            { "Tine", "Trolle", "45321123", "@dtu.dk" },
            { "Tine", "Toft", "45321123", "tine@" },
            { "Tine", "Thielsen", "45321123", "tine123@dtu" },
            { "Tine", "Thielsen", "45321123", "tine@@dtu.dk" },
            { "Tine", "Thielsen", "45321123", "tine@dtu@dk" }
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
