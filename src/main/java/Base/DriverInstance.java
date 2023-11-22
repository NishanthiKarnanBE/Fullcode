package Base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class DriverInstance {
    public static ChromeDriver driver;
    public static WebDriverWait wait;

    public static Properties properties;

    public static void loadProperties() throws IOException {
        FileReader reader=null;
        String fileName = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator + "java"
                + File.separator + "Config" + File.separator + "config.properties";
        reader = new FileReader(fileName);
        properties  = new Properties();
        properties.load(reader);
    }
}
