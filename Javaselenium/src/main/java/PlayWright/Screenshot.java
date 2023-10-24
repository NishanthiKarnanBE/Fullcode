package PlayWright;

import com.microsoft.playwright.*;

import java.nio.file.Paths;

import static PlayWright.LaunchBrowser.getPage;

public class    Screenshot {

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

    public static void main(String[] args) {
        //launch the browser
        tlPlaywright.set(Playwright.create());
        tlBrowser.set(getPlaywright().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false)));
        tlBrowserContext.set(getBrowser().newContext());

        //Opening a new page
        tlPage.set(getBrowserContext().newPage());

        //navigate to the URL
        getPage().navigate("https://www.saucedemo.com/");
        //Taking screenshot upto visible page
        getPage().screenshot(new Page.ScreenshotOptions().setPath(Paths.get("screenshot/fullpage.png")));

        getPage().navigate("https://demo.automationtesting.in/Register.html");
        //Taking screenshot full page
        getPage().screenshot(new Page.ScreenshotOptions().setPath(Paths.get("screenshot/fullpage1.png")).setFullPage(true));

        getPage().navigate("https://demo.automationtesting.in/Register.html");
        //mentioned locator taking screenshot
        getPage().locator("//img[@id='imagetrgt']").screenshot(new Locator.ScreenshotOptions().setPath(Paths.get("screenshot/logo.png")));

        System.out.println("Taken screenshot");

        //the moment when we scroll then only the content will load..at this time if we take screenshot the loaded only capture in the screenshot
    }
}
