package beginnerHomeworks.homework13_2;

public final class Month {

    private String monthName;
    private int monthDays;
    private int workingDays;

    public Month(String monthName, int monthDays, int workingDays) {
        this.monthName = monthName;
        this.monthDays = monthDays;
        this.workingDays = workingDays;
    }

    public String getMonthName() {
        return monthName;
    }

    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }

    public int getMonthDays() {
        return monthDays;
    }

    public void setMonthDays(int monthDays) {
        this.monthDays = monthDays;
    }

    public int getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(int workingDays) {
        this.workingDays = workingDays;
    }
}
