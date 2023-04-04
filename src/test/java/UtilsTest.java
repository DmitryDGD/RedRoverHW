import beginnerHomeworks.homework8_2.*;
import org.testng.Assert;
import org.testng.annotations.Test;


public class UtilsTest {

    Employee[] employees = {new Worker("Bill", 10), new Manager("Alex", 20, 5),
                new Director("Bob", 50, 7), new Worker("Brand", 10)};

    @Test
    public void checkEmployeeFullNameTest() {
        Assert.assertEquals(Utils.checkEmployeeFullName(employees, "Bill"), "Сотрудник с именем Bill найден");
    }

    @Test
    public void checkEmployeeStringNameTest() {
        Assert.assertEquals(Utils.checkEmployeeStringName(employees, "Bill"),"Сотрудник с именем Bill найден");
    }

    @Test
    public void baseSalarySumTest() {
        Assert.assertEquals(Utils.baseSalarySum(employees), 90);
    }

    @Test
    public void searchMinSalaryTest() {
        Assert.assertEquals(Utils.searchMinSalary(employees), 10);
    }

    @Test
    public void searchMaxSalaryTest() {
        Assert.assertEquals(Utils.searchMaxSalary(employees), 50);
    }

    @Test
    public void minOfSubordinatesTest() {
        Assert.assertEquals(Utils.minOfSubordinates(employees), 5);
    }
    @Test
    public void maxOfSubordinatesTest() {
        Assert.assertEquals(Utils.maxOfSubordinates(employees), 7);
    }

    @Test
    public void minPremiumTest() {
        Assert.assertEquals(Utils.minPremium(employees), -50);
    }
    @Test
    public void maxPremiumTest() {
        Assert.assertEquals(Utils.maxPremium(employees), -20);
    }




}
