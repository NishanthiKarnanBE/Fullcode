package PlayWright;

import com.microsoft.playwright.*;

public class GetTextContent {

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
    public static String getaddtocarttext="(//button[text()='Add to cart'])[1]";
    public static String loginbtn="//input[@id='login-button']";

    public static void main(String[] args) {
        //launch the browser
        tlPlaywright.set(Playwright.create());
        tlBrowser.set(getPlaywright().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false)));
        tlBrowserContext.set(getBrowser().newContext());

        //Opening a new page
        tlPage.set(getBrowserContext().newPage());

        //navigate to the URL
        getPage().navigate("https://www.saucedemo.com/");

        getPage().locator("//input[@id='user-name']").fill("standard_user");
        getPage().locator("//input[@id='password']").fill("secret_sauce");
        getPage().click(loginbtn);

        //Getting text content
        String Addtocart= getPage().textContent(getaddtocarttext);
        System.out.println(Addtocart);

        //Using inner text
        String Addtocartusinginnertext= getPage().innerText(getaddtocarttext);
        System.out.println(Addtocartusinginnertext);

        //using inner html
        String usinginnerhtml = getPage().locator(getaddtocarttext).innerHTML();
        System.out.println(usinginnerhtml);

    }
}
