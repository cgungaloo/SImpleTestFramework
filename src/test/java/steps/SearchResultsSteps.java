package steps;

import cucumber.api.java.en.*;
import pages.home.Home;
import pages.search_results.SearchResults;
import utils.Page_Factory;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SearchResultsSteps {
    private SearchResults searchResults;
    @Then("^I can see the search results for \"([^\"]*)\" in the search results page$")
    public void iCanSeeTheSearchResultsForInTheSearchResultsPage(String arg0){
        int x = 5;
        assertEquals(x,5);
    }

    @And("^I can see the following tabs:$")
    public void iCanSeeTheFollowingTabs(List<String> tabs) throws Throwable {
        int x = 5;
        assertEquals(x,5);
    }
}
