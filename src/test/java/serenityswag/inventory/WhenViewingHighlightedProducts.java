package serenityswag.inventory;

import actions.LoginActions;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import serenityswag.authentication.User;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SerenityRunner.class)
public class WhenViewingHighlightedProducts {
    @Managed
    WebDriver driver;

    @Steps
    LoginActions login;

    ProductListPageObject productList;

    @Test
    public void shouldDisplayHighLightedProductsOnTheWelcomePage(){
        login.as(User.STANDARD_USER);

        List<String> productsOnDisplay = productList.titles();

        assertThat(productsOnDisplay).hasSize(6).contains("Sauce Labs Backpack");

    }
}
