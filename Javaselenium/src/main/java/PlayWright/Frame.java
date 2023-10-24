package PlayWright;

import com.microsoft.playwright.*;

import java.util.List;

public class Frame {

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
        getPage().navigate("https://demo.automationtesting.in/Frames.html");

        //switch to single frame
        getPage().frameLocator("#singleframe").locator("//input[@type='text']").fill("Nishanthi");

       //switch to nested frame
        getPage().click("//a[@href='#Multiple']");
        getPage().frameLocator("//iframe[@src='MultipleFrames.html']").frameLocator("//iframe[@src='SingleFrame.html']").locator("//input[@type='text']").fill("karnan");

        //usingFrameNameAttribute
        getPage().navigate("https://demo.automationtesting.in/Frames.html");
        com.microsoft.playwright.Frame frame=getPage().frame("SingleFrame");
        frame.locator("//input[@type='text']").fill("Nishanthi");

        //getPage().navigate("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");

        getPage().navigate("https://demo.automationtesting.in/Frames.html");
        List<com.microsoft.playwright.Frame> frames = getPage().frames();
        // Print frame names and IDs
        for (com.microsoft.playwright.Frame frame1 : frames) {
            System.out.println("Frame Name: " + frame1.name());
            /*System.out.println("Frame ID: " + frame1.id());*/
            System.out.println("-------------------------");
        }
    }
}
