package com.testNg;

import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Listener implements ITestNGListener {


    public void onTestStart(ITestResult result){
        System.out.println("Test case is going to start");
    }

    public void onTestSuccess(ITestResult result){
        System.out.println("Test case passes");
    }

    public void onTestFailure(ITestResult result){
        System.out.println("Test case Failed");
    }

    public void onTestSkipped(ITestResult result){
        System.out.println("Test case skipped");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result){
        System.out.println("Test cases Passed percentage");
    }

    public void onStart(ITestResult result){
        System.out.println("Before everything");
    }

    public void onFinish(ITestResult result){
        System.out.println("After everything");
    }
}
