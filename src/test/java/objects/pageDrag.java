package objects;

import org.openqa.selenium.By;

public class pageDrag {

    By from1 = By.xpath("//XCUIElementTypeOther[@name='drag-l2']");
    By to1 = By.xpath("//XCUIElementTypeOther[@name='drop-l2']");


    public By getFrom1() {
        return from1;
    }

    public By getTo1() {
        return to1;
    }
}
