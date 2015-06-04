package testcases;

import Utils.SetupTest;
import org.testng.annotations.Test;
import pages.BasicAuthPage;
import pages.HomePage;

/**
 * Created by khanh.nguyen on 5/27/2015.
 */
public class TestBasicAuth extends SetupTest{
    @Test
    public void test_BasicAuthPage(){
        HomePage homepage = new HomePage();
        homepage.homePageLoaded(driver);

        BasicAuthPage authpage = new BasicAuthPage();
        authpage.basicAuthLogin(driver); //Caching Credentials
        homepage.homePageLoaded(driver);
        homepage.gotoBasicAuthPage(driver);
        authpage.basicAuthLoaded(driver);
    }
}
