package Hooks;

import Base.DriverInstance;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MyHooks extends DriverInstance {

    @Before
    public void beforeScenario(Scenario scenario) throws IOException {
        DriverInstance.loadProperties();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait=new WebDriverWait( driver, 10);
        driver.get(properties.getProperty("URL"));
        System.out.println(driver.getTitle());
//        System.out.println("Before Scenario");
//        System.out.println(scenario.getName());
    }

    @After
    public void afterScenario(Scenario scenario){
        boolean status =scenario.isFailed();
        System.out.println("Is failed? "+status);
        byte[] screenshot = driver.getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", "Screenshot");
        driver.quit();
    }
}
