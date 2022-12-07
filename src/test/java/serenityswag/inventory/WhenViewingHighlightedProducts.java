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

    ProductDetailsPageObject productDetails;

    @Test
    public void shouldDisplayHighLightedProductsOnTheWelcomePage(){
        login.as(User.STANDARD_USER);

        List<String> productsOnDisplay = productList.titles();

        assertThat(productsOnDisplay).hasSize(6).contains("Sauce Labs Backpack");

    }

    @Test
    public void highligtedProductsShouldDisplayTheCorrespondingImages(){
        login.as(User.STANDARD_USER);
        List<String> productsOnDisplay = productList.titles();
        productsOnDisplay.forEach(
                productName -> assertThat(productList.imageTextForProduct(productName)).isEqualTo(productName)
        );
    }

    @Test
    public void shouldDisplayCorrectProductDetailsPage(){
       login.as(User.STANDARD_USER);

       String firstItemName = productList.titles().get(0);

       productList.openProductDetailsFor(firstItemName);

       assertThat(productDetails.productName()).isEqualTo(firstItemName);
       productDetails.productImageWithAltValueOf(firstItemName).shouldBeVisible();

    }
}
