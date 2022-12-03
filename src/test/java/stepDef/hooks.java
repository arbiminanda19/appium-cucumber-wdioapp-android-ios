package stepDef;

import config.env;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class hooks extends env {

    public void before() throws MalformedURLException {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "iPhone SE (3rd generation)");
        capabilities.setCapability("udid", "739B47C6-A478-4CD3-99A2-CC0CA0019BEC");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "15.4");
//        capabilities.setCapability("app", "src/test/resources/app/wdioNativeDemoApp.app");
        capabilities.setCapability("bundleId", "org.wdioNativeDemoApp");

        URL url = new URL(baseUrl);
        driver = new IOSDriver(url, capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, duration);
    }

    @After
    public void after(){
        driver.quit();
    }

}
