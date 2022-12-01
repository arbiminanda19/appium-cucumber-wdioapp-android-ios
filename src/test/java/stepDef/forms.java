package stepDef;

import config.env;
import io.cucumber.java.en.And;
import objects.pageForm;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class forms extends hooks {

    pageForm pageForm = new pageForm();
    public int duration = 10;

    @And("user fill input field")
    public void user_fill_input_field() {
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageForm.getTxt_input())
        );
        String input = "testt";
        String inputResult;
        driver.findElement(pageForm.getTxt_input()).sendKeys(input);
        inputResult = driver.findElement(pageForm.getTxt_inputResult()).getAttribute("text");
        Assert.assertEquals(inputResult, input);
    }
    @And("user change switch state")
    public void user_change_switch_state() {
        driver.findElement(pageForm.getBtn_switch()).click();
        Boolean btn_status = Boolean. parseBoolean(driver.findElement(pageForm.getBtn_switch()).getAttribute("checked"));
        Assert.assertTrue(btn_status);
    }
    @And("user choose dropdown field")
    public void user_choose_dropdown_field() {
        driver.findElement(pageForm.getBtn_dropdown()).click();
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageForm.getBtn_dropdownOptions())
        );
        List<WebElement> dropdownOptions = driver.findElements(pageForm.getBtn_dropdownOptions());
        dropdownOptions.get(1).click();
    }
    @And("user click active button")
    public void user_click_active_button() {
        driver.findElement(pageForm.getBtn_active()).click();
    }
    @And("user click ok")
    public void user_click_ok() {
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageForm.getBtn_okOnModal())
        );
        driver.findElement(pageForm.getBtn_okOnModal()).click();
    }

}
