package PlayWright;

import com.microsoft.playwright.*;

public class DatepickerAndCalendar {

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
        getPage().navigate("https://demo.automationtesting.in/Datepicker.html");

        //Date picker enabled(Type field is enabled)
        //getPage().click("//input[@id='datepicker2']");
        getPage().locator("//input[@id='datepicker2']").fill("07/30/2022");
        Thread.sleep(2000);
        //after select the date.....need to close the calendar
        getPage().keyboard().press("Enter");
        Thread.sleep(2000);

        //Date picker disabled(Type field is disabled)
        //using javascript
        getPage().evaluate("document.getElementById('datepicker1').value='07/30/2022'");
        //using query selector, if Id is not there
        getPage().evaluate("document.querySelector('#datepicker1').value='07/30/2022'");
        Thread.sleep(5000);
    }
}
