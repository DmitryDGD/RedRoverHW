package beginnerHomeworks.homework13_2;

public final class Employee extends BaseEmployee {
    private String name;
    private int age;
    private String gender;
    private double salaryInDay;

    @Override
    public double getSalary(Month[] monthsArray) {
        double salary = 0.0;

        for (Month i:monthsArray) {
            salary += i.getWorkingDays() * salaryInDay;
        }

        return salary;
    }

    public Employee(String name, int age, String gender, double salaryInDay) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salaryInDay = salaryInDay;
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


}
