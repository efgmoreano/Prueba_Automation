package starter.opencart;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

//import starter.opencart.Navigate; 
//import starter.opencart.ClicActions;
//import starter.opencart.ClicActionsCheckout;
//import starter.opencart.BillingDetailsActions;
//import starter.opencart.ClicActionsDeliveryMethod;

@ExtendWith(SerenityJUnit5Extension.class)
class WhenPurchasingAnItemAsGuest {

    // 1. Serenity gestiona la apertura y cierre del navegador Chrome
    @Managed(driver = "chrome")
    WebDriver driver;

    // 2. Inyección automática de todas tus clases de interacción (Page Objects)
    Navigate navigate;
    ClicActions clicActions;
    ClicActionsCheckout checkoutActions;
    BillingDetailsActions fillBillingDetails;
    ClicActionsDeliveryMethod paymentMethod;

    @Test
    void shouldBeAbleToCompleteTheGuestCheckoutFlow() {
        navigate.toTheOpenCartHomePage();
        clicActions.clickAddCartButton();
        clicActions.clickCartButton();
        checkoutActions.clickCheckout();
        checkoutActions.selectGuestCheckout();
        checkoutActions.selectContinue();
        BillingDetailsActions.fillBillingDetails(
        		"Elsy Fabiola",
        		"Ninguna",
        		"pruebas@hotmail.com",
        		"+575555555555",
        		"Calle 25D sur # 32 05",
        		"Bogotá", "110931",
        		"Colombia",
        		"Bolivar",
        		null); 
        fillBillingDetails.selectContinueDetails();
        paymentMethod.acceptTermsAndConditions();
    }
}