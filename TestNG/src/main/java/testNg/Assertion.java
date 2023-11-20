package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
//Assertion is mainly used for unit testing for developers...(unit testing-developers self testing)
    String name="nisha";
    boolean val1 = true;
    boolean val2 = false;

    @Test
    public void checkequals() {
        /*if (name.equals("nisha")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }*/

         Assert.assertEquals(name,"Nisha");
         Assert.assertNotEquals(name, "Nisha");
         Assert.assertTrue(val1,"true");
         Assert.assertFalse(val2, "false");
    }
}
