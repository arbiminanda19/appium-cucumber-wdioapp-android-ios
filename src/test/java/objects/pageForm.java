package objects;

import org.openqa.selenium.By;

public class pageForm {

    By txt_input = By.xpath("//XCUIElementTypeTextField[@name='text-input']");

    By txt_inputResult = By.xpath("//XCUIElementTypeOther[contains(@label,'Input field: You have typed')]");

    By btn_switch = By.xpath("//XCUIElementTypeSwitch[@name='switch']");

    By btn_returnKeyboard = By.xpath("//XCUIElementTypeButton[@name='Return']");

    By btn_dropdown = By.xpath("//XCUIElementTypeTextField[@name='text_input']");

    By btn_dropdownOptions = By.xpath("//XCUIElementTypePicker[@name='Dropdown picker']/XCUIElementTypePickerWheel");

    By btn_active = By.xpath("//XCUIElementTypeOther[@name='button-Active']");

    By btn_okOnModal = By.xpath("//XCUIElementTypeButton[@name='OK']");

    By btn_doneDropdown = By.xpath("//XCUIElementTypeOther[@name='done_button']");

    public By getTxt_input() {
        return txt_input;
    }

    public By getTxt_inputResult() {
        return txt_inputResult;
    }

    public By getBtn_switch() {
        return btn_switch;
    }

    public By getBtn_dropdown() {
        return btn_dropdown;
    }

    public By getBtn_active() {
        return btn_active;
    }

    public By getBtn_okOnModal() {
        return btn_okOnModal;
    }

    public By getBtn_returnKeyboard() {
        return btn_returnKeyboard;
    }

    public By getBtn_dropdownOptions() {
        return btn_dropdownOptions;
    }

    public By getBtn_doneDropdown() {
        return btn_doneDropdown;
    }
}
