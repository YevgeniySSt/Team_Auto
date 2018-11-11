package tests.calculator;

import Utils.AssertionCheck;
import org.testng.Assert;
import org.testng.annotations.*;
import task_9_Calculator.Calculator;


public class CalculatorTests {
    Calculator calculator;
    AssertionCheck assertionCheck;

    @BeforeTest
    public void beforeTest() {
        calculator = new Calculator();
        assertionCheck = new AssertionCheck();
    }

    @Test
    public void addTest() {
        assertionCheck.assertEquals(15.7, calculator.add(15, 0.7)); //positive test
        assertionCheck.assertEquals(150.7, calculator.add(149, 0.7)); //negative test
        assertionCheck.assertEquals(150.8, calculator.add(149, 0.7)); //negative test
        assertionCheck.assertNotEquals(5, calculator.add(5, 6)); //positive test
    }

    @Test
    public void subtractTest() {
        assertionCheck.assertEquals(5.1, calculator.subtract(18.2, 13.1)); //positive test
        assertionCheck.assertEquals(5.2, calculator.subtract(18.2, 13.1)); //negative test
    }

    @Test
    public void multiplyTest() {
        assertionCheck.assertEquals(4.5, calculator.multiply(3, 1.5)); //positive test
        assertionCheck.assertEquals(4.1, calculator.multiply(3, 1.5)); //negative test
    }

    @Test
    public void divideTest() {
        assertionCheck.assertEquals(1.5, calculator.divide(4.5, 3)); //positive test
        assertionCheck.assertEquals(1.4, calculator.divide(4.5, 3)); //negative test
    }

    @AfterTest
    public void afterTest() {
        assertionCheck.printErrors();
    }


}
