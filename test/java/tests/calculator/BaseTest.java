package tests.calculator;

import Utils.AssertionCheck;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    AssertionCheck assertionCheck;

    @BeforeTest
    public void beforeTest() {
        assertionCheck = new AssertionCheck();
    }

    @AfterTest
    public void afterTest() {
        assertionCheck.printErrors();
    }
}
