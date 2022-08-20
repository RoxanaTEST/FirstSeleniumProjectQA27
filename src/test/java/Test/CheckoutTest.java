package Test;

import org.junit.Test;

public class CheckoutTest extends BaseTest {


    @Test
    public void validCheckoutTest() {
        // int productQty = 1;
        homePage.clickAccountLink();
        homePage.clickLoginLink();
        loginPage.setEmailField(userEmail);
        loginPage.setPasswordField(userPass);
        loginPage.clickLoginButton();

        homePage.setSearchField("necklace");
        homePage.clickSearchButton();


        productPage.clickAddToCartButton();
        productPage.setQtyandupdateFieldcheckout(1);
        cartPage.clickProceedtoCheckout();

        checkoutPage.clickAddressCheckout();
        checkoutPage.setCheckoutaddress("Aleea Garbau nr 11 ap 78");

        checkoutPage.clickCityCheckoutfield();
        checkoutPage.setCheckoutcity("Cluj-Napoca");


        checkoutPage.selectCheckoutCountry();
        checkoutPage.typeinChechoutCountry("romania");
        checkoutPage.clickSelectedCountry();


        checkoutPage.selectCheckoutstate();
        checkoutPage.typeinCheckoutState("Cluj");
        checkoutPage.clickSelectedState();

        checkoutPage.setCheckoutZipcode("400534");
        checkoutPage.setCheckoutTelephoneNo("0759552434");
        checkoutPage.countinueCheckoutbutton1();

       // checkoutPage.clickonCheckoutbutton2();
       // checkoutPage.clickonPaymentCheckoutButton();


    }
}

