package starter.opencart;

import net.serenitybdd.core.steps.UIInteractions;

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
    
    public void selectContinueDetails(){
        $("//input[@id='button-guest']").click();
    }
}
