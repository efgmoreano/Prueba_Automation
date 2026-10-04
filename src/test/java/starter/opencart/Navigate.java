package starter.opencart;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

public class Navigate extends UIInteractions {

    @Step("Open the abstracta home page")
    public void toTheDuckDuckGoSearchPage() {
        openUrl("https://opencart.abstracta.us");
    }

	public void toTheOpenCartHomePage() {
		// TODO Auto-generated method stub
		
	}
}
