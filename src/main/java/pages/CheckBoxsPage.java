package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static support.Helpers.find_element;
import static support.Helpers.find_elements;

/**
 * Created by namdo on 05/06/2015.
 */
public class CheckBoxsPage {
    By checkBoxesText = By.xpath("//*[@id='content']/div/h3");
    By checkBoxes = By.cssSelector("input[type='checkbox']");

    public Boolean checkBoxesPageLoaded (WebDriver driver){
        return find_element(driver, checkBoxesText).getText().equals("Checkboxes");
    }

    public void select_checkBoxes (WebDriver driver) {
        List<WebElement> listItem = (List<WebElement>) find_elements(driver, checkBoxes);
        for (int i = 0; i < listItem.size(); i++) {
            listItem.get(i).click();
        }
    }
    public List<WebElement> get_defaultCheckBox (WebDriver driver) {
        List<WebElement> listItem =  find_elements(driver, checkBoxes);
        return listItem;
    }
}
