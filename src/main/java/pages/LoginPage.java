package pages;

import org.openqa.selenium.By;

import static support.Helpers.driver;
import static support.Helpers.find_element;

/**
 * Created by khanh.nguyen on 6/2/2015.
 */
public class LoginPage {
    /*
     *Login Page's elements
     * @loginPageTitle
     * @username
     * @password
     * @loginBtn
     */
    By loginPageTitle = By.xpath("//*[@id='content']/div/h2");
    By username = By.id("username");
    By password = By.id("password");
    By loginBtn = By.xpath("//*[@id='login']/button");

    public Boolean loginPageLoaded() {
        return find_element(loginPageTitle).getText().equals("Login Page");
    }

    public void loginToLoginPage(String user, String pass) {
        find_element(username).sendKeys(user);
        find_element(password).sendKeys(pass);
        find_element(loginBtn).click();
        driver.navigate().back();
    }

}
