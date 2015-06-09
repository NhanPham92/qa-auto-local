package testcases;

import Utils.SetupTest;
import org.testng.annotations.Test;
import pages.ABTesting;
import pages.HomePage;

/**
 * Created by namdo on 04/06/2015.
 */
public class TestABTesting extends SetupTest{
    @Test
    public void test_ABTestingpage(){
        HomePage homepage = new HomePage();
        homepage.homePageLoaded(driver);
        homepage.gotoABTesting(driver);

        ABTesting abtesting = new ABTesting();
        abtesting.abTestingLoaded(driver);
    }

}
