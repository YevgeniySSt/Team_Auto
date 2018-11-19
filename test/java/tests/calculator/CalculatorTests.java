package tests.calculator;

import org.testng.Assert;
import org.testng.annotations.*;
import task_9_Calculator.Calculator;

public class CalculatorTests {
    Calculator calculator;

    @DataProvider(name = "Inputs")

    public static Object[][] inputs() {

        return new Object[][]
                {
                        { 15.0, 0.7 },
                        { 149, 0.7 }
                };

    }

    @BeforeTest
    public void beforeTest(){
        calculator = new Calculator();
    }

    @Test(dataProvider = "Inputs")
    public void addTest(double firstInput, double secondInput) {
        Assert.assertEquals(15.7, calculator.add(firstInput, secondInput)); //positive test
        Assert.assertNotEquals(5, calculator.add(5, 6)); //positive test
    }

    @Test
    public void subtractTest() {
        Assert.assertEquals(5.1, calculator.subtract(18.2, 13.1)); //positive test
        Assert.assertEquals(5.2, calculator.subtract(18.2, 13.1)); //negative test
    }

    @Test
    public void multiplyTest() {
        Assert.assertEquals(4.5, calculator.multiply(3, 1.5)); //positive test
        Assert.assertEquals(4.1, calculator.multiply(3, 1.5)); //negative test
    }

    @Test
    public void divideTest() {
        Assert.assertEquals(1.5, calculator.divide(4.5, 3)); //positive test
        Assert.assertEquals(1.4, calculator.divide(4.5, 3)); //negative test
    }


}
