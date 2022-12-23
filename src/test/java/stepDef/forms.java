package stepDef;

import config.env;
import helper.dbConnection;
import io.cucumber.java.en.And;
import objects.pageForm;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.HashMap;
import java.util.List;

public class forms extends env {

    pageForm pageForm = new pageForm();
    HashMap<String, Object> scrollObject = new HashMap<>();

    dbConnection dbConnection = new dbConnection();

    @And("user fill input field")
    public void user_fill_input_field() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageForm.getTxt_input())
        );
        String input = dbConnection.getUsername();

        String inputResult;
        driver.findElement(pageForm.getTxt_input()).sendKeys(input);
        List <WebElement> txt_inputResult = driver.findElements(pageForm.getTxt_inputResult());
        inputResult = txt_inputResult.get(txt_inputResult.size()-1).getAttribute("name");
        Assert.assertEquals(inputResult, "Input field: You have typed: " + input);
        if (driver.findElements(pageForm.getBtn_returnKeyboard()).size() > 0) {
            driver.findElement(pageForm.getBtn_returnKeyboard()).click();
        }
    }
    @And("user change switch state")
    public void user_change_switch_state() {
        driver.findElement(pageForm.getBtn_switch()).click();
        scrollObject.put("direction", "down");
        scrollObject.put("name", "button-Active");
        driver.executeScript("mobile:scroll", scrollObject);
    }
    @And("user choose dropdown field")
    public void user_choose_dropdown_field() {
        driver.findElement(pageForm.getBtn_dropdown()).click();
        driver.findElement(pageForm.getBtn_dropdownOptions()).sendKeys("Appium is awesome");
        driver.findElement(pageForm.getBtn_doneDropdown()).click();
    }
    @And("user click active button")
    public void user_click_active_button() {
        driver.findElement(pageForm.getBtn_active()).click();
    }
    @And("user click ok")
    public void user_click_ok() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageForm.getBtn_okOnModal())
        );
        driver.findElement(pageForm.getBtn_okOnModal()).click();
    }

}
