package Test;

import org.junit.Assert;
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
        checkoutPage.clickShiptothisAddress();
        checkoutPage.clickOnCheckoutbutton1();
        checkoutPage.selectcontinuetopaymentbutton2();
        checkoutPage.clickonPaymentCheckoutButton();
        checkoutPage.selectPlaceOrderCheckoutButton();
        Assert.assertEquals("YOUR ORDER HAS BEEN RECEIVED.", checkoutPage.getOrderConfirmationSuccesMsg());


        //billing information
        //checkoutPage.clickAddressCheckout();
        //checkoutPage.setCheckoutaddress("Aleea Garbau nr 11 ap 78");
        //checkoutPage.clickCityCheckoutfield();
        //checkoutPage.setCheckoutcity("Cluj-Napoca");

        //checkoutPage.selectCheckoutCountry();
        //checkoutPage.typeinChechoutCountry("romania");
        //checkoutPage.clickSelectedCountry();


        //checkoutPage.selectCheckoutstate();
        //checkoutPage.typeinCheckoutState("Cluj");
        //checkoutPage.clickSelectedState();

        //checkoutPage.setCheckoutZipcode("400534");
       // checkoutPage.setCheckoutTelephoneNo("0759552434");
        //checkoutPage.clickCheckoutataDifferentAdsress();


        //shipping information
       // checkoutPage.clickShippingAddressCheckout();
       // checkoutPage.setShippingcheckoutaddress("Aleea Garbau nr 11 ap 78");
       // checkoutPage.clickShippingCityCheckoutfield();
       // checkoutPage.setShippingCheckoutcity("Cluj-Napoca");

        //checkoutPage.selectShippingCheckoutCountry();
       // checkoutPage.typeinShippingChechoutCountry("romania");
        //checkoutPage.clickShippingSelectedCountry();

        //checkoutPage.selectShippingCheckoutstate();
        //checkoutPage.typeinShippingCheckoutState("Cluj");
        //checkoutPage.clickShippingSelectedState();

        //checkoutPage.setShippingCheckoutZipcode("400534");
        //checkoutPage.setShippingCheckoutTelephoneNo("0759552434");
        //checkoutPage.clickonShippingMethodCheckout();




    }
}

