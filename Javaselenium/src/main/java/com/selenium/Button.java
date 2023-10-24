package com.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Button {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testleaf.herokuapp.com/");
        WebElement idname =driver.findElement(By.id("search"));
        idname.sendKeys("fun vidoes");

        driver.findElement(By.xpath("//*[@placeholder='Enter the Username']"));
        int a = 1;
        WebElement button =driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a"));
        button.click();

        //click button
        WebElement gotohomebtn = driver.findElement(By.xpath("//*[@id=\"home\"]"));
        gotohomebtn.click();
        driver.navigate().back();

        //xy position
        WebElement xyposition =driver.findElement(By.xpath("//*[@id=\"position\"]"));
        Point point = xyposition.getLocation();
        int xvalue = point.getX();
        int yvalue = point.getY();
        System.out.println("X value = " + xvalue + " Y value = " + yvalue);

        //button color
        WebElement btncolor = driver.findElement(By.xpath("//*[@id=\"color\"]"));
        String color = btncolor.getCssValue("background-color");
        String hex = Color.fromString(color).asHex();
        System.out.println(color);
        System.out.println(hex);

        //button size
        WebElement btnsize = driver.findElement(By.xpath("//*[@id=\"size\"]"));
        //String size = String.valueOf(btnsize.getSize());
        String height = String.valueOf(btnsize.getSize().getHeight());
        String width = String.valueOf(btnsize.getSize().getWidth());
        System.out.println("Button height :" + height + " Button width :" + width);
    }
}
