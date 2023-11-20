package PlayWright;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.MouseButton;

public class MouseInteractions {

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
        getPage().navigate("https://dev.automationtesting.in/table");

        //Right click using mouse
        //Method 1
        getPage().locator("(//button[@type='button'])[4]").click(new Locator.ClickOptions().setButton(MouseButton.RIGHT));
        Thread.sleep(3000);
        getPage().locator("//*[@id=\"26\"]/div[3]/div/button[2]").click();
        Thread.sleep(2000);

        //Right click using mouse
        //Method 2
        getPage().click("(//button[@type='button'])[4]",new Page.ClickOptions().setButton(MouseButton.RIGHT));
        Thread.sleep(3000);
        getPage().locator("//*[@id=\"26\"]/div[3]/div/button[2]").click();

        //Left click using mouse
        //getPage().locator("(//button[@type='button'])[4]").click(new Locator.ClickOptions().setButton(MouseButton.LEFT));
        //getPage().locator("(//button[@type='button'])[4]").click(new Locator.ClickOptions().setButton(MouseButton.MIDDLE));





    }
}
