package beginnerHomeworks.homework8_1;

public class Manager {

    private String name;
    private int age;
    private String gender;
    private int dailySalary;
    private int stuffNumber;


     public double getSalary(int days) {
        double salary = dailySalary * days;

         return salary + salary / 100 * stuffNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDailySalary(int dailySalary) {
        this.dailySalary = dailySalary;
    }

    public void setStuffNumber(int stuffNumber) {
        this.stuffNumber = stuffNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getDailySalary() {
        return dailySalary;
    }

    public int getStuffNumber() {
        return stuffNumber;
    }


}
