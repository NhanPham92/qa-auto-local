package pages;

import org.openqa.selenium.By;

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


    public Boolean homePageLoaded() {
        return find_element(homePageTitle).getText().equals(homePageTxt);
    }

    public void gotoLoginPage() {
        find_element(loginPageRef).click();
    }

    public void gotoBasicAuthPage() {
        find_element(basicAuthRef).click();
    }

    public void gotoGeolocationPage() {
        find_element(geoLocationRef).click();
    }

    public void gotoABTesting() {
        find_element(abTestingRef).click();
            }

    public void gotoBrokenImagespage() {
        find_element(brokenImagesRef).click();
    }

    public void gotoCheckBoxesPage() {
        find_element(checkBoxsRef).click();
    }

    public void gotoContextMenuPage() {
        find_element(contextMenuRef).click();
    }

    public void gotoDragAndDropPage() {
        find_element(draganddropRef).click();
    }

    public void gotoDropDownPage() {
        find_element(dropDrowRef).click();
    }

    public void gotoFileDownLoadPage() {
        find_element(fileDownLoadRef).click();
    }
}
