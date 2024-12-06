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
        if (arr == null) return true;
        else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == null || arr[i].name == null) return true; 
            }
        }
        return false;
    }

    static boolean containsNull(Company c) {
        if (c == null || c.name == null) return true;

        if (containsNull(c.employees)) return true;
        return false;
    }

    static boolean containsNull(Company[] arr) {
        if (arr == null) return true;
        for (int i = 0; i < arr.length; i++) {
            if (containsNull(arr[i])) return true;
        }
        return false;
        
    }
}
