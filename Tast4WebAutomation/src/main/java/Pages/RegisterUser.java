package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

public class RegisterUser {
    WebDriver driver;

    public RegisterUser(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this); //helps with inspection

    }//
    @FindBy(xpath="//a[.='Sign in']")
    private WebElement signinbtn;

    @FindBy(xpath="//a[.='Register your account']")
    private WebElement registerAccountLink;

    @FindBy(id="first_name")
    private WebElement firstName;

    @FindBy(id="last_name")
    private WebElement lastName;


    @FindBy(xpath = "//div[.='Date of Birth *']")
    private WebElement dateOfBirth;
    @FindBy(id = "address")
    public WebElement address;
    @FindBy(id = "postcode")
    public WebElement postCode;

    @FindBy(id = "city")
    public WebElement city;
    @FindBy(id = "state")
    public WebElement state;
    @FindBy(id = "country")
    public WebElement country;
    @FindBy(id = "phone")
    public WebElement phone;
    @FindBy(id = "email")
    public WebElement email;//
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(css = ".btnSubmit")
    public WebElement registerBtn;

    public WebElement getSignInBTN()
    {
        return signinbtn;
    }

    public WebElement getRegisterAccount()
    {
        return registerAccountLink;
    }

    public WebElement getFirstName()
    {
        return firstName;
    }
    public WebElement getLastName()
    {
        return lastName;
    }
    public WebElement getDateOfBirth()
    {
        return dateOfBirth;
    }
    public WebElement getAddress()
    {
        return address;
    }
    public WebElement getPostCode()
    {
        return postCode;
    }
    public WebElement getCity()
    {
        return city;
    }
    public WebElement getState()
    {
        return state;
    }
    public WebElement getCountry()
    {return country;}

    public WebElement getPhone()
    {return phone;}
    public WebElement getEmail()
    {return email;}
    public WebElement getPassword()
    {return password;}

    public WebElement getRegisterBtn()
    {return registerBtn;}

    public void ClickSingIn()
    {
        if (getSignInBTN().isDisplayed())
        {
            System.out.println("SignIn Clicked");
            getSignInBTN().click();
            assertTrue(true);
        }
        else
        {
            System.out.println("SignIn not found");
            fail();
        }
    }
    public void RegisterAccount()
    {
        if (getRegisterAccount().isDisplayed())
        {
            System.out.println("Register Link Clicked");
            getRegisterAccount().click();
            assertTrue(true);
        }
        else
        {
            System.out.println("Register Link not found");
            fail();
        }
    }

    public void FirstName(String usernameTXT)
    {
        if (getFirstName().isDisplayed())
        {
            System.out.println("First Name Clicked");
            getFirstName().sendKeys(usernameTXT);
            assertTrue(true);
        }
        else
        {
            System.out.println("Fist NameTXT not found");
            fail();
        }
    }
    public void LastName(String lastNameTXT)
    {
        if (getLastName().isDisplayed())
        {
            System.out.println("First Name Clicked");
            getLastName().sendKeys(lastNameTXT);
            assertTrue(true);
        }
        else
        {
            System.out.println("LastName not found");
            fail();
        }
    }
    public void DateOfBirth(String dateTXT)
    {
        if (getDateOfBirth().isDisplayed())
        {
            System.out.println("DOB");
            getDateOfBirth().isSelected();
            getDateOfBirth().sendKeys(dateTXT);
            assertTrue(true);
        }
        else
        {
            System.out.println("DOB not found");
            fail();
        }
    }

    public void Address(String addressTXT)
    {
        if (getAddress().isDisplayed())
        {
            System.out.println("Address");
            getAddress().sendKeys(addressTXT);
            assertTrue(true);
        }
        else
        {
            System.out.println("Address not found");
            fail();
        }}

        public void PostCode(String postcodeTXT)
        {
            if (getPostCode().isDisplayed())
            {
                System.out.println("Post Code");
                getPostCode().sendKeys(postcodeTXT);
                assertTrue(true);
            }
            else
            {
                System.out.println("Post Code not found");
                fail();
            }
    }
    public void City(String cityTXT)
    {
        if (getCity().isDisplayed())
        {
            System.out.println("City");
            getCity().sendKeys(cityTXT);
            assertTrue(true);
        }
        else
        {
            System.out.println("City not found");
            fail();
        }
    }
    public void State(String stateTXT)
    {
        if (getState().isDisplayed())
        {
            System.out.println("State");
            getState().sendKeys(stateTXT);
            assertTrue(true);
        }
        else
        {
            System.out.println("State not found");
            fail();
        }
    }
    public void Country(String countryTXT)
    {
        if (getPostCode().isDisplayed())
        {
            System.out.println("Country");
            getCountry().sendKeys(countryTXT);
            assertTrue(true);
        }
        else
        {
            System.out.println("Country not found");
            fail();
        }
    }
    public void Phone(String phoneTXT)
    {
        if (getPhone().isDisplayed())
        {
            System.out.println("Phone");
            getPhone().sendKeys(phoneTXT);
            assertTrue(true);
        }
        else
        {
            System.out.println("Phone not found");
            fail();
        }
    }
    public void eMail(String emailTXT)
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

    public void ClickRegisterBtn()
    {
        if (getRegisterBtn().isDisplayed())
        {
            System.out.println("Register Button Clicked!!");
            getRegisterBtn().click();
            assertTrue(true);
        }
        else
        {
            System.out.println("Register Button not found");
            fail();
        }
    }

    public void DateOfBirth1(String month_year) throws InterruptedException {

// For selecting month and year

        List<WebElement> months = driver.findElements(By.xpath("//input[@id='dob']"));

        System.out.println("months count: " + months.size());

        for (int i = 0; i < months.size(); i++) {
            // Select date corresponding to the the month
            if (months.get(i).getText().equals(month_year)) {
                List<WebElement> days = driver.findElements(By.xpath("(//input[@id='dob']" + i
                      ));
                System.out.println("days count: " + days.size());

                for (int j = 0; j < days.size(); j++) {

                    if (days.get(j).getText().equals(days)) {

                        days.get(j).click();

                        break;

                    }

                }

            }


        }

}


}
