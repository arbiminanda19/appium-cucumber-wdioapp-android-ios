package objects;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileCommand;
import org.openqa.selenium.By;

public class pageSwipe {

    By page_swipe = By.xpath("//XCUIElementTypeOther[@name='Swipe-screen']");
    By icon_robot = By.xpath("//XCUIElementTypeOther[@name='WebdriverIO logo']");

    By btn_JsFoundation = By.xpath("//XCUIElementTypeStaticText[@name='JS.FOUNDATION']");
    public By getPage_swipe() {
        return page_swipe;
    }

    public By getIcon_robot() {
        return icon_robot;
    }

    public By getBtn_JsFoundation() {
        return btn_JsFoundation;
    }
}
