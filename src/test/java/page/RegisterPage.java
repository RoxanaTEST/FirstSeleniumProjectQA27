package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

    private WebDriver driver;

    public RegisterPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    //web elements
    @FindBy(id ="firstname")
    private WebElement registerfirstname;

    @FindBy(id ="middlename")
    private WebElement registermiddlename;

    @FindBy(id ="lastname")
    private WebElement registerlastname;

    @FindBy(id ="email_address")
    private WebElement registeremailaddress;

    @FindBy(id ="password")
    private WebElement registerpassword;

    @FindBy(id ="confirmation")
    private WebElement registerpassconfirmation;

    @FindBy(css = "#is_subscribed")
    private WebElement registersubscription;

    @FindBy(css = ".buttons-set .button")
    private WebElement registerButton;

    @FindBy(css = ".error-msg span")
    private WebElement alreadyregisteredmsg;

    @FindBy(css = ".validation-advice")
    private WebElement passwordsnoNotmatch;



    public void setRegisterfirstname(String firstname){
        registerfirstname.sendKeys(firstname);
    }

    public void setMiddlename(String middlename){
        registermiddlename.sendKeys(middlename);
    }

    public void setLastname(String lastname){
        registerlastname.sendKeys(lastname);
    }

    public void setEmailAddress(String email){
        registeremailaddress.sendKeys(email);
    }

    public void setPassword(String password){
        registerpassword.sendKeys(password);
    }

    public void setPasswordReconfirm(String confirmpassword){
        registerpassconfirmation.sendKeys(confirmpassword);
    }

    public void clickRegistersubscription(){registersubscription.click();}

    public void clickRegisterButton(){
        registerButton.click();
    }


    public String getAlreadyregisterederror(){
        return alreadyregisteredmsg.getText();}



        public boolean getPasswordnotMatchingError(){
            passwordsnoNotmatch.isDisplayed();
            return true;
    }
}

