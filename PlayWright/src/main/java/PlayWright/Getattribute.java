package PlayWright;

import com.microsoft.playwright.*;

public class Getattribute {

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

        //getattribute
        //Method 1
        String attribute_value = getPage().locator("//input[@placeholder='First Name']").getAttribute("ng-model");
        System.out.println(attribute_value);

        //Method 2
        String attribute_value1 = getPage().getAttribute("//input[@placeholder='First Name']","ng-model");
        System.out.println(attribute_value1);
    }
}
