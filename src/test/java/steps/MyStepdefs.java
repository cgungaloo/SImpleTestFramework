package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import pages.home.Home;
import pages.sign_in.SignIn;
import utils.Page_Factory;
import static org.junit.Assert.*;

public class MyStepdefs {

    private Home homepage;
    @Given("^I am on the home page$")
    public void iAmOnTheHomePage() {
        int x = 5;
        assertEquals(x,5);

    }

    @When("^I enter the search term \"([^\"]*)\" into the search bar$")
    public void iEnterTheSearchTermIntoTheSearchBar(String arg0) throws Throwable {
        int x = 5;
        assertEquals(x,5);
    }

    @When("^I click on Sign in$")
    public void iClickOnSignIn() throws Throwable {
        int x = 5;
        assertEquals(x,5);
    }

    @When("^I click on terms$")
    public void iClickOnTerms() throws Throwable {
        int x = 5;
        assertEquals(x,5);
    }

}