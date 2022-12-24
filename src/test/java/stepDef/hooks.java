package stepDef;

import config.env;
import io.appium.java_client.ios.IOSDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class hooks extends env {

    @Before
    public void before() throws MalformedURLException {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "iPhone SE (3rd generation)");
        capabilities.setCapability("udid", "3F659EB6-2B34-4E01-A4BB-7137005A13F3");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "16.2");
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
