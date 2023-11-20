package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Image {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testleaf.herokuapp.com/");
        WebElement imagebtn = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[4]/a"));
        imagebtn.click();


        WebElement firstimage = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/img"));
        if(firstimage.getAttribute("naturalWidth").equals("0")){
            System.out.println("The image is broken");
        }else {
            System.out.println("The image is not broken");
        }
        firstimage.click();
        driver.navigate().back();

        WebElement secondimage = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/img"));
        if(secondimage.getAttribute("naturalWidth").equals("0")){
            System.out.println("The image is broken");
        }else {
            System.out.println("The image is not broken");
        }
    }
}
