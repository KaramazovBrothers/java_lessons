package my.example;

public class Engineer {
    String name;
    String lastName;
    String function;
    int salary;

    public Engineer (String name, String lastName, String function, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.function = function;
        this.salary = salary;
    }

    public void displayInfo () {
        System.out.println("Engineer`s name:" + name + "\nLast_name:" + lastName + "\nFunction:" + function + "\nSalary:" + salary);
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFunction() {
        return function;
    }

    public int getSalary() {
        return salary;
    }
}
