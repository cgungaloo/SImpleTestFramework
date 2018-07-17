package pages.terms;

import org.openqa.selenium.WebElement;
import pages.PageModel;

public abstract class Terms extends PageModel{

    public Boolean checkTermsPage(){
        WebElement termsHighlight= this.getElementsByXpath("//*[@id=\"maia-nav-y\"]/ul/li[1]");
        return termsHighlight.getText().equals("Terms of Service");
    }
}
