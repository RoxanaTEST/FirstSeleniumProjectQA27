package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "pass")
    private WebElement passwordField;

    @FindBy(id = "send2")
    private WebElement loginButton;

    @FindBy(css = ".messages span")
    private WebElement loginErrortext;

    @FindBy(css = ".validation-advice")
    private WebElement mandatoryfieldserrortext;

    public void setEmailField(String email){
        emailField.sendKeys(email);
    }

    public void setPasswordField(String password){
        passwordField.sendKeys(password);
    }

    public void clickLoginButton(){
        loginButton.click();
    }


    public String getInvalidLoginText(){
        return loginErrortext.getText();
    }
    public String getMandatoryfieldserrortext(){
        return mandatoryfieldserrortext.getText();
    }

}