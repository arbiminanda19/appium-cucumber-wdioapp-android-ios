package objects;

import org.openqa.selenium.By;

public class pageHome {

    By btn_swipe = By.xpath("//android.widget.Button[@content-desc='Swipe']");
    By btn_form = By.xpath("//android.widget.Button[@content-desc='Forms']");

    By btn_drag = By.xpath("//android.widget.Button[@content-desc='Drag']");
    By page_home = By.xpath("//android.widget.ScrollView[@content-desc='Home-screen']");

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
}
