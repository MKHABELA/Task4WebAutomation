package Base;

import Pages.Login;
import Pages.RegisterUser;
import Pages.SelectProducts;
import Utilities.PropertyReader;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver driver;
    protected Login loginPage;
    protected RegisterUser registerUser;
    protected SelectProducts selectProducts;

    protected PropertyReader prop = new PropertyReader();

    @BeforeTest
    protected void setup()
    {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(prop.ReadItem("url"));
        registerUser = new RegisterUser(driver);
        loginPage = new Login(driver);
        selectProducts = new SelectProducts(driver);

        {
driver.quit();

    }
}}
