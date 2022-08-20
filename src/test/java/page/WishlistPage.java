package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage {

    private WebDriver driver;

    public WishlistPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#nav > ol > li.level0.nav-5.parent")
    private WebElement salecategoryLink;

    @FindBy(css = ".actions .button")
    private WebElement viewproductdetailsButton;

    @FindBy(css = ".link-wishlist")
    private WebElement addtowishlistlink;

    @FindBy(css ="#item_1124 .product-name a")
    private WebElement productaddedinmyWishlist;


    public void clicksaleCategory(){
        salecategoryLink.click();
    }
    public void clickViewProductdetails(){
        viewproductdetailsButton.click();
    }

    public void clickAddtoWishlist(){
        addtowishlistlink.click();
    }
    public boolean isproductDisplayedinWishlist(){
        productaddedinmyWishlist.isDisplayed();
        return true;
    }
}
