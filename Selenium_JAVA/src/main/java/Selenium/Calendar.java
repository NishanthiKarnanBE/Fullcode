package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testleaf.herokuapp.com/");
        WebElement calendarbtn =driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[12]/a"));
        calendarbtn.click();

        //WebElement dateselect = driver.findElementById("datepicker");
        //dateselect.click();
        WebElement nextmonth = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span"));
        nextmonth.click();
        WebElement date = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[2]/a"));
        date.click();
    }
}

//windows
//table.....
//images.....
//upload a file.....
//download a file
//drag and drop
//tooltip
//sortable
//links.....
//autocompletion
//selectable
