public class EmployAndManagement {
    public static void main(String[] args) {
        System.out.println("-----Employer Detail-----");
        employ e = new employ();
        e.name = "Sahil";
        e.id = 001;
        e.salary = " Rs10000";
        e.bonus = (((10000 * 10) / 100));
        e.displayEmployinfo();
        System.out.println();

        System.out.println("-----Manager Detail-----");
        manager m = new manager();
        m.name = "Arjun";
        m.id = 002;
        m.salary = " Rs50000";
        m.department = "IT";
        m.bonus = ((50000 * 10) / 100);
        m.displayManagerinfo();
        System.out.println();

        System.out.println("-----Director Detail-----");
        director d = new director();
        d.name = "Aditya";
        d.id = 003;
        d.salary = " Rs80000";
        d.department = "Finance";
        d.stock = 2000;
        d.bonus = ((80000 * 30) / 100);
        d.displayDirectorinfo();

    }
}

class employ {
    String name, salary;
    int id;
    int bonus;

    void displayEmployinfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("ID: " + id);
        System.out.println("Bonus: " + bonus);
    }
}

class manager extends employ {
    String department;

    void displayManagerinfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);

    }
}

class director extends manager {
    int stock;

    void displayDirectorinfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("stockOption: " + stock);
        System.out.println("Bonus: " + bonus);
    }
}
