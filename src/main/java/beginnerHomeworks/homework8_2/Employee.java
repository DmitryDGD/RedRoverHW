package beginnerHomeworks.homework8_2;

public class Employee {

    String name;
    int baseSalary;


    public Employee(String name, int baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }
}
