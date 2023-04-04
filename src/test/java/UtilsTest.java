import beginnerHomeworks.homework8_2.*;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class UtilsTest {

    public void salaryBudgetTest() {

        Employee[] employees = {new Worker("Bill", 10), new Manager("Alex", 20, 5),
                new Director("Bob", 50, 7), new Worker("Brand", 10)};

        Assert.assertEquals(Utility.salaryBudget(employees, "Bill"), "Сотрудник с именем Bill найден");



    }


}
