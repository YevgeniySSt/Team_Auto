package Utils;


import org.testng.Assert;

import java.util.ArrayList;

public class AssertionCheck {
    ArrayList<String> listOfFails = new ArrayList<String>();

    public AssertionCheck() {
        listOfFails.clear();

    }

    public void assertEquals(double a, double b) {
        try {
            Assert.assertEquals(a, b);
        } catch (AssertionError e) {
            listOfFails.add(e.getMessage());
        }
    }

    public void assertNotEquals(double a, double b){
        try {
            Assert.assertNotEquals(a, b);
        } catch (AssertionError e) {
            listOfFails.add(e.getMessage());
        }
    }

    public void printErrors() {
        if (!listOfFails.isEmpty()) {
            for (String error : listOfFails) {
                System.out.println(error + "\n");
            }
            Assert.fail();

        }
    }


}
