// Do not modify this class!
class Employee {
    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Do not modify this class!
class Company {
    String name;
    Employee[] employees;

    Company(String name, Employee[] employees) {
        this.name = name;
        this.employees = employees;
    }
}

class NullFinder {
    static boolean containsNull(Employee[] arr) {
        // Write your code here
    }

    static boolean containsNull(Company c) {
        // Write your code here
    }

    static boolean containsNull(Company[] arr) {
        // Write your code here
    }
}
