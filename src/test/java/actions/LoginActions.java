package actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class LoginActions extends UIInteractionSteps {
    @Step("Log in as {0}")
    public void usingCredentials(String username, String password){
        openUrl("https://www.saucedemo.com/");

        //Login as a standard user

        $("[data-test='username']").sendKeys(username);
        $("[data-test='password']").sendKeys(password);
        $("[data-test='login-button']").click();

    }
}
