package starter.opencart;

import net.serenitybdd.core.steps.UIInteractions;
//import org.openqa.selenium.Keys;
//import net.serenitybdd.core.pages.PageComponent;

public class NavigateActions extends UIInteractions {
    public void toAbstactaPage() {
        openUrl("https://opencart.abstracta.us");
    }
    public class ClicActions extends UIInteractions {
        public void clickAddCartButton() {
            $("[onclick=\"cart.add('43')\"]").click();
        }
    }
    
    public class checkoutActions extends UIInteractions {
        public void clickCartButton() {
            $("#cart button").click();
        }
    }
    
        public void clickCheckout() {
        	$("[href*='route=checkout/checkout']").click();
        }
 
        public void selectGuestCheckout() {
            $("[value='guest']").click();
        }
        
    public class ClicActionsContinue extends UIInteractions {
        public void selectContinue() {
            $("//input[@id='button-account']").click();
        }
    }
    
    public class BillingDetailsActions extends UIInteractions {

        public void fillBillingDetails(String firstName, String lastName, String email, 
                                       String telephone, String company, String address1, String city, 
                                       String postCode, String country, String zone) {
            
            enterPersonalDetails(firstName, lastName, email, telephone);
            enterAddressDetails(company, address1, city, postCode);
            selectLocation(country, zone);
        }

        private void enterPersonalDetails(String firstName, String lastName, String email, String telephone) {
            $("#input-payment-firstname").sendKeys(firstName);
            $("#input-payment-lastname").sendKeys(lastName);
            $("#input-payment-email").sendKeys(email);
            $("#input-payment-telephone").sendKeys(telephone);
        }

        private void enterAddressDetails(String company, String address1, String city, String postCode) {
            $("#input-payment-company").sendKeys(company);
    		$("#input-payment-address-1").sendKeys(address1);
            $("#input-payment-city").sendKeys(city);
            $("#input-payment-postcode").sendKeys(postCode);
        }

        private void selectLocation(String country, String zone) {
            $("#input-payment-country").selectByVisibleText(country);
            $("#input-payment-zone").selectByVisibleText(zone);
        }
    }
    
    public class ClicActionsContinueDetails extends UIInteractions {
        public void selectContinueDetails() {
            $("//input[@id='button-guest']").click();
        }
    }
    
    public class ClicActionsDeliveryMethod extends UIInteractions {
        public void selectContinueDelivery() {
            $("//input[@id='button-shipping-method']").click();
        }
    }
    
    public void acceptTermsAndConditions() {
        $("[name='agree']").click();
    }
    
    public class ClicActionsPaymentMethod extends UIInteractions {
        public void selectContinuePayment() {
            $("//input[@id='button-payment-method']").click();
        }
    }
    public class ClicActionsConfirmOrder extends UIInteractions {
        public void selectConfirmorder() {
            $("//input[@id='button-confirm']").click();
        }
    }
    
}


