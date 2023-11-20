package javascriptexecutor;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class JavaScriptExecutorDemo {

    public static void main(String[] args) throws InterruptedException, IOException {
        /*System.setProperty("webdriver.chrome.driver", "/home/nishanthi/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();*/
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testleaf.herokuapp.com/");
        //driver.get("https://phptravels.com/demo/");


        //Flashing
        //WebElement joinfree = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a"));
        //JavascriptUtil.flash(joinfree, driver);

        //Drawing border & screenshot
        WebElement joinfree = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a"));
        JavascriptUtil.drawBorder(joinfree,driver);

        File src =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        for(int i=1; i<10;i++) {
            File loc = new File("/home/nishanthi/Documents/srcshot"+i+".png");
            FileUtils.copyFile(src,loc);
    }




        //capture title of the page
        // System.out.println(driver.getTitle());
        //String title = JavascriptUtil.gettitle(driver);
        //System.out.println(title);

        //clicking an element
        //WebElement edit =driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a"));
        //JavascriptUtil.clickelement(edit,driver);

        //generate alert window
        //JavascriptUtil.generatealert(driver, "you clicked on edit button.....");

        //refreshing page
        //driver.navigate().refresh();
        //JavascriptUtil.refreshingpage(driver);

        //scroll the page till particular element is found
        //WebElement scroll = driver.findElement(By.xpath("/html/body/div[3]/main/section[1]/div/div/div[3]/img"));
        //JavascriptUtil.scrollpagetoelement(scroll, driver);

        //scroll to end
        //JavascriptUtil.scrolltoend(driver);

    }
}
