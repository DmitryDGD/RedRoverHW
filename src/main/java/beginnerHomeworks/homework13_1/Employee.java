package beginnerHomeworks.homework13_1;

public abstract class Employee {

    private String name;
    private int baseSalary;

    public abstract double getSalary();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }
}
