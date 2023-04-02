package beginnerHomeworks.homeWorks7;

public class Salary {
    public int getSum(Employee[] employeeArray) {
        int sumSalart = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            sumSalart += employeeArray[i].salary;
        }
        return sumSalart;
    }

    public static void main(String[] args) {
        Employee[] employee1 = {new Employee(10), new Employee(20), new Employee(30)};
        Salary salary = new Salary();
        System.out.println(salary.getSum(employee1));


    }
}
