package com.reusablemethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task extends Test{

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ic.drivewealth.io/netic/default.aspx");
        //System.setProperty("webdriver.chrome.driver","/home/nishanthi/Downloads/chromedriver_linux64/chromedriver");
        //WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        //driver.get("https://demo.automationtesting.in/Register.html");

        dotype("//*[@id=\"ICLogin_UserName\"]","Nishanthi");
      /*  WebElement value = driver.findElement(By.xpath(""));
        jsdoclick(value,driver);*/


        }
}
