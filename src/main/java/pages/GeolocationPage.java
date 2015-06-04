package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static support.Helpers.find_element;

/**
 * Created by khanh.nguyen on 5/27/2015.
 */
public class GeolocationPage {
    By geoText = By.xpath("//*[@id='content']/div/h3");
    By whereBtn = By.xpath("//*[@id='content']/div/button");

    public Boolean geoPageLoaded(WebDriver driver){
        return find_element(driver, geoText).getText().equals("Geolocation");
    }

    public void click_whereBtn(WebDriver driver){
        find_element(driver, whereBtn).click();
        driver.navigate().back();
    }
}
