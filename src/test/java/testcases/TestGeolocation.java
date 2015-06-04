package testcases;

import Utils.SetupTest;
import org.testng.annotations.Test;
import pages.GeolocationPage;
import pages.HomePage;

/**
 * Created by khanh.nguyen on 5/27/2015.
 */
public class TestGeolocation extends SetupTest {
    @Test
    public void test_Geolocation(){
        HomePage homePage = new HomePage();
        homePage.homePageLoaded(driver);
        homePage.gotoGeolocationPage(driver);

        GeolocationPage geolocationPage = new GeolocationPage();
        geolocationPage.geoPageLoaded(driver);
        geolocationPage.click_whereBtn(driver);
    }
}
