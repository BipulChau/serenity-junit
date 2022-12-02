package serenityswag.authentication;

import actions.LoginActions;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import serenityswag.inventory.InventoryPage;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(SerenityRunner.class)
public class WhenLoggingOn  {
    @Managed
    WebDriver driver;


    @Steps
    LoginActions login;

    InventoryPage inventoryPage;

    @Test
    public void usersCanLogOnViaTheHomePage(){

        login.asAStandardUser();
        //should see product catalog

        assertThat(inventoryPage.getHeading()).isEqualToIgnoringCase("Products");

    }

}
