package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static support.Helpers.find_element;

/**
 * Created by khanh.nguyen on 5/27/2015.
 */
public class BasicAuthPage {
    By congratText = By.cssSelector("p");

    public Boolean basicAuthLoaded(WebDriver driver){
        return find_element(driver, congratText).getText().equals("Basic Auth");
    }

    public void basicAuthLogin(WebDriver driver) {
        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
        driver.navigate().back();
    }
}
