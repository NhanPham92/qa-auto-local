package testcases;

import Utils.SetupTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;

/**
 * Created by khanh.nguyen on 6/2/2015.
 */
public class TestLoginPage extends SetupTest{

    @DataProvider
    Object[][] getCredentials() {
        return new Object[][]{
                {"tomsmith", "SuperSecretPassword!"},
                {"a12345", "Mr Test"}
        };
    }

    @Test(dataProvider =  "getCredentials")
    public void testLoginPage(String user, String pass){
        LoginPage loginpage = new LoginPage();
        Assert.assertEquals(loginpage.loginPageLoaded(driver), Boolean.TRUE);
        loginpage.loginToLoginPage(driver, user, pass);
    }
}
