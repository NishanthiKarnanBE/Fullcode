package StepDefinition;


import Base.DriverInstance;
import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSD extends DriverInstance {

    LoginPage loginPage = new LoginPage(driver);
    @Given("User clicks on the login button")
    public void uSerClicksOnTheLoginButton() throws InterruptedException {
        loginPage.uSerClicksOnTheLoginButton();
    }

    @And("User enter the username as {string}")
    public void userEnterTheUsernameAs(String username) {
        loginPage.userEnterTheUsernameAs(username);
    }

    @And("User enter the password ad {string}")
    public void userEnterThePasswordAd(String password) {
        loginPage.userEnterThePasswordAd(password);
    }

    @When("User clicks on the login button after entered the credentials")
    public void userClicksOnTheLoginButtonAfterEnteredTheCredentials() throws InterruptedException {
        loginPage.userClicksOnTheLoginButtonAfterEnteredTheCredentials();
    }

    @Then("Login should be success")
    public void loginShouldBeSuccess() {
        loginPage.loginShouldBeSuccess();
    }

    @When("Login should fail")
    public void loginShouldFail() throws InterruptedException {
        loginPage.loginShouldFail();
    }

    @And("User enter username {string}")
    public void userEnterUsername(String username) {
        loginPage.userEnterTheUsernameAs(username);
    }

    @And("User enter password {string}")
    public void userEnterPassword(String password) {
        loginPage.userEnterThePasswordAd(password);
    }
}
