package pages.search_results;
import org.openqa.selenium.WebElement;
import pages.PageModel;
import java.util.List;

public abstract class SearchResults extends PageModel{

    public Boolean checkSearchResults(String searchText){
        WebElement searchBarItem = this.getElementsByXpath("//*[@id=\"lst-ib\"]");
        Boolean isSearchItemInBar = searchBarItem.getAttribute("value").equals(searchText);
        return isSearchItemInBar;
    }

    public Boolean checkTabs(List<String> tabs){
        Integer divnum =1;
        String xpath;

        for(String tab : tabs){
            System.out.println("Checking tab : "+tab);

            if (tab.equals("Settings")){
                xpath = "//*[@id=\"abar_button_opt\"]";
            }else{
                xpath ="//*[@id=\"hdtb-tls\"]";
            }
            WebElement tabItem = this.getElementsByXpath(xpath);
            if(tabItem.getText().equals(tab) ==false){
                System.out.println(tab + " Did not match");
                return false;
            }
            divnum++;
        }
        return true;
    }
}