package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import static support.Helpers.find_element;

/**
 * Created by namdo on 04/06/2015.
 */
public class ABTesting {
    By abText = By.xpath("//*[@id='content']/div/h3");

    public Boolean abTestingLoaded(WebDriver driver){
        return find_element(driver, abText).getText().equals("A/B Test Control");
    }



}
