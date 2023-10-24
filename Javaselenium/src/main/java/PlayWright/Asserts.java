package PlayWright;

import com.microsoft.playwright.*;

import static PlayWright.LaunchBrowser.getPage;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class Asserts {

    public static ThreadLocal<Browser> tlBrowser = new ThreadLocal<>();
    public static ThreadLocal<Playwright> tlPlaywright = new ThreadLocal<>();
    public static ThreadLocal<BrowserContext> tlBrowserContext = new ThreadLocal<>();
    public static ThreadLocal<Page> tlPage = new ThreadLocal<>();
    public static Playwright getPlaywright() {
        return tlPlaywright.get();
    }
    public static Browser getBrowser() {
        return tlBrowser.get();
    }
    public static BrowserContext getBrowserContext() {
        return tlBrowserContext.get();
    }
    public static Page getPage() {
        return tlPage.get();
    }

    public static void main(String[] args) throws InterruptedException {

        //launch the browser
        tlPlaywright.set(Playwright.create());
        tlBrowser.set(getPlaywright().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false)));
        tlBrowserContext.set(getBrowser().newContext());

        //Opening a new page
        tlPage.set(getBrowserContext().newPage());

        //navigate to the URL
        getPage().navigate("https://demo.automationtesting.in/Register.html");

        //Assert checkbox is checked
        getPage().check("//input[@id='checkbox1']");
        assertThat(getPage().locator("//input[@id='checkbox1']")).isChecked();
        System.out.println("Assert verfied successfully for checkbox");

        //Assert locator has ID
        getPage().navigate("https://www.saucedemo.com/");
        assertThat(getPage().locator("//input[@id='user-name']")).hasId("user-name");
        System.out.println("Assert verified successfully for locator has ID");

        //Assert locator has class name
        getPage().navigate("https://www.saucedemo.com/");
        assertThat(getPage().locator("//input[@id='user-name']")).hasClass("input_error form_input");
        System.out.println("Assert verified successfully for locator has Class");

        //Assert locator has attribute
        getPage().navigate("https://www.saucedemo.com/");
        assertThat(getPage().locator("//input[@id='user-name']")).hasAttribute("data-test","username");
        System.out.println("Assert verified successfully for locator has attribute");

        //Assert locator is disabled(in attribute the disable option should be true then only it will work)
        getPage().navigate("https://practicetestautomation.com/practice-test-exceptions/");
        assertThat(getPage().locator("//input[@value='Pizza']")).isDisabled();
        System.out.println("Assert verified successfully for locator is disabled");

        // Assert locator is enabled
        getPage().navigate("https://practicetestautomation.com/practice-test-exceptions/");
        assertThat(getPage().locator("//button[text()='Edit']")).isEnabled();
        System.out.println("Assert verified successfully for locator is enabled");

        // Assert locator is visible(enable and visible both are same)
        getPage().navigate("https://practicetestautomation.com/practice-test-exceptions/");
        assertThat(getPage().locator("//button[text()='Edit']")).isVisible();
        System.out.println("Assert verified successfully for locator is visible");

        // Assert locator is editable
        getPage().navigate("https://practicetestautomation.com/practice-test-exceptions/");
        getPage().click("//button[text()='Edit']");
        assertThat(getPage().locator("//input[@value='Pizza']")).isEditable();
        System.out.println("Assert verified successfully for locator is editable");

        // Assert locator is empty
        getPage().navigate("https://practicetestautomation.com/practice-test-exceptions/");
        getPage().click("//button[text()='Edit']");
        getPage().locator("//input[@value='Pizza']").clear();
        assertThat(getPage().locator("//input[@value='Pizza']")).isEmpty();
        System.out.println("Assert verified successfully for locator is empty");

        // Assert locator has expected text(need to check inner text)
        getPage().navigate("https://practicetestautomation.com/practice-test-exceptions/");
        assertThat(getPage().locator("//button[text()='Edit']")).hasText("Edit");
        System.out.println("Assert verified successfully for locator has expected text");

        // Assert locator is in view port size
        getPage().navigate("https://practicetestautomation.com/practice-test-exceptions/");
        assertThat(getPage().locator("//button[text()='Edit']")).isInViewport();
        System.out.println("Assert verified successfully for locator is in view port size");

        // Assert locator is hidden
        getPage().navigate("https://practicetestautomation.com/practice-test-exceptions/");
        assertThat(getPage().locator("(//button[text()='Save'])[1]")).isHidden();
        System.out.println("Assert verified successfully for locator is hidden");

        // Assert locator is focused
        getPage().navigate("https://practicetestautomation.com/practice-test-exceptions/");
        getPage().locator("//button[text()='Edit']").focus();
        assertThat(getPage().locator("//button[text()='Edit']")).isFocused();
        System.out.println("Assert verified successfully for locator is focused");

        // Assert locator has expected count
        getPage().navigate("https://practicetestautomation.com/practice-test-exceptions/");
        assertThat(getPage().locator("//button")).hasCount(5);
        System.out.println("Assert verified successfully for locator has expected count");
    }
}
