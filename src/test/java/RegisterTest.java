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

        driver.findElement(By.cssSelector(".skip-account .label")).click();
        driver.findElement(By.cssSelector("[title='Register']")).click();
        driver.findElement(By.id("firstname")).sendKeys("Roxana");
        driver.findElement(By.id("middlename")).sendKeys("Mihaela");
        driver.findElement(By.id("lastname")).sendKeys("Pop");
        driver.findElement(By.id("email_address")).sendKeys("roxanatestare@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Testareplatforma!");
        driver.findElement(By.id("confirmation")).sendKeys("Testareplatforma!");
        driver.findElement(By.cssSelector("#is_subscribed")).click();
        driver.findElement(By.cssSelector(".buttons-set .button")).click();

        WebElement alreadyRegistered = driver.findElement(By.cssSelector(".error-msg span"));
        Assert.assertEquals("There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.", alreadyRegistered.getText());

    }
       @Test
        public void validRegistertest() {
            driver.findElement(By.cssSelector(".skip-account .label")).click();
            driver.findElement(By.cssSelector("[title='Register']")).click();
            driver.findElement(By.id("firstname")).sendKeys("Mara");
            driver.findElement(By.id("middlename")).sendKeys("Maria");
            driver.findElement(By.id("lastname")).sendKeys("Popa");
            driver.findElement(By.id("email_address")).sendKeys("popa.mariam@gmail.com");
            driver.findElement(By.id("password")).sendKeys("Testparola12!");
            driver.findElement(By.id("confirmation")).sendKeys("Testparola12!");
            driver.findElement(By.cssSelector("#is_subscribed")).click();
            driver.findElement(By.cssSelector(".buttons-set .button")).click();



             WebElement welcometext = driver.findElement(By.cssSelector(".success-msg span"));
             Assert.assertEquals("Thank you for registering with Madison Island.",welcometext.getText());
             wait(4);


        }
        @Test
        public void invalidcredentialsRegistertest() {
            driver.findElement(By.cssSelector(".skip-account .label")).click();
            driver.findElement(By.cssSelector("[title='Register']")).click();
            driver.findElement(By.id("firstname")).sendKeys("fggffhf");
            driver.findElement(By.id("middlename")).sendKeys("123673r34");
            driver.findElement(By.id("lastname")).sendKeys("---");
            driver.findElement(By.id("email_address")).sendKeys("jdjkfkf@djjh.com");
            driver.findElement(By.id("password")).sendKeys("123456!");
            driver.findElement(By.id("confirmation")).sendKeys("123456!");
            driver.findElement(By.cssSelector("#is_subscribed")).click();
            driver.findElement(By.cssSelector(".buttons-set .button")).click();


            WebElement myDashboard = driver.findElement(By.cssSelector(".dashboard h1"));
            Assert.assertTrue(myDashboard.isDisplayed());
            wait(4);


        }

        @Test
        public void passwordsNotmatchRegisterTest(){
            driver.findElement(By.cssSelector(".skip-account .label")).click();
            driver.findElement(By.cssSelector("[title='Register']")).click();
            driver.findElement(By.id("firstname")).sendKeys("Ramona");
            driver.findElement(By.id("middlename")).sendKeys("Ella");
            driver.findElement(By.id("lastname")).sendKeys("Pasca");
            driver.findElement(By.id("email_address")).sendKeys("pascaramo3@gmail.com");
            driver.findElement(By.id("password")).sendKeys("12345!");
            driver.findElement(By.id("confirmation")).sendKeys("123456!");
            driver.findElement(By.cssSelector("#is_subscribed")).click();
            driver.findElement(By.cssSelector(".buttons-set .button")).click();
            wait(3);

            WebElement mypassworderror = driver.findElement(By.cssSelector(".validation-advice"));
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
