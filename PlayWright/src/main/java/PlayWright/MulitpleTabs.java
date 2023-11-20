package PlayWright;


import com.microsoft.playwright.*;

public class MulitpleTabs {

    public static void main(String[] args) {
        Playwright playwright= Playwright.create();
        BrowserType browserType = playwright.chromium();
        Browser browser = browserType.launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext browserContext=browser.newContext();
       //Open multiple tabs in same browser
        Page page =browserContext.newPage(); //one tab
        page.navigate("https://www.saucedemo.com/");
        Page page1=browserContext.newPage(); //another tab
        page1.navigate("https://demo.automationtesting.in/Register.html");
    }
}
