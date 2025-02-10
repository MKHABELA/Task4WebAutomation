package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

public class Login {
    WebDriver driver;

    public Login(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this); //helps with inspection

    }
    @FindBy(id="email")
    private WebElement email;

    @FindBy(id="password")
    private WebElement password;

    @FindBy(css = ".btnSubmit")
    private WebElement login;

    public WebElement getEmail()
    {
        return email;
    }
    public WebElement getPassword()
    {
        return password;
    }
    public WebElement getLogin()
    {
        return login;
    }

    public void EnterMail(String emailTXT)
    {
        if (getEmail().isDisplayed())
        {
            System.out.println("Email");
            getEmail().sendKeys(emailTXT);
            assertTrue(true);
        }
        else
        {
            System.out.println("Email not found");
            fail();
        }
    }
    public void EnterPassword(String passwordTXT)
    {
        if (getPassword().isDisplayed())
        {
            System.out.println("Password");
            getPassword().sendKeys(passwordTXT);
            assertTrue(true);
        }
        else
        {
            System.out.println("Password not found");
            fail();
        }
    }

    public void ClickLogin()
    {
        if (getLogin().isDisplayed())
        {
            System.out.println("Login button");
            getLogin().click();
            assertTrue(true);
        }
        else
        {
            System.out.println("Login not found");
            fail();
        }
    }

}
