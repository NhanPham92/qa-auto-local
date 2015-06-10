package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by khanh.nguyen on 6/2/2015.
 */
public class SetupTest {
    public static WebDriver driver;

    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("http://the-internet.herokuapp.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void tearDown(){
        driver.quit();
    }
}
