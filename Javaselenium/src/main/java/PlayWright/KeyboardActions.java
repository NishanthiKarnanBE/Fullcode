package PlayWright;

import com.microsoft.playwright.*;

public class KeyboardActions {

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
        getPage().navigate("https://www.saucedemo.com/");

        //type using keyboard
        getPage().locator("//input[@id='user-name']").click();
        getPage().keyboard().type("Nishanthi", new Keyboard.TypeOptions().setDelay(150));

        //using enter key
        //Method 1
        getPage().navigate("https://the-internet.herokuapp.com/key_presses");
        Thread.sleep(2000);
        getPage().locator("#target").press("Enter");
        System.out.println("enter keyboard action working successfully");
        //Using Tab
        Thread.sleep(2000);
        getPage().locator("#target").press("Tab");
        System.out.println("Tab keyboard action working successfully");
        //Using Space
        //Method 2
        Thread.sleep(2000);
        getPage().press("#target","Space");
        System.out.println("Space keyboard action working successfully");

        //copy paste the lastname into first name
        getPage().navigate("https://demo.automationtesting.in/Register.html");
        getPage().locator("//input[@placeholder='Last Name']").fill("Nishanthi");
        Thread.sleep(2000);
        //getPage().locator("//input[@placeholder='Last Name']").press("Control+A");
        getPage().keyboard().press("Control+A");
        Thread.sleep(2000);
        //getPage().locator("//input[@placeholder='Last Name']").press("Control+C");
        getPage().keyboard().press("Control+C");
        Thread.sleep(2000);
        getPage().locator("//input[@placeholder='First Name']").press("Control+V");
        System.out.println("Copy and pasted successfully");
    }
}
