package beginnerHomeworks.new8_1_baseClass;



public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Alex", 24, 100);
        Manager manager1 = new Manager("Bob", 99, 10, 10);

        System.out.println(employee1.getSalary(10));

        double salaryManager = manager1.getSalary(10);
        double premium = salaryManager / 100 * manager1.getStuffNumber();
        System.out.println((int)(salaryManager + premium));

    }
}
