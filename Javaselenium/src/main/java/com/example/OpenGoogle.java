package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;


public class OpenGoogle {
    public static void main(String[] args){
        /*System.setProperty("webdriver.chrome.driver","/home/nishanthi/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        //driver.get("https://demo.automationtesting.in/Register.html");
        driver.get("https://www.youtube.com/");


        //driver.findElement(By.name("search_query")).sendKeys("Selenium");
        //driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]")).click();

        driver.findElement(By.name("search_query")).sendKeys("selenium"+ Keys.ENTER);
        //driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("selenium"+ Keys.ENTER);*/

      /*  LocalDate today = LocalDate.now();
        LocalDate lastFriday = today.with(DayOfWeek.FRIDAY);


        System.out.println(lastFriday);
        System.out.println(lastFriday.minusDays(1));
        DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("MMddyyyy");
        String friday = dateformat.format(lastFriday);
        System.out.println(friday);*/


       /* LocalDate today = LocalDate.now();
        LocalDate lastThrusday = today.with(DayOfWeek.THURSDAY);
        if (lastThrusday.isAfter(today)) {
            lastThrusday = lastThrusday.minusWeeks(1);
        }
        DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("MMddyyyy");
        String Thrusday = dateformat.format(lastThrusday);
        System.out.println(Thrusday);*/

        LocalDate currentDate = LocalDate.now();
        LocalDate lastMonth = currentDate.minusMonths(1);

        YearMonth yearMonth = YearMonth.of(lastMonth.getYear(), lastMonth.getMonth());
        LocalDate past31stDate = yearMonth.atDay(31);

        System.out.println("Past 31st date: " + past31stDate);

        DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("MMddyyyy");
        String Thrusday = dateformat.format(past31stDate);
        System.out.println(Thrusday);


        LocalDate currentDates= LocalDate.now();
        LocalDate past32ndDate = currentDates.minusDays(32);

        System.out.println("Past 32nd date: " + past32ndDate);

        DateTimeFormatter dateformats = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String res = dateformats.format(past31stDate);
        System.out.println(res);


    }
}
