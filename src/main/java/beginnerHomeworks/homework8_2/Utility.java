package beginnerHomeworks.homework8_2;

public class Utility {


    public static String salaryBudget(Employee[] employeesarray, String name) {
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

    public static void salaryBudget(Employee[] employeesarray) {
        int result = 0;
        for (Employee employee : employeesarray) {
            result += employee.getBaseSalary();
        }
        System.out.println(result);
    }

    public static void searchMinSalary(Employee[] employeesarray) {
        int minSalary = employeesarray[0].baseSalary;
        for (Employee employee : employeesarray) {
            if (employee.getBaseSalary() < minSalary) {
                minSalary = employee.baseSalary;
            }
        }
        System.out.println(minSalary);
    }

    public static void searchMaxSalary(Employee[] employeesarray) {
        int maxSalary = 0;
        for (Employee employee : employeesarray) {
            if (employee.getBaseSalary() > maxSalary) {
                maxSalary = employee.baseSalary;
            }
        }
        System.out.println(maxSalary);
    }

    public static void minOfSubordinates(Employee[] employeesarray) {
        int minSubordinates = Integer.MAX_VALUE;

        for (Employee employee : employeesarray) {
            if (employee instanceof Manager) {
                if ((((Manager) employee).getNumberOfSubordinates()) < minSubordinates) {
                    minSubordinates = ((Manager) employee).numberOfSubordinates;
                }
            }

        }


        System.out.println(minSubordinates);
    }

    public static void maxOfSubordinates(Employee[] employeesarray) {
        int maxSubordinates = Integer.MIN_VALUE;
        for (Employee employee : employeesarray) {
            if (employee instanceof Manager) {
                if ((((Manager) employee).getNumberOfSubordinates()) > maxSubordinates) {
                    maxSubordinates = ((Manager) employee).numberOfSubordinates;
                }
            }

        }

        System.out.println(maxSubordinates);
    }

    public static void minPremium(Employee[] employeesarrya) {
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
        System.out.println(minPremium);
    }

    public static void maxPremium(Employee[] employeesarrya) {
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
        System.out.println(maxPremium);
    }


    public  static void main(String[] args) {

        Employee[] employees = {new Worker("Bill", 10), new Manager("Alex", 20, 5),
                new Director("Bob", 50, 7), new Worker("Brand", 10)};

        System.out.println(salaryBudget(employees, "Alex"));
        System.out.println(checkEmployeeStringName(employees, "Ale"));
        salaryBudget(employees);
        searchMinSalary(employees);
        searchMaxSalary(employees);
        minOfSubordinates(employees);
        maxOfSubordinates(employees);
        minPremium(employees);
        maxPremium(employees);




    }
}
