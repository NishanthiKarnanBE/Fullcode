package PlayWright;

import com.microsoft.playwright.*;

import static PlayWright.LaunchBrowser.getPage;

public class Clickingelement {

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
    public static String loginbtn="//input[@id='login-button']";

    public static void main(String[] args) throws InterruptedException {
        //launch the browser
        tlPlaywright.set(Playwright.create());
        tlBrowser.set(getPlaywright().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false)));
        tlBrowserContext.set(getBrowser().newContext());

        //Opening a new page
        tlPage.set(getBrowserContext().newPage());

        //navigate to the URL
        getPage().navigate("https://www.saucedemo.com/");

        //clicking an element
        //Method1
        getPage().click(loginbtn);

        //Method 2(Recommended one)
        getPage().locator(loginbtn).click();

        //doubleclick
        //Method 1
        getPage().navigate("https://dev.automationtesting.in/table");
        Thread.sleep(2000);
        getPage().dblclick("(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-colorPrimary MuiIconButton-sizeMedium css-39nlm1'])[1]");

        //doubleclick
        //Method 2
        Thread.sleep(2000);
        getPage().locator("(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-colorPrimary MuiIconButton-sizeMedium css-39nlm1'])[1]").dblclick();
        System.out.println("Double clicked the icon");
    }
}
