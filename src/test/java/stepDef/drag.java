package stepDef;

import config.env;
import io.cucumber.java.en.And;
import objects.pageDrag;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import static java.time.Duration.ofSeconds;

public class drag extends env {

    TouchAction touch = new TouchAction(driver);

    pageDrag pageDrag = new pageDrag();

    @And("user drag and drop object")
    public void user_drag_and_drop_object() {
        WebElement from1 = driver.findElement(pageDrag.getFrom1());
        WebElement to1 = driver.findElement(pageDrag.getTo1());
        touch.longPress(longPressOptions().withElement(element(from1)).withDuration(ofSeconds(5))).moveTo(element(to1)).release().perform();
    }
}
