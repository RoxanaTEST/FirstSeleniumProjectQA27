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


public class WishListTest extends BaseTest {

    @Test
    public void validWishlisttest() {
        wishlistPage.clicksaleCategory();
        wishlistPage.clickViewProductdetails();
        wishlistPage.clickAddtoWishlist();
        loginPage.setEmailField(userEmail);
        loginPage.setPasswordField(userPass);
        loginPage.clickLoginButton();
        Assert.assertTrue(wishlistPage.isproductDisplayedinWishlist());

    }
}
