package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigationCommands {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        //Browser navigation commands
        //1.Navigate to Command
        //2.Back Command
        //3.forward command
        //4.refresh command

        //1.Navigate to Command
        Thread.sleep(10000);
        driver.navigate().to("https://ultimateqa.com/automation");

        //2.Back Command
        Thread.sleep(10000);
        driver.navigate().back();

        //3.forward command
        Thread.sleep(10000);
        driver.navigate().forward();

        //4.refresh command
        Thread.sleep(10000);
        driver.navigate().refresh();
    }
}
