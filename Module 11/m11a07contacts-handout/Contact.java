class Contact {
    private String name;
    private String surname;
    private String phoneNumber;
    private String email;

    public Contact(String name, String surname, String phone, String email) {
        nameValid(name);
        this.name = name;
        surnameValid(surname);
        this.surname = surname;
        phoneNumberValid(phone);
        this.phoneNumber = phone;
        emailValid(email);
        this.email= email;
    }

    private static void nameValid(String name) {
        if (name == null || name.length() < 1) throw new IllegalArgumentException("Invalid name");
    }
    private static void surnameValid(String surname) {
        if (surname == null || surname.length() < 1) throw new IllegalArgumentException("Invalid surname");
    }
    private static void phoneNumberValid(String phoneNumber) {
        String printError = "Invalid phone number";
        if (phoneNumber == null || phoneNumber.length() < 1) throw new IllegalArgumentException(printError);
        if (phoneNumber.charAt(0) == '+' || isDigit(phoneNumber.charAt(0))) ;
        else throw new IllegalArgumentException (printError);

        int digits = 0;
        for (int i = 1; i < phoneNumber.length(); i++) {
            if (!isDigit(phoneNumber.charAt(i))) throw new IllegalArgumentException (printError);
            else digits++;
        }
        if (digits < 2) throw new IllegalArgumentException (printError);
    }
    private static void emailValid(String email) {
        String printError = "Invalid email address";
        if (email == null || email.length() < 1) throw new IllegalArgumentException(printError);

        var emailSplit = email.split("@");
        if (emailSplit.length != 2) throw new IllegalArgumentException(printError);
        if (emailSplit[0].isEmpty() || emailSplit[1].isEmpty()) {
            throw new IllegalArgumentException(printError);
        }
        
        for (int i = 0; i < emailSplit.length; i++) {
            for (int j = 0; j < emailSplit[i].length(); j++) {
                if (isDigit(emailSplit[i].charAt(j)) || isLetter(emailSplit[i].charAt(j)) || emailSplit[i].charAt(j) == '.');
                else throw new IllegalArgumentException(printError);
            }
        }
    }

    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }
    public String getPhone() {
        return this.phoneNumber;
    }
    public String getEmail() {
        return this.email;
    }

    public void setName(String name) {
        nameValid(name);
        this.name = name;
    }
    public void setSurname(String surname) {
        surnameValid(surname);
        this.surname = surname;
    }
    public void setPhone(String phone) {
        phoneNumberValid(phone);
        this.phoneNumber = phone;
    }
    public void setEmail(String email) {
        emailValid(email);
        this.email = email;
    }

    /**
     * Is the given character a digit?
     * @param c The character to check
     * @return true if the argument 'c' is a digit, false otherwise
     */
    private static boolean isDigit(char c) {
        return ((c >= '0') && (c <= '9'));
    }

    /**
     * Is the given character a letter?
     * @param c The character to check
     * @return true if the argument 'c' is a digit, false otherwise
     */
    private static boolean isLetter(char c) {
        return (((c >= 'a') && (c <= 'z')) || ((c >= 'A') && (c <= 'Z')));
    }
}
