package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Implicitwait {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://phptravels.net/login");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement username =driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[4]/div/div[2]/div[2]/div/form/div[1]/div/input"));
        username.sendKeys("user@phptravels.com");

        WebElement password =driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[4]/div/div[2]/div[2]/div/form/div[2]/div[1]/input"));
        password.sendKeys("demouser");

        WebElement login =driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[4]/div/div[2]/div[2]/div/form/div[3]/button"));
        login.click();

        WebElement profile =driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[4]/div/div[3]/ul/li[4]/a"));
        profile.click();

        //WebDriverWait wait =new WebDriverWait(driver,30);
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));


    }
}
