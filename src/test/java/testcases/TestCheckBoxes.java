package testcases;

import Utils.SetupTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckBoxsPage;
import pages.HomePage;

import java.util.List;

/**
 * Created by namdo on 05/06/2015.
 */
public class TestCheckBoxes extends SetupTest {
    @Test
    public void test_checkBoxesPage() {
        HomePage homepage = new HomePage();
        homepage.homePageLoaded(driver);
        homepage.gotoCheckBoxesPage(driver);

        CheckBoxsPage checkboxespage = new CheckBoxsPage();
        checkboxespage.checkBoxesPageLoaded(driver);
        List<WebElement> webElementList = checkboxespage.get_defaultCheckBox(driver);
        Assert.assertEquals(webElementList.get(0).isSelected(), false);
        Assert.assertEquals(webElementList.get(1).isSelected(), true);
        checkboxespage.select_checkBoxes(driver);
    }


}
