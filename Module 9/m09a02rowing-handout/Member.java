// Do not modify this file!

class Member {
    private String name;
    private int age;
    
    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Member other) {
        return (this.name.equals(other.name)) && (this.age == other.age);
    }

    public String description() {
        return this.name + " (age: " + this.age + ")";
    }
}
