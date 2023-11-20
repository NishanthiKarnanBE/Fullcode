package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        //stale element exception
     /*   WebElement homepage = driver.findElementByName("q");
        homepage.sendKeys("selenium" + Keys.ENTER);
        homepage.click();
        driver.findElementByName("q");*/
        driver.get("http://testleaf.herokuapp.com/");
        WebElement alerbtn = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[9]/a"));
        alerbtn.click();


        //Alertbox
        WebElement alertbox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
        alertbox.click();
        Alert alerts = driver.switchTo().alert();
        alerts.accept();

        //confirmbox
        WebElement confirmbox =driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
        confirmbox.click();
        Alert alerts1 = driver.switchTo().alert();
        alerts1.accept();
        confirmbox.click();
        Alert alerts2 = driver.switchTo().alert();
        alerts2.dismiss();

        //promptbox
        WebElement promptbox =driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
        promptbox.click();
        Alert alerts3 = driver.switchTo().alert();
        alerts3.sendKeys("Nishanthi");
        alerts3.accept();
    }
}
