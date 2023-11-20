package PlayWright;

import com.microsoft.playwright.*;

public class Alerts {

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

    public static String alertbutton ="//button[@class='btn btn-danger']";

    public static void main(String[] args) throws InterruptedException {
        //launch the browser
        tlPlaywright.set(Playwright.create());
        tlBrowser.set(getPlaywright().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false)));
        tlBrowserContext.set(getBrowser().newContext());

        //Opening a new page
        tlPage.set(getBrowserContext().newPage());

        //navigate to the URL
        getPage().navigate("https://demo.automationtesting.in/Alerts.html");

        //alerts
        getPage().click(alertbutton);
        Thread.sleep(5000);
        getPage().onDialog(dialog-> {dialog.accept();});
        System.out.println("Successfully");
    }

}
