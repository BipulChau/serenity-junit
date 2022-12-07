package serenityswag.inventory;

import net.serenitybdd.core.pages.WebElementState;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProductDetailsPageObject extends PageObject {
    public String productName() {
        return $(".inventory_details_name").getText();
    }

    public WebElementState productImageWithAltValueOf(String firstItemName) {
        return $(".inventory_details_container img[alt='" +firstItemName + "']");
    }
}
