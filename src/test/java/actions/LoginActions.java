package actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import serenityswag.authentication.User;

public class LoginActions extends UIInteractionSteps {
    @Step("Log in as {0}")
    public void as(User user){
        openUrl("https://www.saucedemo.com/");

        //Login as a standard user

        //$("[data-test='username']").sendKeys(user.getUsername());
        find(By.id("user-name")).sendKeys(user.getUsername());
        //$("[data-test='password']").sendKeys(user.getPassword());
        find(By.id("password")).sendKeys(user.getPassword());
        //$("[data-test='login-button']").click();
        find(By.id("login-button")).click();
    }
}
