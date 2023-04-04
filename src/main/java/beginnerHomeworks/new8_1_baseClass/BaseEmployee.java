package beginnerHomeworks.new8_1_baseClass;

public class BaseEmployee {

    private String name;
    private int age;
    private int dailySalary;

     public int getSalary(int days) {
        return dailySalary * days;
    }

    public BaseEmployee(String name, int age, int dailySalary) {
        this.name = name;
        this.age = age;
        this.dailySalary = dailySalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDailySalary() {
        return dailySalary;
    }

    public void setDailySalary(int dailySalary) {
        this.dailySalary = dailySalary;
    }
}
