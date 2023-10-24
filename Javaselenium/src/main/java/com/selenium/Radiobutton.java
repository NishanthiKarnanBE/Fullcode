package com.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Radio button
        driver.get("https://artoftesting.com/samplesiteforselenium");
        WebElement radiobtn =driver.findElement(By.xpath("//input[@id='male']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", radiobtn);
        radiobtn.click();
        Thread.sleep(5000);

        WebElement female = driver.findElement(By.xpath("//input[@id='female']"));
        WebElement male = driver.findElement(By.xpath("//input[@id='male']"));
        String value1  = (female.isSelected()) ? "Unchecked is clicked" : "Unchecked is not clicked";
        String value2 = (male.isSelected()) ? "Checked is clicked" : "Checked is not clicked";
        System.out.println("Radio Button: " + value1);
        System.out.println("Radio Button: " + value2);

        //Checkbox
        driver.get("https://artoftesting.com/samplesiteforselenium");
        WebElement checkboxbtn =driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
        checkboxbtn.click();
        Thread.sleep(5000);

        WebElement uncheckedbox = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
        WebElement checkedbox = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
        String value3  = (uncheckedbox.isSelected()) ? "Unchecked is clicked" : "Unchecked is not clicked";
        String value4 = (checkedbox.isSelected()) ? "Checked is clicked" : "Checked is not clicked";
        System.out.println("Checkbox: " + value3);
        System.out.println("Checkbox: " + value4);
    }
}
