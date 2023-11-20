package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {
    public static void main(String[] args) {
        //setup the chromedriver
        WebDriverManager.chromedriver().setup();
        //cresting object chrome driver
        ChromeDriver driver =new ChromeDriver();
        //Browser commands
        //1.get method
        driver.get("https://www.saucedemo.com/");
        //maximize
        driver.manage().window().maximize();
        //3.get title method
        System.out.println("Title: " + driver.getTitle());
        //4.get current url
        System.out.println("Current URL " + driver.getCurrentUrl());
        //5.get page source method
        System.out.println("Page Source: " + driver.getPageSource());
        //6.Close command(current window get closed)
        driver.close();
        //7.QUit command(entire window get closed)
        driver.quit();
    }
}
