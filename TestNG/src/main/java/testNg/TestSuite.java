package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestSuite {

    WebDriver driver;

    @BeforeSuite
    public void launchBrowser(){
        System.setProperty("webdriver.chrome.driver","/home/nishanthi/Downloads/chromedriver_linux64/chromedriver");
        driver = new ChromeDriver();
    }
    @Test(priority =0)
    public void openGoogle(){

        driver.get("https://www.google.com/");
    }
    @Test(priority =1)
    public void openBing(){

        driver.get("https://www.bing.com/");
    }
    @Test(priority =2)
    public void openYahho0(){
        driver.get("https://in.search.yahoo.com/?fr2=inr");
    }
    @AfterSuite
    public void closeBrowser(){
        driver.quit();
    }
}
