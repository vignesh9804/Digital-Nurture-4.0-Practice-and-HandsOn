// NotFollowingSrp.java

/*

Here in Employee class it has all functions.

Suppose in future we want to edit source code in printDetails for other values then it leads not folowing SRP principle.

To solve this problem we should use different class for different functionality check Following.java code for example purpose to understand.

*/

public class NotFollowingSrp {
    public static void main(String[] args) {
        Employee emp = new Employee("John", 50000);
        emp.printDetails();
        emp.saveToFile();
    }
}

class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    // Responsibility 1: Employee data
    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    // Responsibility 2: Printing employee details
    public void printDetails() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }

    // Responsibility 3: Saving employee to file
    public void saveToFile() {
        System.out.println("Saving employee '" + name + "' to file...");
        // Simulated file save
    }
}
