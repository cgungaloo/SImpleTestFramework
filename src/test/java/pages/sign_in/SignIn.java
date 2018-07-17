package pages.sign_in;

import org.openqa.selenium.WebElement;
import pages.PageModel;

public abstract class SignIn extends PageModel {
    public Boolean checkSignInPage(){
        //does not work in headless mode for chrome (works headless in firefox);
        WebElement signInSign = this.getElementById("headingText");
        return signInSign.getText().equals("Sign in");

    }
}
