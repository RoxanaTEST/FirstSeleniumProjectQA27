package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "qty")
    private WebElement qtyField;

    @FindBy(css = "[title='Qty'] ")
    private WebElement qtycheckoutfield;

    @FindBy(css ="[title='Update']")
    private WebElement updateqtycheckoutfield;

    @FindBy(css = ".btn-cart[onclick]")
    private WebElement addToCartButton;

    public void setQtyField(int quantity) {
        qtyField.clear();
        qtyField.sendKeys(quantity + "");
    }

    public void setQtyandupdateFieldcheckout(int quantity) {
        qtycheckoutfield.click();
        qtycheckoutfield.clear();
        qtycheckoutfield.sendKeys(quantity + "");
        updateqtycheckoutfield.click();
    }

    public void clickAddToCartButton() {
        addToCartButton.click();
    }


}