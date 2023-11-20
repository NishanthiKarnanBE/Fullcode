package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class Filedownload {
    static Thread thread;
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/file.xhtml;jsessionid=node010nx464jtc8vzxsmrg4fp0yu9138.node0");

        WebElement downloadbtn = driver.findElement(By.xpath("//*[@id='j_idt93:j_idt95']"));
        downloadbtn.click();

        thread.sleep(3000);

        File file = new File("/home/nishanthi/Downloads");
        File[] totalfiles= file.listFiles();
        for (File file1:totalfiles) {
            if(file1.getName().equals("TestLeaf Logo.png")){
                System.out.println("File is Downloaded");
                break;
            }

        }

    }

}
