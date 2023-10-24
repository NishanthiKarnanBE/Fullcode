package PlayWright;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.ViewportSize;

import static PlayWright.LaunchBrowser.getPage;

public class MaximizeBrowser {

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

    public static void main(String[] args) {
        //launch the browser
        tlPlaywright.set(Playwright.create());
        tlBrowser.set(getPlaywright().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false)));
        tlBrowserContext.set(getBrowser().newContext());

        //Opening a new page
        tlPage.set(getBrowserContext().newPage());

        //to find the width and height of the browser
        ViewportSize portsize=getPage().viewportSize();
        int widthsize=portsize.width;
        System.out.println("Widthsize"+widthsize);
        int heightsize=portsize.height;
        System.out.println("heightsize"+heightsize);

        //maximize the browser
        /*BrowserContext browserContext= getBrowser().newContext(new Browser.NewContextOptions().setViewportSize(2000,800));
         browserContext.newPage();*/
        getPage().setViewportSize(1500,760);

        //navigate to the URL
        getPage().navigate("https://www.saucedemo.com/");
    }
}
