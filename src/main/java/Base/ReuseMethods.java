package Base;

import org.openqa.selenium.WebElement;

public class ReuseMethods extends DriverInstance{


    //Clicking the element
    public static void click(WebElement element) throws InterruptedException {
        element.click();
    }
    //Enter the text into the field
    public static void sendData(WebElement element, String text){
        element.sendKeys(text);
    }
}
