package login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginClass {

    @FindBy(css=".tl_logged_out a:nth-child(2)")
    private WebElement login;
    @FindBy(id="#email")
    private WebElement username;
    @FindBy(id="password")
    private WebElement password;
    @FindBy(className = "tl_btn_popup login_btn btnSec transBg")
    private WebElement submitButton;
    public String getUrl() {
        return BASE_URL + "/dropdown";
    }



    public void submit(){

       login.click();
    }
}
