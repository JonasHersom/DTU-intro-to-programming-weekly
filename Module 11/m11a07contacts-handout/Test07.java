// Do not modify this file!

class Test07 {
    public static void main(String[] args) {
        // Email addresses used to test the class 'Contact' below
        var emails = new String[] { "email@test42.com",
                                    "email.address@test.com",
                                    "email.address.123",
                                    null,
                                    "email.address.123@compute.dtu.dk",
                                    "email",
                                    "@test.com" };

        var contact = new Contact("Thyge", "Taarnby", "123", "rr@email.com");
        System.out.println("Current email: " + contact.getEmail());
        for (var email: emails) {
            System.out.println("Setting email to: '" + email + "'...");
            try {
                contact.setEmail(email);
                System.out.println("    - OK. The email is now: " + contact.getEmail());

            } catch (IllegalArgumentException e) {
                System.out.println("    - Failed: " + e.getMessage());
                System.out.println("    - The email is now: " + contact.getEmail());
            }
        }
    }
}
