package com.testNg;


import org.testng.annotations.Test;

public class PriorityTest {

    @Test(priority = 0, enabled = false)
    public void firstMethod() {
        System.out.println("This is first method");
    }
    @Test(priority = 1)
    public void thirdMethod() {
        System.out.println("This is third method");
    }

    @Test(priority = 2)
    public void secondMethod() {
        System.out.println("This is second method");
    }


    @Test(priority =3)
    public void fourthMethod(){
        System.out.println("This is fourth method");
    }
    @Test(priority =4, groups ={"five"})
    public void fifthMethod(){
        System.out.println("This is fifth method");
    }
    @Test(priority =5, groups ={"five"})
    public void sixthMethod(){
        System.out.println("This is sixth method");
    }
    @Test(priority =6, groups ={"five"})
    public void seventhMethod(){
        System.out.println("This is seventh method");
    }
}


//@Test
//priority attribute
//enables attribute(skip a test case)
//dependency management attribute
//@before suite ,@after suite
//work in xml
//xml-groups
//xml-parameter
//Assertion
//Annotation Hierachy
