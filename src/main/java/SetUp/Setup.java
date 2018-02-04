package SetUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Setup {
    private static WebDriver driver;
    public static String BROWSER = System.getProperty("selenium.browser", "chrome");


    public static WebDriver getDriver(){
if (driver==null) {
    switch (BROWSER) {
        case "chrome":
            String chromeDriverLocation = System.getProperty("selenium.chromeDriver", "C:\\Users\\Anyutsk3\\Desktop\\chrome\\chromeDriver.exe");
            System.setProperty("webDriver.chrome.driver", chromeDriverLocation);
            driver = new ChromeDriver();
            break;

        case "firefox":
            String fireFoxDriverLocation = System.getProperty("selenium.geckodriver", "C:\\Users\\Anyutsk3\\Desktop\\geckodriver\\geckodriver.exe");
            System.setProperty("webdriver.gecko.driver", fireFoxDriverLocation);
            driver = new FirefoxDriver();
            break;
    }

}

return driver;

    }
    public static void quitDriver (){

        if(driver!=null){
            if(BROWSER.equals("firefox")){
                driver.close();
                driver=null;
            }
            else if(BROWSER.equals("chrome")){
                driver.close();
                driver.quit();

                driver=null;
            }
        }
    }


}
