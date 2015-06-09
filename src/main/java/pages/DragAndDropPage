package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import static support.Helpers.find_element;

/**
 * Created by namdo on 08/06/2015.
 */
public class DragAndDropPage {
    By dragAndDrogText = By.xpath("//*[@id='content']/div/h3");
    By columnA = By.xpath("//*[@id='column-a']");
    By columnB = By.xpath("//*[@id='column-b']");

    public Boolean checkDragAndDropPageLoaded(WebDriver driver){
        return find_element(driver, dragAndDrogText).getText().equals("Drag and Drop");
    }

    public void dragAndDropColumn(WebDriver driver){
        Actions action = new Actions(driver);
        action.dragAndDrop(find_element(driver,columnA), find_element(driver,columnB)).build().perform();
    }


}
