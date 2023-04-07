package beginnerHomeworks.homework13_2;

public class Main {
    public static void main(String[] args) {
        Employee james = new Employee("James", 33, "male", 100);
        Employee phoebe = new Employee("phoebe", 33, "female", 200);

        Manager joe = new Manager("Joe", 45, "male", 300, 10);
        Manager ross = new Manager("Ross", 42, "male", 300, 20);


        System.out.println(james.getSalary(MonthUtils.getFirstHalfYear()));
        System.out.println(phoebe.getSalary(MonthUtils.getFirstHalfYear()));
        System.out.println(joe.getSalary(MonthUtils.getFourthQuarter()));
        System.out.println(ross.getSalary(MonthUtils.getFourthQuarter()));
    }
}
