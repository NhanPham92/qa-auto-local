package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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

    public Boolean loginPageLoaded(WebDriver driver){
        return find_element(driver, loginPageTitle).getText().equals("Login Page");
    }

    public void loginToLoginPage(WebDriver driver, String user, String pass){
        find_element(driver, username).sendKeys(user);
        find_element(driver, password).sendKeys(pass);
        find_element(driver, loginBtn).click();
        driver.navigate().back();
    }

}
