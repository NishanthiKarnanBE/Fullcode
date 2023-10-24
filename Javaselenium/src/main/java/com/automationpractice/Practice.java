package com.automationpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        boolean isEnabled = driver.findElement(By.xpath("//input[@type='submit']")).isEnabled();
        System.out.println(isEnabled);
        driver.findElement(By.xpath("//input[@type='submit']")).submit();

        /*driver.get("https://dashboard.drivewealth.tech/");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("SecLending");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@123");
        boolean isEnabled = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
        System.out.println(isEnabled);*/

        System.out.println(System.getProperty("user.dir"));

    }
}
