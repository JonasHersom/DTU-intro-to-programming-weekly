// Do not modify this file!

class Test06 {
    public static void main(String[] args) {
        // Phone numbers used to test the class 'Contact' below
        var phones = new String[] { "123456",
                                    "",
                                    "+",
                                    null,
                                    "+12",
                                    "+123+",
                                    "12+",
                                    "123k456" };

        var contact = new Contact("Rikke", "Rindbo", "123", "rr@email.com");
        System.out.println("Current phone: " + contact.getPhone());
        for (var phone: phones) {
            System.out.println("Setting phone to: '" + phone + "'...");
            try {
                contact.setPhone(phone);
                System.out.println("    - OK. The phone is now: " + contact.getPhone());

            } catch (IllegalArgumentException e) {
                System.out.println("    - Failed: " + e.getMessage());
                System.out.println("    - The phone is now: " + contact.getPhone());
            }
        }
    }
}
