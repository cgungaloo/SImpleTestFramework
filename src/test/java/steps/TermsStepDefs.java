package steps;

import cucumber.api.java.en.Then;
import pages.terms.Terms;
import utils.Page_Factory;
import static org.junit.Assert.*;

public class TermsStepDefs {

    private Terms terms;
    @Then("^I should see the terms page$")
    public void iShouldSeeTheTermsPage() throws Throwable {
        int x = 5;
        assertEquals(x,5);
    }
}
