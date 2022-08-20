package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    private WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[title='First Name']")
    private WebElement firstNamecheckout;

    @FindBy(css = "[title='Middle Name/Initial']")
    private WebElement middleNamecheckout;

    @FindBy(css = "[title='Last Name']")
    private WebElement lastNamecheckout;

    @FindBy(css = "#billing\\:street1")
    private WebElement addresscheckout;


    @FindBy(css = "[title='City']")
    private WebElement citycheckout;

    @FindBy(css = "#billing\\:country_id")
    private WebElement countrycheckout;

    @FindBy(css = "#billing\\:region_id")
    private WebElement statecheckout;

    @FindBy(css = "[title='Zip/Postal Code']")
    private WebElement zipcodeCheckout;

    @FindBy(css = "[title='Telephone']")
    private WebElement telephoneNocheckout;

    @FindBy(css = "[title='Continue']")
    private WebElement continueCheckoutbutton1;

    @FindBy(id = "s_method_freeshipping_freeshipping")
    private WebElement freeshippingCheckoutradiobutton;

    @FindBy(css = "#shipping-method-buttons-container > button")
    private WebElement checkoutbutton2;

    @FindBy(css = "#payment-buttons-container .button")
    private WebElement paymentcheckoutbutton;




    public void setCheckoutfirstname(String firstname) {
        firstNamecheckout.sendKeys(firstname);
    }


    public void setCheckoutmiddlename(String middlename) {
        middleNamecheckout.sendKeys(middlename);
    }


    public void setCheckoutlastname(String lastname) {
        lastNamecheckout.sendKeys(lastname);
    }

    public void clickAddressCheckout() {
        addresscheckout.click();
    }

    public void setCheckoutaddress(String address) {
        addresscheckout.clear();
        addresscheckout.sendKeys(address);
    }

    public void clickCityCheckoutfield() {
        citycheckout.click();
    }

    public void setCheckoutcity(String city){
        citycheckout.clear();
        citycheckout.sendKeys(city);
    }



    public void selectCheckoutCountry() {
        countrycheckout.click();
    }

    public void typeinChechoutCountry(String country) {
        countrycheckout.sendKeys(country);
    }

    public void clickSelectedCountry() {
        countrycheckout.click();
    }

    public void selectCheckoutstate() {
        statecheckout.click();
    }

    public void typeinCheckoutState(String state) {
        statecheckout.sendKeys(state);
    }

    public void clickSelectedState() {
        statecheckout.click();
    }

    public void setCheckoutZipcode(String zipcode) {
        zipcodeCheckout.clear();
        zipcodeCheckout.sendKeys(zipcode);

    }

    public void setCheckoutTelephoneNo(String number) {
        telephoneNocheckout.clear();
        telephoneNocheckout.sendKeys(number);
    }



    public void countinueCheckoutbutton1() {
        continueCheckoutbutton1.click();
    }


        public void selectFreeShippingRadiobutton() {
        freeshippingCheckoutradiobutton.click();
    }

    public void clickonCheckoutbutton2() {
        checkoutbutton2.click();
    }

    public void clickonPaymentCheckoutButton(){paymentcheckoutbutton.click();}


}

