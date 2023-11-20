package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Tables {

    @FindBy(xpath = "//*[@id=\"main\"]/div[2]/a[2]")
    private static WebElement file;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
        WebElement tablebtn =driver.findElement(By.xpath("//*[@id=\"myFile\"]"));
        tablebtn.click();
       /* JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();",file);
        System.out.println( file.getAttribute("id"));*/


      /* WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testleaf.herokuapp.com/");
        WebElement tablebtn =driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[8]/a"));
        tablebtn.click();

        //total no.of columns
        List<WebElement> noofcolumns = driver.findElements(By.tagName("th"));
        int totalnoofcolumns =noofcolumns.size();
        System.out.println("Total Number of Columns "+totalnoofcolumns);

        //total no.of rows
        List<WebElement> noofrows = driver.findElements(By.tagName("tr"));
        int totalnoofrows = noofrows.size();
        System.out.println("Total Number of Rows "+totalnoofrows);

        //progress value of 'Learn to interact with Elements'
        WebElement progressvalue = driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
        String progresspercent = progressvalue.getText();
        System.out.println("'Learn to interact with Elements' "+progresspercent);

        //vital task for the least completed progress
        List<WebElement> allprogressvalue = driver.findElements(By.xpath("//td[2]"));

        ArrayList<Integer> storevalues = new ArrayList<Integer>();

        for (WebElement webElement:allprogressvalue) {
            String progresvalue = webElement.getText().replace("%","");
            storevalues.add(Integer.valueOf(progresvalue));
        }

        System.out.println(storevalues);
        int minprogressvalue = Collections.min(storevalues);
        System.out.println(minprogressvalue);

        WebElement vitalcheck =driver.findElement(By.xpath("//td[normalize-space()="+"'20%'"+"]"+"//following::td"));
        vitalcheck.click();*/
    }
}
