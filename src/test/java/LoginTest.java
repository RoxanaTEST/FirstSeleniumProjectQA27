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

public class LoginTest {
    private WebDriver driver;

    @Before
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test");
    }


    @Test
    public void validLoginTest() {

        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.id("email")).sendKeys("roxanatestare@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Testareplatforma!");
        driver.findElement(By.id("send2")).click();

        WebElement welcomeText = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col2-left-layout > div > div.col-main > div.my-account > div > div.welcome-msg > p.hello > strong"));
        Assert.assertEquals("Hello, Roxana Mihaela Pop!", welcomeText.getText());
        WebElement myAccount = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col2-left-layout > div > div.col-left.sidebar.col-left-first > div > div.block-title > strong > span"));
        Assert.assertTrue(((WebElement) myAccount).isDisplayed());

    }

    @Test
    public void invalidLoginTest() {
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.id("email")).sendKeys("hdjhjj@h3d.com");
        driver.findElement(By.id("pass")).sendKeys("hdhhshjd");
        driver.findElement(By.id("send2")).click();

        WebElement invalidcredentialserror = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > div.account-login > ul > li > ul > li > span"));
        Assert.assertTrue(((WebElement) invalidcredentialserror).isDisplayed());

        WebElement errortext = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > div.account-login > ul > li > ul > li"));
        Assert.assertEquals("Invalid login or password.", errortext.getText());
        wait(5);
    }

    @Test
    public void emptyfieldsLoginTest() {

        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.id("email")).sendKeys(" ");
        driver.findElement(By.id("pass")).sendKeys(" ");
        driver.findElement(By.id("send2")).click();
        wait(10);

        WebElement errorlogintext = driver.findElement(By.cssSelector("#advice-required-entry-email"));
        Assert.assertEquals("This is a required field.", errorlogintext.getText());


    }
        @Test
        public void changeLanguageTest () {
            //select language
            Select selectLanguageDropdown = new Select(driver.findElement(By.id("select-language")));
            selectLanguageDropdown.selectByVisibleText("German");

            WebElement germanLanguage = driver.findElement(By.cssSelector("#select-language > option:nth-child(3)"));
            Assert.assertTrue(((WebElement) germanLanguage).isDisplayed());
        }

        @Test
        public void hoverOverCategoryTest () {
            Actions action = new Actions(driver);
            WebElement womenCategory = driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-1.first.parent > a"));
            action.moveToElement(womenCategory).perform();

            WebElement viewAll = driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-1.first.parent > ul > li.level1.view-all > a"));
            Assert.assertTrue(((WebElement) viewAll).isDisplayed());
            wait(5);


            //        Strig random = RandomStringUtils.randomAlphanumeric(12);
            //        String myEmail = random+"@testmail.com";
        }

        @After
        public void closeDriver () {
            driver.quit();
        }

        public static void wait ( int seconds){
            try {
                Thread.sleep(seconds * 1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }


