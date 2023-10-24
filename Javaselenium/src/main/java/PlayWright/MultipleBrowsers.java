package PlayWright;

import com.microsoft.playwright.*;

public class MultipleBrowsers {

    public static void main(String[] args) throws InterruptedException {
        Playwright playwright=Playwright.create();
        BrowserType browserType=playwright.chromium();
        Browser browser = browserType.launch(new BrowserType.LaunchOptions().setHeadless(false));
        //open new incognito page
        BrowserContext browserContext=browser.newContext();
        Page page = browserContext.newPage();
        page.navigate("https://www.saucedemo.com/");
        Thread.sleep(5000);

        BrowserContext browserContext1=browser.newContext();//to open another browser(multiple browser)
        Page page1=browserContext1.newPage();
        page1.navigate("https://demo.automationtesting.in/Register.html");
    }
}
