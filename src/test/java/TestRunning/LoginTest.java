package TestRunning;

import login.loginClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {


   public WebDriver driver;
    loginClass loginclass = new loginClass();
    @BeforeMethod
    public void setUp() {

        loginClass loginclass = new loginClass();
    }
    @Test
   public void click(){
        loginclass.submit();
    }

}
