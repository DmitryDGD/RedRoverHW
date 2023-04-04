package beginnerHomeworks.homework8_2;

public class Utils {


    public static String checkEmployeeFullName(Employee[] employeesarray, String name) {
        String result = "";
        for (Employee employee : employeesarray) {
            if (employee.getName().equals(name)) {
                result = "Сотрудник с именем " + name + " найден";
                break;
            } else result = "Сотрудник по имени " + name + " не найден";
        }
        return result;
    }


    public static String checkEmployeeStringName(Employee[] employeesarray, String name) {
        String result = "";
        for (Employee employee : employeesarray) {
            if (employee.getName().contains(name)) {
                result = "Сотрудник с именем " + name + " найден";
                break;
            } else result = "Сотрудник по имени " + name + " не найден";
        }
        return result;
    }

    public static int baseSalarySum(Employee[] employeesarray) {
        int result = 0;
        for (Employee employee : employeesarray) {
            result += employee.getBaseSalary();
        }
        return result;
    }

    public static int searchMinSalary(Employee[] employeesarray) {
        int minSalary = employeesarray[0].baseSalary;
        for (Employee employee : employeesarray) {
            if (employee.getBaseSalary() < minSalary) {
                minSalary = employee.baseSalary;
            }
        }
        return minSalary;
    }

    public static int searchMaxSalary(Employee[] employeesarray) {
        int maxSalary = 0;
        for (Employee employee : employeesarray) {
            if (employee.getBaseSalary() > maxSalary) {
                maxSalary = employee.baseSalary;
            }
        }
        return maxSalary;
    }

    public static int minOfSubordinates(Employee[] employeesarray) {
        int minSubordinates = Integer.MAX_VALUE;

        for (Employee employee : employeesarray) {
            if (employee instanceof Manager && ((((Manager) employee).getNumberOfSubordinates()) < minSubordinates)) {
                    minSubordinates = ((Manager) employee).numberOfSubordinates;

            }

        }


        return minSubordinates;
    }

    public static int maxOfSubordinates(Employee[] employeesarray) {
        int maxSubordinates = Integer.MIN_VALUE;
        for (Employee employee : employeesarray) {
            if (employee instanceof Manager && ((((Manager) employee).getNumberOfSubordinates()) > maxSubordinates)) {
                    maxSubordinates = ((Manager) employee).numberOfSubordinates;

            }

        }

        return maxSubordinates;
    }

    public static int minPremium(Employee[] employeesarrya) {
        int minPremium = Integer.MAX_VALUE;
        int premium = 0;
        for (Employee employee : employeesarrya) {
            if (employee instanceof Manager) {
                premium = ((Manager) employee).getSalary() - employee.getBaseSalary();
                if (premium < minPremium) {
                    minPremium = premium;
                }
            }
        }
        return minPremium;
    }

    public static int maxPremium(Employee[] employeesarrya) {
        int maxPremium = Integer.MIN_VALUE;
        int premium = 0;
        for (Employee employee : employeesarrya) {
            if (employee instanceof Manager) {
                premium = ((Manager) employee).getSalary() - employee.getBaseSalary();
                if (premium > maxPremium) {
                    maxPremium = premium;
                }
            }
        }
        return maxPremium;



    }

    public  static void main(String[] args) {

        Employee[] employees = {new Worker("Bill", 10), new Manager("Alex", 20, 5),
                new Director("Bob", 50, 7), new Worker("Brand", 10)};

        System.out.println(checkEmployeeFullName(employees, "Alex"));
        System.out.println(checkEmployeeStringName(employees, "Ale"));
        System.out.println("Зарплатный бюджет = " + baseSalarySum(employees));
        System.out.println("Минимальная зарплата = " + searchMinSalary(employees));
        System.out.println("Максимальная зарплата = " + searchMaxSalary(employees));
        System.out.println("Минимальное количество подчиненных = " + minOfSubordinates(employees));
        System.out.println("Максимальное количество подчиненных = " + maxOfSubordinates(employees));
        System.out.println("Минимальная премия = " + minPremium(employees));
        System.out.println(maxPremium(employees));


    }
}
