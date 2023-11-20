package testNg;

import org.testng.annotations.Test;

public class DependencyManagement {

    @Test
    public void highSchool(){
        System.out.println("High School");
    }
    @Test(dependsOnMethods = "highSchool")
    public void higherSecSchool(){
        System.out.println("Higher Secondary School");
    }
    @Test(dependsOnMethods = "higherSecSchool")
    public void college(){
        System.out.println("College");
    }
}
