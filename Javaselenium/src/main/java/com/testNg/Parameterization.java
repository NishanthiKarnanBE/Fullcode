package com.testNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {

    @Test
    @Parameters("test")
    public void printName(String demo){
        System.out.println("My name is "+demo);
    }
}
