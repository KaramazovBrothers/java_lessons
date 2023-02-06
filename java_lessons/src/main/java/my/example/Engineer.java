package my.example;

import java.util.Objects;

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

   protected void displayInfo () {
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Engineer engineer)) return false;
        return getSalary() == engineer.getSalary() && getName().equals(engineer.getName()) && getLastName().equals(engineer.getLastName()) && getFunction().equals(engineer.getFunction());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLastName(), getFunction(), getSalary());
    }
}
