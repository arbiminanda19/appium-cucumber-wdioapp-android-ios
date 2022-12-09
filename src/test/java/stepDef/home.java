package stepDef;

import config.env;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import objects.pageHome;

import java.net.MalformedURLException;

public class home extends env {

    pageHome pageHome = new pageHome();

    @Given("user is on app home")
    public void user_is_on_app_home() throws MalformedURLException {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageHome.getPage_home())
        );
    }
    @When("user access form page")
    public void user_access_form_page() {
        driver.findElement(pageHome.getBtn_form()).click();
    }

    @When("user access swipe page")
    public void user_access_swipe_page() {
        driver.findElement(pageHome.getBtn_swipe()).click();
    }

    @When("user access drag page")
    public void user_access_drag_page() {
        driver.findElement(pageHome.getBtn_drag()).click();
    }

}
