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
     //checkout with already saved information
    @FindBy(css = "[title='Ship to this address")
    private WebElement shiptothissavedaddressRadioButton;
    //billing information
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

    @FindBy(css = "[title='Ship to different address']")
    private WebElement shiptodifferentaddressbutton;

//Shipping Information

    @FindBy(css = "[name='shipping[firstname]']")
    private WebElement firstNamecheckout2;

    @FindBy(css = "[name='shipping[middlename]']")
    private WebElement middleNamecheckout2;

    @FindBy(css = "[name='shipping[lastname]']")
    private WebElement lastNamecheckout2;

    @FindBy(css = "[name='shipping[street][]']")
    private WebElement addresscheckout2;


    @FindBy(css = "[name='shipping[city]']")
    private WebElement citycheckout2;

    @FindBy(css = "[name='shipping[country_id]']")
    private WebElement countrycheckout2;

    @FindBy(css = "[name='shipping[region_id]']")
    private WebElement statecheckout2;

    @FindBy(css = "[name='shipping[postcode]']")
    private WebElement zipcodeCheckout2;

    @FindBy(css = "[name='shipping[telephone]']")
    private WebElement telephoneNocheckout2;

    @FindBy(css = " #shipping-buttons-container > button > span > span")
    private WebElement continuetoshippingmethodbutton;


    @FindBy(css = "[title='Continue']")
    private WebElement continueCheckoutbutton1;

    @FindBy(id = "s_method_freeshipping_freeshipping")
    private WebElement freeshippingCheckoutradiobutton;

    @FindBy(css = "[onclick='shippingMethod.save()")
    private WebElement checkoutbutton2;

    @FindBy(css = "[onclick='payment.save()")
    private WebElement paymentcheckoutbutton;

    @FindBy(css = "[onclick='review.save();']")
    private WebElement placeorderbutton;

    @FindBy(css = ".page-title h1 " )
    private WebElement orderconfirmationsuccessmsg;




    public void setCheckoutfirstname(String firstname) {
        firstNamecheckout.sendKeys(firstname);
    }


    public void setCheckoutmiddlename(String middlename) {
        middleNamecheckout.sendKeys(middlename);
    }


    public void setCheckoutlastname(String lastname) {
        lastNamecheckout.sendKeys(lastname);
    }

    public void clickShiptothisAddress(){
        shiptothissavedaddressRadioButton.click();
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

    public void setCheckoutcity(String city) {
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

    public void clickCheckoutataDifferentAdsress() {
        shiptodifferentaddressbutton.click();

    }

    public void clickOnCheckoutbutton1() {
        continueCheckoutbutton1.click();
    }

    public void clickShippingAddressCheckout() {
        addresscheckout2.click();
    }

    public void setShippingcheckoutaddress(String address) {
        addresscheckout2.clear();
        addresscheckout2.sendKeys(address);
    }

    public void clickShippingCityCheckoutfield() {
        citycheckout2.click();
    }

    public void setShippingCheckoutcity(String city) {
        citycheckout2.clear();
        citycheckout2.sendKeys(city);
    }


    public void selectShippingCheckoutCountry() {
        countrycheckout2.click();
    }

    public void typeinShippingChechoutCountry(String country) {
        countrycheckout2.sendKeys(country);
    }

    public void clickShippingSelectedCountry() {
        countrycheckout2.click();
    }

    public void selectShippingCheckoutstate() {
        statecheckout2.click();
    }

    public void typeinShippingCheckoutState(String state) {
        statecheckout2.sendKeys(state);
    }

    public void clickShippingSelectedState() {
        statecheckout2.click();
    }

    public void setShippingCheckoutZipcode(String zipcode) {
        zipcodeCheckout2.clear();
        zipcodeCheckout2.sendKeys(zipcode);

    }

    public void setShippingCheckoutTelephoneNo(String number) {
        telephoneNocheckout2.clear();
        telephoneNocheckout2.sendKeys(number);
    }

    public void clickonShippingMethodCheckout() {
        continuetoshippingmethodbutton.click();
    }


    public void selectFreeShippingRadiobutton() {
        freeshippingCheckoutradiobutton.click();
    }

    public void selectcontinuetopaymentbutton2(){checkoutbutton2.click();}

    public void clickonPaymentCheckoutButton() {
        paymentcheckoutbutton.click();
    }

    public void selectPlaceOrderCheckoutButton(){
        placeorderbutton.click();
    }

    public String getOrderConfirmationSuccesMsg(){
        return orderconfirmationsuccessmsg.getText();
    }
}

