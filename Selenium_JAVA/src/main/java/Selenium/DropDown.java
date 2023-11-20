package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://artoftesting.com/samplesiteforselenium");
        WebElement dropdownbtn =driver.findElement(By.xpath("//input[@id='male']"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dropdownbtn);

       //dropdownindex
        WebElement dropdownindex = driver.findElement(By.xpath("//select[@id='testingDropdown']"));
        dropdownindex.click();
        Select select = new Select(dropdownindex);
        select.selectByIndex(1);
        Thread.sleep(5000);

        //dropdowntext
        WebElement dropdowntext = driver.findElement(By.xpath("//select[@id='testingDropdown']"));
        dropdowntext.click();
        Select select1 = new Select(dropdowntext);
        select1.selectByVisibleText("Manual Testing");
        Thread.sleep(5000);

        //dropdownvalue
        WebElement dropdownvalue = driver.findElement(By.xpath("//select[@id='testingDropdown']"));
        dropdownvalue.click();
        Select select2 = new Select(dropdownvalue);
        select2.selectByValue("Database");
        Thread.sleep(5000);


        //no.of drop downs
        WebElement noofdropdowns = driver.findElement(By.xpath("//select[@id='testingDropdown']"));
        noofdropdowns.click();
        Select select3 = new Select(noofdropdowns);
        List<WebElement> res = select3.getOptions();
        int value =res.size();
        System.out.println(value);

        //multiselect
       /* WebElement selectmultiple =driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
        Select select4 = new Select(selectmultiple);
        select4.selectByValue("1");
        select4.selectByValue("2");
        select4.selectByValue("3");
        select4.selectByValue("4");
        WebElement firstselectedopn = select4.getFirstSelectedOption();
        System.out.println(firstselectedopn.getText());
        List<WebElement> getselectedoptions = select4.getAllSelectedOptions();
        for(WebElement temp: getselectedoptions){
            String text = temp.getText();
            System.out.println(text);
        }*/
        /*select3.deselectByVisibleText("Manual Testing");
        select3.deselectByValue("Database");
        select3.deselectByIndex(3);
        select3.deselectAll();*/
        System.out.println( select3.isMultiple());
        //driver.quit();
    }
}
