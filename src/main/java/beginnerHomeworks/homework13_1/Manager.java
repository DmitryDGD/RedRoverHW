package beginnerHomeworks.homework13_1;

public final class Manager extends Employee {
    private int numberOfSubordinates;
    private final double rate = (double) numberOfSubordinates / 100 * 3;

    @Override
    public final double getSalary() {
        double salary;

        if (numberOfSubordinates == 0) {
            salary = getBaseSalary();
        } else {
            salary = getBaseSalary() * rate;
        }
        return salary;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }


}
