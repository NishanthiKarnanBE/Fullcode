package PlayWright;

import com.microsoft.playwright.*;
import org.testng.Assert;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DownloadFile {

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
        //getPage().navigate("https://demo.automationtesting.in/FileDownload.html");
        getPage().navigate("https://filesamples.com/formats/pdf");

        //Download the file
        Download download=getPage().waitForDownload(()->{
            getPage().click("//a[@href='/samples/document/pdf/sample1.pdf']");
        });
        download.saveAs(Paths.get("DownloadedFile/demo.pdf"));
        System.out.println("Downloaded successfully");

        //To verify the file is downloaded
        Path path = Paths.get(System.getProperty("user.dir"),"DownloadedFile");
        if(Files.exists(path)){
            File downloadedfile = new File(path + "/demo.pdf");
            System.out.println(downloadedfile);
            Assert.assertTrue(downloadedfile.exists(),"file already available"); //If the assert gets fail, custom message ['file already available'] will display
            System.out.println("File Exists");
        }
    }
}
