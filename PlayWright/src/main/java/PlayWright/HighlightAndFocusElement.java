package PlayWright;

import com.microsoft.playwright.*;

public class HighlightAndFocusElement {

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

        //Highlight Element(highlight the element and locator will display)
        getPage().locator("//label[text()='Address']").highlight();
        System.out.println("Hightlighted successfully");

        //Focus Element(scursor will move to respective column and stasted blinking)
        //Method 1
        getPage().navigate("https://demo.automationtesting.in/Register.html");
        getPage().locator("//textarea").focus();
        Thread.sleep(5000);
        System.out.println("Focused successfully");

        //Method 2
        getPage().focus("//textarea");
    }
}
