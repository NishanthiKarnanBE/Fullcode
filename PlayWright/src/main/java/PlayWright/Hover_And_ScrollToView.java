package PlayWright;

import com.microsoft.playwright.*;

public class Hover_And_ScrollToView {

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
        getPage().navigate("https://the-internet.herokuapp.com/hovers");

        //Hover element(If scroll needed it will scroll and hover the element)
        //Method 1
        getPage().locator("(//img[@src='/img/avatar-blank.jpg'])[1]").hover();
        Thread.sleep(5000);
        System.out.println("Hovered the element");

        //Hover element(If scroll needed it will scroll and hover the element)
        //Method 2
        getPage().hover("(//img[@src='/img/avatar-blank.jpg'])[2]");
        Thread.sleep(5000);
        System.out.println("Hovered the element");

        //Scroll to view
        getPage().navigate("https://www.programsbuzz.com/article/playwright-hover-over-element#demo-website");
        getPage().locator("//a[text()='Playwright JavaScript Tutorial']").scrollIntoViewIfNeeded();
        System.out.println("scrolled successfully");

    }
}
