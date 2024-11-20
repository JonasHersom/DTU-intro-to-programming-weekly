// Do not modify this file!

class Test05 {
    public static void main(String[] args) {
        // Names / surnames used to test the class 'Contact' below
        var tests = new String[] { "Test",
                                   "",
                                   null,
                                   "Another test",
                                   null,
                                   "" };

        var contact = new Contact("Ella", "Ebener", "987", "ee@yahoo.com");
        System.out.println("Current name: " + contact.getName());
        for (var test: tests) {
            System.out.println("Setting name to: '" + test + "'...");
            try {
                contact.setName(test);
                System.out.println("    - OK. The name is now: " + contact.getName());

            } catch (IllegalArgumentException e) {
                System.out.println("    - Failed: " + e.getMessage());
                System.out.println("    - The name is now: " + contact.getName());
            }
            System.out.println("Setting surname to: '" + test + "'...");
            try {
                contact.setSurname(test);
                System.out.println("    - OK. The surname is now: " + contact.getSurname());

            } catch (IllegalArgumentException e) {
                System.out.println("    - Failed: " + e.getMessage());
                System.out.println("    - The surname is now: " + contact.getSurname());
            }
        }
    }
}
