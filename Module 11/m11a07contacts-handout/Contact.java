class Contact {
    private String name;
    private String surname;
    private String phoneNumber;
    private String email;

    public Contact(String name, String surname, String phone, String email) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phone;
        this.email= email;
        isValid();
    }

    private void isValid() {
        if (this.name == null || name.length() < 1) throw new IllegalArgumentException("Invalid name");
        if (this.surname == null || surname.length() < 1) throw new IllegalArgumentException("Invalid surname");
        if (this.phoneNumber == null || phoneNumber.length() < 1) throw new IllegalArgumentException("Invalid phone number");
        if (this.email == null || email.length() < 1) throw new IllegalArgumentException("Invalid email");

        if (this.phoneNumber.charAt(0) == '+' || isDigit(this.phoneNumber.charAt(0))) ;
        else throw new IllegalArgumentException ("Invalid phone number");

        int digits = 0;
        for (int i = 1; i < this.phoneNumber.length(); i++) {
            if (!isDigit(this.phoneNumber.charAt(i))) throw new IllegalArgumentException ("Invalid phone number");
            else digits++;
        }
        if (digits < 2) throw new IllegalArgumentException ("Invalid phone number");

        var emailSplit = email.split("@");
        if (emailSplit.length != 2) throw new IllegalArgumentException("Invalid email");
        if (emailSplit[0].isEmpty() || emailSplit[1].isEmpty()) {
            throw new IllegalArgumentException("Invalid email");
        }
        
        for (int i = 0; i < emailSplit.length; i++) {
            for (int j = 0; j < emailSplit[i].length(); j++) {
                if (isDigit(emailSplit[i].charAt(j)) || isLetter(emailSplit[i].charAt(j)) || emailSplit[i].charAt(j) == '.');
                else throw new IllegalArgumentException("Invalid email");
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
        this.name = name;
        isValid();
    }
    public void setSurname(String surname) {
        this.surname = surname;
        isValid();
    }
    public void setPhone(String phone) {
        this.phoneNumber = phone;
        isValid();
    }
    public void setEmail(String email) {
        this.email = email;
        isValid();
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
