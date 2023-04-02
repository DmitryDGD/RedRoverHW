package beginnerHomeworks.homework8_1;

public class Employee {

    private String name;
    private int age;
    private int dailySalary;


    public int getSalary(int days) {
        return dailySalary * days;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDailySalary(int dailySalary) {
        this.dailySalary = dailySalary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getDailySalary() {
        return dailySalary;
    }


}
