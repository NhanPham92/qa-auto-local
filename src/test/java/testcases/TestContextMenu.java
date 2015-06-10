package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContextMenuPage;
import pages.HomePage;
import support.SetupTest;

/**
 * Created by namdo on 08/06/2015.
 */
public class TestContextMenu extends SetupTest{
    @Test
    public void test_contextMenu() throws InterruptedException {
        HomePage homepage = new HomePage();
        homepage.homePageLoaded();
        homepage.gotoContextMenuPage();

        ContextMenuPage contextmenupage = new ContextMenuPage();
        contextmenupage.checkContextMenuLoaded();
        Assert.assertEquals(contextmenupage.checkAlertOpened(), Boolean.TRUE);
    }

    @Test
    public void test_closeAlert() throws InterruptedException {
        HomePage homepage = new HomePage();
        homepage.homePageLoaded();
        homepage.gotoContextMenuPage();

        ContextMenuPage contextmenupage = new ContextMenuPage();
        contextmenupage.checkContextMenuLoaded();
        contextmenupage.closeAlert();
    }
}
