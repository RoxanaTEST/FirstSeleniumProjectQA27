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

public class RegisterTest {

    private WebDriver driver;

    @Before
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test");
    }

    @Test
    public void registeredAlreadyemailtest() {

        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.id("firstname")).sendKeys("Roxana");
        driver.findElement(By.id("middlename")).sendKeys("Mihaela");
        driver.findElement(By.id("lastname")).sendKeys("Pop");
        driver.findElement(By.id("email_address")).sendKeys("roxanatestare@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Testareplatforma!");
        driver.findElement(By.id("confirmation")).sendKeys("Testareplatforma!");
        driver.findElement(By.cssSelector("#form-validate > div.fieldset > ul > li.control > label")).click();
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button")).click();

        WebElement alreadyRegistered = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > div.account-create > ul > li > ul > li > span"));
        Assert.assertEquals("There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.", alreadyRegistered.getText());

    }
       @Test
        public void validRegistertest() {
            driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
            driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
            driver.findElement(By.id("firstname")).sendKeys("Mara");
            driver.findElement(By.id("middlename")).sendKeys("Maria");
            driver.findElement(By.id("lastname")).sendKeys("Popa");
            driver.findElement(By.id("email_address")).sendKeys("popa.mariamar@gmail.com");
            driver.findElement(By.id("password")).sendKeys("Testparola12!");
            driver.findElement(By.id("confirmation")).sendKeys("Testparola12!");
            driver.findElement(By.cssSelector("#form-validate > div.fieldset > ul > li.control > label")).click();
            driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button")).click();



             WebElement welcometext = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col2-left-layout > div > div.col-main > div.my-account > div > ul > li > ul > li"));
             Assert.assertEquals("Thank you for registering with Madison Island.",welcometext.getText());
             wait(4);


        }
        @Test
        public void invalidcredentialsRegistertest() {
            driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
            driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
            driver.findElement(By.id("firstname")).sendKeys("fggffhf");
            driver.findElement(By.id("middlename")).sendKeys("123673r34");
            driver.findElement(By.id("lastname")).sendKeys("---");
            driver.findElement(By.id("email_address")).sendKeys("jdjkfkf@hdjjjh.com");
            driver.findElement(By.id("password")).sendKeys("123456!");
            driver.findElement(By.id("confirmation")).sendKeys("123456!");
            driver.findElement(By.cssSelector("#form-validate > div.fieldset > ul > li.control > label")).click();
            driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button")).click();


            WebElement myDashboard = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col2-left-layout > div > div.col-main > div.my-account > div > div.page-title"));
            Assert.assertTrue(!myDashboard.isDisplayed());
            wait(4);


        }

        @Test
        public void passwordsNotmatchRegisterTest(){
            driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
            driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
            driver.findElement(By.id("firstname")).sendKeys("Ramona");
            driver.findElement(By.id("middlename")).sendKeys("Ella");
            driver.findElement(By.id("lastname")).sendKeys("Pasca");
            driver.findElement(By.id("email_address")).sendKeys("pascaramo@gmail.com");
            driver.findElement(By.id("password")).sendKeys("12345!");
            driver.findElement(By.id("confirmation")).sendKeys("123456!");
            driver.findElement(By.cssSelector("#form-validate > div.fieldset > ul > li.control > label")).click();
            driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button")).click();
            wait(3);

            WebElement mypassworderror = driver.findElement(By.cssSelector("#advice-validate-cpassword-confirmation"));
            Assert.assertTrue(((WebElement) mypassworderror).isDisplayed());



        }



   @After
   public void closeDriver() {
        driver.quit();
   }



    public static void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
