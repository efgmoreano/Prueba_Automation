package starter.opencart;

import net.serenitybdd.core.steps.UIInteractions;

public class ClicActionsDeliveryMethod extends UIInteractions {
    public void selectContinueDelivery() {
        $("//input[@id='button-shipping-method']").click();
    }


public void acceptTermsAndConditions() {
    $("[name='agree']").click();
}


    public void selectContinuePayment() {
        $("//input[@id='button-payment-method']").click();
    }

    public void selectConfirmorder() {
        $("//input[@id='button-confirm']").click();
    }
}