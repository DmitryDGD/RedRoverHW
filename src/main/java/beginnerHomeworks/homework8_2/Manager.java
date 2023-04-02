package beginnerHomeworks.homework8_2;

public class Manager extends Employee {


    int numberOfSubordinates;

    public Manager(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getSalary() {
        if (numberOfSubordinates == 0) {
            return baseSalary;
        } else return baseSalary * (numberOfSubordinates / 100 * 3);
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }
}


