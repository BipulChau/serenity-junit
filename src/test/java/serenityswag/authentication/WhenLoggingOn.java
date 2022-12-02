package serenityswag.authentication;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class WhenLoggingOn {
    @Managed
    WebDriver driver;

    @Test
    public void usersCanLogOnViaTheHomePage(){
        driver.get("https://www.saucedemo.com/");
    }

}
