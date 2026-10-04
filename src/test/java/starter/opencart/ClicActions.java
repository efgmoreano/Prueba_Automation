package starter.opencart;

import net.serenitybdd.core.steps.UIInteractions;

public class ClicActions extends UIInteractions {
    public void clickAddCartButton() {
        $("[onclick=\"cart.add('43')\"]").click();
    }      
        public void clickCartButton() {
            $("#cart button").click();
    }
}
    