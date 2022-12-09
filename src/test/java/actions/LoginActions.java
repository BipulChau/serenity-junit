package actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import serenityswag.authentication.LoginForm;
import serenityswag.authentication.User;

public class LoginActions extends UIInteractionSteps {
    @Step("Log in as {0}")
    public void as(User user){
        openUrl("https://www.saucedemo.com/");

//        Login as a standard user

//        $("[data-test='username']").sendKeys(user.getUsername());
//       $("#user-name").sendKeys(user.getUsername());
       $(LoginForm.USER_NAME).sendKeys(user.getUsername());
//        $("[data-test='password']").sendKeys(user.getPassword());
//        $("#password").sendKeys(user.getPassword());
        $(LoginForm.PASSWORD).sendKeys(user.getPassword());
//        $("[data-test='login-button']").click();
//        $("#login-button").click();
        $(LoginForm.LOGIN_BUTTON).click();
    }
}
