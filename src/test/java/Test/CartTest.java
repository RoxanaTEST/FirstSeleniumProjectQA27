package Test;

import org.junit.Assert;
import org.junit.Test;

public class CartTest extends BaseTest {

    @Test
    public void addToCartTest() {
        String productName = "Silver Desert necklace";
        int productQty = 2;

        homePage.setSearchField("necklace");
        homePage.clickSearchButton();
        Assert.assertTrue(searchResultsPage.isProductInListAndSelect(productName));
        productPage.setQtyField(productQty);
        productPage.clickAddToCartButton();
        Assert.assertEquals(productName.toLowerCase() + " was added to your shopping cart."
                , cartPage.getSuccessMessageSpan().toLowerCase());
        Assert.assertEquals(productQty + "", cartPage.getQtyField());

    }

    @Test
    public void loginAndAddToCartTest() {
        String productName = "Silver Desert necklace";
        int productQty = 2;

        homePage.clickAccountLink();
        homePage.clickLoginLink();
        loginPage.setEmailField(userEmail);
        loginPage.setPasswordField(userPass);
        loginPage.clickLoginButton();
        homePage.setSearchField("necklace");
        homePage.clickSearchButton();

        Assert.assertTrue(searchResultsPage.isProductInListAndSelect(productName));
        productPage.setQtyField(productQty);
        productPage.clickAddToCartButton();
        Assert.assertEquals(productName.toLowerCase() + " was added to your shopping cart."
                , cartPage.getSuccessMessageSpan().toLowerCase());
        Assert.assertEquals(productQty + "", cartPage.getQtyField());

    }
}
