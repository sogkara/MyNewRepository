package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import sun.rmi.runtime.Log;

import java.util.logging.Logger;

import static SetUp.Setup.getDriver;

public abstract class BasePage <T> {
private  static Logger log = Logger.getLogger(Log.class.getName());
private WebDriver driver;

public BasePage(){
    driver = getDriver();
    PageFactory.initElements(driver, this);
}

    public static final String BASE_URL =
            System.getProperty("selenium.url", "http://the-internet.herokuapp.com");

    public void visit(String url) {
        log.info("Visiting " + url);
        driver.get(url);
    }

    public void sendKeys(WebElement element, String text){

        element.sendKeys(text);

    }


}
