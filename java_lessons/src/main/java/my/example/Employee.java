package my.example;

public class Employee extends Engineer {

    public String company;

     public Employee(String name, String lastName, String function, int salary, String company) {
        super(name, lastName, function, salary);
        this.company = company;
    }

    public String getCompany() {
         return company;
    }

    @Override
    public void displayInfo () {
         super.displayInfo();
         System.out.println("Employee`s Company: " .concat(company));

    }
    @Override
    public String toString() {
         return company;
    }
}
