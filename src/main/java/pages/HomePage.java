package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static support.Helpers.find_element;

/**
 * Created by khanh.nguyen on 6/4/2015.
 */
public class HomePage {
    By homePageTitle = By.xpath("//*[@id='content']/h1");
    String homePageTxt = "Welcome to the Internet";

    By loginPageRef = By.xpath("//*[@id='content']/ul/li[16]/a");
    By basicAuthRef = By.xpath("//*[@id='content']/ul/li[2]/a");
    By geoLocationRef = By.xpath("//*[@id='content']/ul/li[18]/a");
    By abTestingRef = By.xpath("//*[@id='content']/ul/li[1]/a");
    By brokenImagesRef = By.xpath("//*[@id='content']/ul/li[3]/a");
    By checkBoxsRef = By.xpath("//*[@id='content']/ul/li[5]/a");
    By contextMenuRef = By.xpath("//*[@id='content']/ul/li[6]/a");
    By draganddropRef = By.xpath("//*[@id='content']/ul/li[8]/a");
    By dropDrowRef = By.xpath(("//*[@id='content']/ul/li[9]/a"));
    By fileDownLoadRef = By.xpath("//*[@id='content']/ul/li[13]/a");


    public Boolean homePageLoaded (WebDriver driver){
        return find_element(driver, homePageTitle).getText().equals(homePageTxt);
    }

    public void gotoLoginPage (WebDriver driver){
        find_element(driver, loginPageRef).click();
    }

    public void gotoBasicAuthPage (WebDriver driver){
        find_element(driver, basicAuthRef).click();
    }

    public void gotoGeolocationPage (WebDriver driver){
        find_element(driver, geoLocationRef).click();
    }

    public void gotoABTesting (WebDriver driver){
        find_element(driver, abTestingRef).click();
            }

    public void gotoBrokenImagespage (WebDriver driver) { find_element(driver, brokenImagesRef).click();}

    public void gotoCheckBoxesPage (WebDriver driver) { find_element(driver, checkBoxsRef).click();}

    public void gotoContextMenuPage (WebDriver driver) { find_element(driver, contextMenuRef).click();}

    public void gotoDragAndDropPage (WebDriver driver) { find_element(driver, draganddropRef).click();}

    public void gotoDropDownPage (WebDriver driver) { find_element(driver, dropDrowRef).click(); }

    public void gotoFileDownLoadPage (WebDriver driver) { find_element(driver, fileDownLoadRef).click();}
}
