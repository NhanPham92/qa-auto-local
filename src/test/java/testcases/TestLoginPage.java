package testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import support.SetupTest;

/**
 * Created by khanh.nguyen on 6/2/2015.
 */
public class TestLoginPage extends SetupTest {
    @DataProvider
    Object[][] getCredentials() {
        return new Object[][]{
                {"tomsmith", "SuperSecretPassword!"},
                {"a12345", "Mr Test"}
        };
    }

    @Test(dataProvider =  "getCredentials")
    public void testLoginPage(String user, String pass){
        HomePage homepage = new HomePage();
        Assert.assertEquals(homepage.homePageLoaded(), Boolean.TRUE);
        homepage.gotoLoginPage();

        LoginPage loginpage = new LoginPage();
        Assert.assertEquals(loginpage.loginPageLoaded(), Boolean.TRUE);
        loginpage.loginToLoginPage(user, pass);
    }
}
