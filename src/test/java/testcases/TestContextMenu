package testcases;

import Utils.SetupTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContextMenuPage;
import pages.HomePage;

/**
 * Created by namdo on 08/06/2015.
 */
public class TestContextMenu extends SetupTest{
    @Test
    public void test_contextMenu() throws InterruptedException {
        HomePage homepage = new HomePage();
        homepage.homePageLoaded(driver);
        homepage.gotoContextMenuPage(driver);

        ContextMenuPage contextmenupage = new ContextMenuPage();
        contextmenupage.checkContextMenuLoaded(driver);
        Assert.assertEquals(contextmenupage.checkAlertOpened(driver), Boolean.TRUE);
    }

    @Test
    public void test_closeAlert() throws InterruptedException {
        HomePage homepage = new HomePage();
        homepage.homePageLoaded(driver);
        homepage.gotoContextMenuPage(driver);

        ContextMenuPage contextmenupage = new ContextMenuPage();
        contextmenupage.checkContextMenuLoaded(driver);
        contextmenupage.closeAlert(driver);
    }
}
