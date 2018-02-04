package TestRunning;

import login.BasePage;
import org.testng.annotations.AfterClass;

import static SetUp.Setup.quitDriver;

public class BaseTest extends BasePage {
    @AfterClass
    public void teawDown (){
        quitDriver();

    }


}
