package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Link {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testleaf.herokuapp.com/");
        WebElement linkbtn = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[3]/a"));
        linkbtn.click();

        //Go to home page
        WebElement homepagelink = driver.findElement(By.linkText("Go to Home Page"));
        homepagelink.click();
        driver.navigate().back();
        WebElement findlink = driver.findElement(By.partialLinkText("Find where am supposed to go"));
        findlink.click();
        driver.navigate().back();
        //Find where am supposed to go without clicking me?
        WebElement findwherelink = driver.findElement(By.partialLinkText("Find where am supposed to go"));
        String findwhere = findwherelink.getAttribute("href");
        System.out.println(findwhere);

        //Verify am I broken?
        WebElement broken = driver.findElement(By.linkText("Verify am I broken?"));
        broken.click();

        String gettitle = driver.getTitle();
        System.out.println(gettitle);
        if(gettitle.equals("404 Not Found") ) {
            System.out.println("success");
        }
        else {
            System.out.println("fail");
        }
        driver.navigate().back();

        //Go to Home Page (Interact with same link name)
        homepagelink.click();
        driver.navigate().back();

        //How many links are available in this page?
        List<WebElement> nooflinks = driver.findElements(By.tagName("a"));
        int getcount = nooflinks.size();
        System.out.println(getcount);




    }
}

