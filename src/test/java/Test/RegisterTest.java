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

public class RegisterTest extends BaseTest {

    @Test
    public void registeredAlreadyemailtest() {

        homePage.clickAccountLink();
        homePage.clickRegisterlink();
        registerPage.setRegisterfirstname(firstName);
        registerPage.setMiddlename(middleName);
        registerPage.setLastname(lastName);
        registerPage.setEmailAddress(userEmail);
        registerPage.setPassword(userPass);
        registerPage.setPasswordReconfirm(userPass);
        registerPage.clickRegistersubscription();
        registerPage.clickRegisterButton();


        Assert.assertEquals("There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.", registerPage.getAlreadyregisterederror());

    }
       @Test
        public void validRegistertest() {
           homePage.clickAccountLink();
           homePage.clickRegisterlink();
           registerPage.setRegisterfirstname("Anca");
           registerPage.setMiddlename("Maria");
           registerPage.setLastname("Man");
           registerPage.setEmailAddress("ancamariam@yahoo.com");
           registerPage.setPassword("1234566");
           registerPage.setPasswordReconfirm("1234566");
           registerPage.clickRegistersubscription();
           registerPage.clickRegisterButton();

           Assert.assertEquals("Hello, "+ "Anca Maria Man" +"!", accountPage.getWelcomeText());


           Assert.assertEquals("Thank you for registering with Madison Island.",accountPage.getRegistrationWelcomeMsg());



        }
        @Test
        public void invalidcredentialsRegistertest() {
            homePage.clickAccountLink();
            homePage.clickRegisterlink();
            registerPage.setRegisterfirstname("fggffhf");
            registerPage.setMiddlename("123673r34");
            registerPage.setLastname("---");
            registerPage.setEmailAddress("jdjkfkf@djjhh.com");
            registerPage.setPassword("123456!");
            registerPage.setPasswordReconfirm("123456!");
            registerPage.clickRegistersubscription();
            registerPage.clickRegisterButton();




            Assert.assertTrue(accountPage.isdashboardTextDisplayed());



        }

        @Test
        public void passwordsNotmatchRegisterTest(){
            homePage.clickAccountLink();
            homePage.clickRegisterlink();
            registerPage.setRegisterfirstname(firstName);
            registerPage.setMiddlename(middleName);
            registerPage.setLastname(lastName);
            registerPage.setEmailAddress(userEmail);
            registerPage.setPassword(userPass);
            registerPage.setPasswordReconfirm("123456!");
            registerPage.clickRegistersubscription();
            registerPage.clickRegisterButton();


            Assert.assertTrue(registerPage.getPasswordnotMatchingError());



        }

}
