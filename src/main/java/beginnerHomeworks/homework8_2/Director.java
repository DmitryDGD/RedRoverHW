package beginnerHomeworks.homework8_2;

public class Director extends Manager {



    public Director(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }

    public int getSalary() {
        if (numberOfSubordinates == 0) {
            return baseSalary;
        } else return baseSalary * (numberOfSubordinates / 100 * 9);
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }
}
