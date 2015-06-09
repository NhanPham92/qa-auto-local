package testcases;

import Utils.SetupTest;
import org.testng.annotations.Test;
import pages.DragAndDropPage;
import pages.HomePage;

/**
 * Created by namdo on 08/06/2015.
 */
public class TestDragAndDrop extends SetupTest {
    @Test
    public void test_dragAndDrop(){
        HomePage homePage = new HomePage();
        homePage.homePageLoaded(driver);
        homePage.gotoDragAndDropPage(driver);

        DragAndDropPage draganddroppage = new DragAndDropPage();
        draganddroppage.checkDragAndDropPageLoaded(driver);
        draganddroppage.dragAndDropColumn(driver);
    }
}
