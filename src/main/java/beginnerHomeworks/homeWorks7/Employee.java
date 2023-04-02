package beginnerHomeworks.homeWorks7;

import java.util.Objects;

public class Employee {
    String name;
    int age;
    String gender;
    int salary;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(int salary) {
        this.salary = salary;
    }



    public boolean isSameName(Employee employee) {
      return Objects.equals(this.name, employee.name);
    }


    public static void main(String[] args) {
        Employee employee1 = new Employee("Alex");
        Employee employee2 = new Employee("Brand");

        System.out.println(employee1.isSameName(employee2));
    }

}
