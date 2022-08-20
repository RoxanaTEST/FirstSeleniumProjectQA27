package Test;

import org.apache.commons.lang3.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LoginTest extends BaseTest {
    @Test
    public void validLoginTest1(){
        homePage.clickAccountLink();
        homePage.clickLoginLink();
        loginPage.setEmailField(userEmail);
        loginPage.setPasswordField(userPass);
        loginPage.clickLoginButton();
        Assert.assertEquals("Hello, "+userName+"!", accountPage.getWelcomeText());
    }

    @Test
    public void invalidLoginTest() {
        homePage.clickAccountLink();
        homePage.clickLoginLink();
        loginPage.setEmailField("jhjj@h3.com");
        loginPage.setPasswordField("HFHFJJFKF22");
        loginPage.clickLoginButton();

        Assert.assertEquals("Invalid login or password.", loginPage.getInvalidLoginText());
        wait(10);
    }

    @Test
    public void emptyfieldsLoginTest() {

        homePage.clickAccountLink();
        homePage.clickLoginLink();
        loginPage.setEmailField(" ");
        loginPage.setPasswordField(" ");
        loginPage.clickLoginButton();
        wait(10);

        Assert.assertEquals("This is a required field.", loginPage.getMandatoryfieldserrortext());


    }


//#nav > ol > li.level0.nav-1.first.parent > a
            //        String random = RandomStringUtils.randomAlphanumeric(12);
            //        String myEmail = random+"@testemail.com";


        @After
        public void closeDriver () {
            driver.quit();
        }


    }


