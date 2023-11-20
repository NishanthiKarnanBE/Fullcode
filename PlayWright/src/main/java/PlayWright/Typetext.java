package PlayWright;

import com.microsoft.playwright.*;

public class Typetext {

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

    public static String username = "//input[@id='user-name']";
    public static String password="//input[@id='password']";

    public static void main(String[] args) {
        //launch the browser
        tlPlaywright.set(Playwright.create());
        tlBrowser.set(getPlaywright().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false)));
        tlBrowserContext.set(getBrowser().newContext());

        //Opening a new page
        tlPage.set(getBrowserContext().newPage());

        //navigate to the URL
        getPage().navigate("https://www.saucedemo.com/");

        //filling a field
        getPage().fill(username,"standard_user");
        getPage().fill(password,"secret_sauce");

        //getPage().type();

        //typetext(another way)
        getPage().locator("//input[@id='user-name']").fill("Nishanthi");
        getPage().locator("//input[@id='password']").fill("karnan");

        //to control the typing speed
        //Method 1
        getPage().type("//input[@id='user-name']","Nishanthi",new Page.TypeOptions().setDelay(500));
        //Method 2
        getPage().locator("//input[@id='user-name']").type("Nishanthi",new Locator.TypeOptions().setDelay(500)); //time given in ms

        //fill - clear the text and type.......no dealy option
        //type -  do not clear the existing text.....have delay option

    }
}
