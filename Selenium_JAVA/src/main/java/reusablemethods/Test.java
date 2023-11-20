package reusablemethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test {
    static WebDriver driver;

    public static void dotype(String locators, String value){
        driver.findElement(By.xpath(locators)).sendKeys(value);
    }
    public static void doclick(String locator){
        driver.findElement(By.xpath(locator)).click();
    }
    public static void foward(){
        driver.navigate().forward();
    }
    public static void backward(){
        driver.navigate().back();
    }
    public static void refresh(){
        driver.navigate().refresh();
    }
    public static void browserclose(){
        driver.close();
    }
    public static void browserquit(){
        driver.quit();
    }
    public static void jsdoclick(WebElement element, WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click()",element);
    }


}

//1. Browserlaunch
//2. urllaunch
//3. forward
//4. backward
//5. refresh
//6. browserclose
//7. browserquit
//8. clickelement
//9. jsclickelement
//10. typetext
//11. jstypetext
//12. dropdownwithindex
//13. dropdownwithvalue
//14. dropdownwithvisibleelement
//15. draganddrop
//16. mousehover
//17. switchframe
//18. switchwindow
//19. scrolldown
//20. scrollup
//21. selectcheckbox
//22. doubleclick
//23. rightclick
//24. alertdismiss
//25. randomnumbergenerator(7) - int
//26. randomstringgenerator("name") - string
//27. randommailgenerator() - string
//28. stringintoint
//29. intintostring
