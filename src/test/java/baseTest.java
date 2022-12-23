import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class baseTest {

    private static AppiumDriver driver;
    private static DesiredCapabilities capabilities;

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "iPhone SE (3rd generation)");
        capabilities.setCapability("udid", "739B47C6-A478-4CD3-99A2-CC0CA0019BEC");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "15.4");
//        capabilities.setCapability("app", "src/test/resources/app/wdioNativeDemoApp.app");
        capabilities.setCapability("bundleId", "org.wdioNativeDemoApp");
        
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new IOSDriver(url, capabilities);

        driver.quit();
    }

}
