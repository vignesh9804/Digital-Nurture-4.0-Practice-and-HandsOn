// FollowingSrp.java

/* 
    Here We follow SRP Principle

    In Employee class it Handles only Employee data & Methods 
    In EmployeePrinter class it Handels printing employee Details 

    BY Writing different classes for different purposes it will be easy when other functionality is used or updated the functions of existing Methods.
 */

public class FollowingSrp {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 60000);

        EmployeePrinter printer = new EmployeePrinter();
        printer.printDetails(emp);

        EmployeePersistence persistence = new EmployeePersistence();
        persistence.saveToFile(emp);
    }
}

// Only handles employee data
class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}

// Only handles printing
class EmployeePrinter {
    public void printDetails(Employee emp) {
        System.out.println("Name: " + emp.getName() + ", Salary: " + emp.getSalary());
    }
}

// Only handles persistence
class EmployeePersistence {
    public void saveToFile(Employee emp) {
        System.out.println("Saving employee '" + emp.getName() + "' to file...");
        // Simulated file save
    }
}

/* */