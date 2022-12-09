package objects;

import org.openqa.selenium.By;

public class pageHome {

    By btn_swipe = By.xpath("//XCUIElementTypeButton[@name='Swipe']");
    By btn_form = By.xpath("//XCUIElementTypeButton[@name='Forms']");

    By btn_home = By.xpath("//XCUIElementTypeButton[@name='Home']");
    By page_home = By.xpath("//XCUIElementTypeOther[@name='WEBDRIVER Demo app for the appium-boilerplate']");

    By btn_drag = By.xpath("//XCUIElementTypeButton[@name='Drag']");

    public By getBtn_swipe() {
        return btn_swipe;
    }

    public By getBtn_form() {
        return btn_form;
    }

    public By getPage_home() {
        return page_home;
    }

    public By getBtn_drag() {
        return btn_drag;
    }

    public By getBtn_home() {
        return btn_home;
    }
}
