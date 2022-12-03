package stepDef;

import config.env;
import io.cucumber.java.en.And;
import objects.pageSwipe;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;

public class swipe extends hooks {

    pageSwipe pageSwipe = new pageSwipe();
    HashMap<String, Object> scrollObject = new HashMap<>();

    @And("user click on Js foundation menu")
    public void user_click_on_js_foundation_menu() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageSwipe.getPage_swipe())
        );
        scrollObject.put("direction", "left");
        scrollObject.put("name", "JS.FOUNDATION");
        driver.executeScript("mobile:swipe", scrollObject);
        Boolean isButtonVisible = Boolean.parseBoolean(driver.findElement(pageSwipe.getBtn_JsFoundation()).getAttribute("visible"));
        while (!isButtonVisible) {
            driver.executeScript("mobile:swipe", scrollObject);
            isButtonVisible = Boolean.parseBoolean(driver.findElement(pageSwipe.getBtn_JsFoundation()).getAttribute("visible"));
        }
        driver.findElement(pageSwipe.getBtn_JsFoundation()).click();
    }

    @And("user found robot")
    public void user_found_robot() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageSwipe.getPage_swipe())
        );
        scrollObject.put("direction", "down");
        scrollObject.put("name", "WebdriverIO logo");
        driver.executeScript("mobile:scroll", scrollObject);
        driver.findElement(pageSwipe.getIcon_robot()).isDisplayed();
    }
}
