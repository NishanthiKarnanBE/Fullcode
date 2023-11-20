package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testleaf.herokuapp.com/");
        WebElement editbtn =driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a"));
        editbtn.click();

        WebElement mailidfield = driver.findElement(By.id("email"));
        mailidfield.sendKeys("nishanthikarnan2001@gmail.com");

        WebElement appendtext = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
        appendtext.sendKeys("Text");

        WebElement getattribute = driver.findElement(By.name("username"));
        String result = getattribute.getAttribute("value");
        System.out.println(result);

        WebElement gettext = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/label"));
        String results = gettext.getText();
        System.out.println(results);

        WebElement cleartext = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
        cleartext.clear();

        WebElement checkdisable = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
        /*boolean res = checkdisable.isEnabled();
        System.out.println(res);*/
        if(checkdisable.isEnabled()==true){
            System.out.println("The field is Enable");
        }
        else {
            System.out.println("The field is Disable");
        }

    }
}
