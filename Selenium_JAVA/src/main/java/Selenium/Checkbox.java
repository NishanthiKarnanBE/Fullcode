package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://artoftesting.com/samplesiteforselenium");
        WebElement checkboxbtn =driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[7]/a"));
        checkboxbtn.click();

        WebElement java =driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/input[1]"));
        java.click();
        WebElement clang =driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/input[4]"));
        clang.click();

        WebElement confirmchecked = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/input"));
        if (confirmchecked.isSelected()){
            System.out.println("Selenium is checked");
        }
        else {
            System.out.println("Selenium is un checked");
        }

        WebElement notselected = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/input[1]"));
        if(notselected.isSelected()){
            notselected.click();
        }
        else {
            System.out.println("Notselected is not checked");
        }
        WebElement iamselected = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/input[2]"));
        if(iamselected.isSelected()){
            iamselected.click();
        }
        else {
            System.out.println("I am selected is not checked");
        }
    }
}
