package support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by khanh.nguyen on 6/2/2015.
 */
public class Helpers {
    /**
     * Return an element by locator *
     */
    public static WebElement find_element(WebDriver driver, By locator) {
        return driver.findElement(locator);
    }
}
