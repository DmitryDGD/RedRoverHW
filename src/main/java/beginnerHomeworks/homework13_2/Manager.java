package beginnerHomeworks.homework13_2;

public class Manager extends BaseEmployee {
    private String name;
    private int age;
    private String gender;
    private double salaryInDay;
    private int numberOfSubordinates;


    @Override
    public double getSalary(Month[] monthsArray) {
        double salary = 0.0;
        double rate = (double)numberOfSubordinates / 100;

        for (Month i:monthsArray) {
            salary += i.getWorkingDays() * salaryInDay * rate;
        }

        return salary;
    }

    public Manager(String name, int age, String gender, double salaryInDay, int numberOfSubordinates) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salaryInDay = salaryInDay;
        this.numberOfSubordinates = numberOfSubordinates;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalaryInDay() {
        return salaryInDay;
    }

    public void setSalaryInDay(double salaryInDay) {
        this.salaryInDay = salaryInDay;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }
}
