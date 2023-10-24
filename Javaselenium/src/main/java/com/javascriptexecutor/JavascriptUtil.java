package com.javascriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavascriptUtil {


    public static void flash(WebElement element, WebDriver driver) throws InterruptedException {
        //JavascriptExecutor js = ((JavascriptExecutor) driver);
        //WebElement joinfre = driver.findElement(By.xpath("//*[@id=\"block-bku55abec0ab0897\"]/div/ul"));
        String bgcolor = element.getCssValue("background-color");
        System.out.println(bgcolor);
        for(int i=0; i<500; i++){
            changeColor("pink", element,driver);
            changeColor(bgcolor, element,driver);
            //changeColor("red",element,driver);
        }
    }
    public static void changeColor(String color, WebElement element, WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].style.backgroundColor = '"+ color +"'", element);
    }

    public static void drawBorder(WebElement element, WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].style.border='10px solid red'", element);
    }

    public static String gettitle(WebDriver driver){
        JavascriptExecutor js =((JavascriptExecutor) driver);
        String title = js.executeScript("return document.title").toString();
        return title;
    }

    public static void clickelement(WebElement element,WebDriver driver){
        JavascriptExecutor js= ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();",element);
    }

    public static void generatealert(WebDriver driver, String message){
        JavascriptExecutor js =((JavascriptExecutor) driver);
        js.executeScript("alert(' " +message+ " ')");
    }

    public static void refreshingpage(WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("history.go(0)");
    }

    public static void scrollpagetoelement(WebElement element, WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrolltoend(WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }
}
