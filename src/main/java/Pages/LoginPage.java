package Pages;

import Base.DriverInstance;
import Base.ReuseMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends DriverInstance {

    public LoginPage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    ReuseMethods reuseMethods = new ReuseMethods();

    @FindBy(xpath = "//span[text()='Login']")
    private WebElement loginButton;
    @FindBy(xpath = "//input[@data-placeholder='Username']")
    public WebElement userName;
    @FindBy(xpath = "//input[@data-placeholder='Password']")
    public WebElement passWord;
    @FindBy(xpath = "(//span[text()='Login'])[2]")
    public WebElement LoginButtonAfterCreEntered;
    @FindBy(xpath = "//*[text()='Username or Password is incorrect.']")
    public WebElement errorMsg;


    public void uSerClicksOnTheLoginButton() throws InterruptedException {
        Thread.sleep(5000);
        reuseMethods.click(loginButton);
    }

    public void userEnterTheUsernameAs(String username) {
        reuseMethods.sendData(userName, username);
    }

    public void userEnterThePasswordAd(String password) {
        reuseMethods.sendData(passWord, password);
    }

    public void userClicksOnTheLoginButtonAfterEnteredTheCredentials() throws InterruptedException {
        reuseMethods.click(LoginButtonAfterCreEntered);
    }

    public void loginShouldBeSuccess() {
        System.out.println("Successfully logged in");
    }

    public void loginShouldFail() throws InterruptedException {
        System.out.println("Config");
        System.out.println(properties.getProperty("Error_msg"));
        System.out.println("Locator");
        System.out.println(driver.findElement(By.xpath("//span[text()='Username']")).getText());
        //Assert.assertEquals(properties.getProperty("Error_msg"),errorMsg.getText());

    }
}
