package Test;


import org.checkerframework.checker.units.qual.C;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.*;

public class BaseTest {
    public String userEmail = "roxanatestare@gmail.com";
    public String userPass = "Testareplatforma!";
    public String userName = "Roxana Mihaela Pop";

    public String firstName = "Roxana";

    public String middleName = "Mihaela";

    public String lastName = "Pop";

    // driver
    public WebDriver driver;
    // page objects
    public HomePage homePage;
    public LoginPage loginPage;

    public WishlistPage wishlistPage;

    public RegisterPage registerPage;
    public AccountPage accountPage;
    public SearchResultsPage searchResultsPage;
    public ProductPage productPage;
    public CartPage cartPage;

    public CheckoutPage checkoutPage;



    @Before

    public void initDriver() {
        // init driver
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        //init page objects
        homePage = new HomePage(driver);
        registerPage = new RegisterPage(driver);
        accountPage = new AccountPage(driver);
        loginPage = new LoginPage(driver);
        accountPage = new AccountPage(driver);
        searchResultsPage = new SearchResultsPage(driver);
        productPage = new ProductPage(driver);
        cartPage = new CartPage(driver);
        wishlistPage = new WishlistPage(driver);
        checkoutPage = new CheckoutPage(driver);


        // navigate to homepage
        driver.get("http://testfasttrackit.info/selenium-test");
    }

    public void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @After
    public void closeDriver() {
        driver.quit();
    }

}

