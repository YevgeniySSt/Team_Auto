package tests.calculator;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import task_9_Calculator.ScientificCalculator;

public class ScientificCalculatorTests {
    ScientificCalculator calculator;
    @BeforeTest
    public void beforeTest(){
        calculator = new ScientificCalculator();
    }

    @Test
    public void add() {
        Assert.assertEquals(4.0, calculator.add(2.0, 2.0));
        Assert.assertEquals(4.0, calculator.add(3, 2));
    }

    @Test
    public void pow() {
        Assert.assertEquals(49, calculator.pow(7, 7));
        Assert.assertEquals(48, calculator.pow(7, 7));
    }

    @Test
    public void sqrt() {
        Assert.assertEquals(7, calculator.sqrt(49));
        Assert.assertEquals(8, calculator.sqrt(49));
    }

    @Test
    public void min() {
        Assert.assertEquals(5.8, calculator.min(5.8, 7.9));
        Assert.assertEquals(7.9, calculator.min(5.8, 7.9));
    }

    @Test
    public void max() {
        Assert.assertEquals(5.8, calculator.max(5.8, 7.9));
        Assert.assertEquals(7.9, calculator.max(5.8, 7.9));
    }


}
