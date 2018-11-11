package tests.calculator;

import org.testng.annotations.Test;
import task_9_Calculator.ScientificCalculator;

public class ScientificCalculatorTests extends BaseTest {
    ScientificCalculator sCalculator = new ScientificCalculator();

    @Test
    public void add() {
        assertionCheck.assertEquals(4.0, sCalculator.add(2.0, 2.0));
        assertionCheck.assertEquals(4.0, sCalculator.add(3, 2));
    }

    @Test
    public void pow() {
        assertionCheck.assertEquals(49, sCalculator.pow(7, 7));
        assertionCheck.assertEquals(48, sCalculator.pow(7, 7));
    }

    @Test
    public void sqrt() {
        assertionCheck.assertEquals(7, sCalculator.sqrt(49));
        assertionCheck.assertEquals(8, sCalculator.sqrt(49));
    }

    @Test
    public void min() {
        assertionCheck.assertEquals(5.8, sCalculator.min(5.8, 7.9));
        assertionCheck.assertEquals(7.9, sCalculator.min(5.8, 7.9));
    }

    @Test
    public void max() {
        assertionCheck.assertEquals(5.8, sCalculator.max(5.8, 7.9));
        assertionCheck.assertEquals(7.9, sCalculator.max(5.8, 7.9));
    }


}
