package testNg;

import org.testng.annotations.*;

public class Hierachy {
    @Test
    public void test1(){
        System.out.println("I am Test1");
    }
    @Test
    public void test2(){
        System.out.println("I am Test2");
    }
    @Test
    public void test3(){
        System.out.println("I am Test3");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I am before method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("I am after method");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("I am before class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("I am after class");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("I am before suite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("I am after suite");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("I am before test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("I am after test");
    }
}
