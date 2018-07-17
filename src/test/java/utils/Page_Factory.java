package utils;

import config.GetConfig;
import pages.home.Home_Chrome;
import pages.home.Home;
import pages.home.Home_Firefox;
import pages.search_results.SearchResults;
import pages.search_results.SearchResults_Chrome;
import pages.search_results.SearchResults_Firefox;
import pages.sign_in.SignIn;
import pages.sign_in.SignIn_Chrome;
import pages.sign_in.SignIn_Firefox;
import pages.terms.Terms;
import pages.terms.Terms_Chrome;
import pages.terms.Terms_Firefox;

public class Page_Factory {

    public static Home getHomePage(){
        Home homepage = null;
        if(GetConfig.configItems.get("browser").equals("chrome")){
            homepage= new Home_Chrome();
        }
        else if(GetConfig.configItems.get("browser").equals("firefox")){
            homepage = new Home_Firefox();
        }
        return homepage;
    }

    public static SearchResults getSearchResults(){
        SearchResults searchresults = null;
        if(GetConfig.configItems.get("browser").equals("chrome")){
            searchresults = new SearchResults_Chrome();
        }else if (GetConfig.configItems.get("browser").equals("firefox")){
            searchresults= new SearchResults_Firefox();
        }
        return searchresults;
    }

    public static SignIn getSignIn(){
        SignIn signIn = null;
        if(GetConfig.configItems.get("browser").equals("chrome")){
            signIn = new SignIn_Chrome();
        }else if(GetConfig.configItems.get("browser").equals("firefox")){
            signIn = new SignIn_Firefox();
        }
        return signIn;
    }

    public static Terms getTerms(){
        Terms terms = null;
        if(GetConfig.configItems.get("browser").equals("chrome")){
            terms = new Terms_Chrome();
        }else if(GetConfig.configItems.get("browser").equals("firefox")){
            terms = new Terms_Firefox();
        }
        return terms;
    }
}
