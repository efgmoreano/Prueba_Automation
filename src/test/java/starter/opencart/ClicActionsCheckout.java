package starter.opencart;

import net.serenitybdd.core.steps.UIInteractions;

public class ClicActionsCheckout extends UIInteractions {
    public void clickCheckout() {
    	$("[href*='route=checkout/checkout']").click();
    }
    public void selectGuestCheckout() {
        $("[value='guest']").click();
    }

    public void selectContinue() {
        $("[@id='button-account']").click();
    }
}