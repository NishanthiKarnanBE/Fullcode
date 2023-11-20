package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Frames {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testleaf.herokuapp.com/");
        WebElement framebtn =driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[10]/a"));
        framebtn.click();

        //frame
        driver.switchTo().frame(0);
        WebElement insideframe = driver.findElement(By.xpath("//*[@id=\"Click\"]"));
        insideframe.click();
        WebElement gettext = driver.findElement(By.id("Click"));
        String value = gettext.getText();
        System.out.println(value);
        driver.switchTo().defaultContent();

        //nested frame
        driver.switchTo().frame(1);
        driver.switchTo().frame("frame2");
        WebElement nestedframe = driver.findElement(By.xpath("//*[@id=\"Click1\"]"));
        nestedframe.click();
        WebElement gettext1 = driver.findElement(By.xpath("//*[@id=\"Click1\"]"));
        String value1 = gettext1.getText();
        System.out.println(value1);
        driver.switchTo().defaultContent();

        //total no.of frames in the page
        List<WebElement> totalcount =driver.findElements(By.tagName("iframe"));
        int result = totalcount.size();
        System.out.println(result);



    }
}
