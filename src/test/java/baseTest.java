import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class baseTest {

    private static AppiumDriver driver;
    private static DesiredCapabilities capabilities;

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Pixel_3a_API_32_arm64-v8a");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "12");
//        capabilities.setCapability("app", "src/test/resources/apk/Android-NativeDemoApp-0.4.0.apk");
        capabilities.setCapability("appPackage", "com.wdiodemoapp");
        capabilities.setCapability("appActivity", "com.wdiodemoapp.MainActivity");
        
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(url, capabilities);

        driver.quit();
    }

}
