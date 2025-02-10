package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

public class SelectProducts {
    WebDriver driver;
    public SelectProducts(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[.='Home']")
    private WebElement home;
    @FindBy(css = "[alt='Combination Pliers']")
    private WebElement product;
    @FindBy(xpath = "//button[@id='btn-add-to-cart']")
    private WebElement addToCart;
    @FindBy(xpath = "//a[.='1']")
    private WebElement cart;
    @FindBy(xpath = "//button[.='Proceed to checkout']")
    private WebElement checkout;
    @FindBy(css="[data-test='proceed-2']")
    private WebElement proccedCheckOut;
    @FindBy(css="[data-test='proceed-3']")
    private WebElement proccedCheckOut1;
    @FindBy(id="payment-method")
    private WebElement payment;

    @FindBy(xpath="//button[contains(.,'Confirm')]")
    private WebElement confirm;

  //  WebElement dropdownElement = driver.findElement(payment("payment-method"));

//    private By payment(String dropdownId) {
//        Select dropdown = new Select(dropdownElement);
//        dropdown.selectByIndex(1);
//        return null;
//    }
    public WebElement getHome()
    {
        return home;
    }
    public WebElement getProduct()
    {
        return product;
    }
    public WebElement getAddToCart()
    {
        return addToCart;
    }
    public WebElement getCart()
    {
        return cart;
    }
    public WebElement getCheckout()
    {
        return checkout;
    }
    public WebElement getProccedCheckOut()
    {
        return proccedCheckOut;
    }
    public WebElement getProccedCheckOut1()
    {
        return proccedCheckOut1;
    }
    public WebElement getPayment()
    {
        return payment;
    }//getConfirm
    public WebElement getConfirm()
    {
        return confirm;
    }

    public void ClickHome()
    {
        if (getHome().isDisplayed())
        {
            System.out.println("Home button Clicked");
            getHome().click();
            assertTrue(true);
        }
        else
        {
            System.out.println("Home not found");
            fail();
        }
    }
    public void SelectProduct()
    {
        if (getProduct().isDisplayed())
        {
            System.out.println("Product Selected");
            getProduct().click();
            assertTrue(true);
        }
        else
        {
            System.out.println("Product not found");
            fail();
        }
    }
    public void AddToCart()
    {
        if (getAddToCart().isDisplayed())
        {
            System.out.println("Add To Cart Selected");
            getAddToCart().click();
            assertTrue(true);
        }
        else
        {
            System.out.println("Add to cart not found");
            fail();
        }
    }
    public void Cart()
    {
        if (getCart().isDisplayed())
        {
            System.out.println("Cart Selected");
            getCart().click();
            assertTrue(true);
        }
        else
        {
            System.out.println("Cart not found");
            fail();
        }
    }
    public void ClickCheckOut()
    {
        if (getCheckout().isDisplayed())
        {
            System.out.println("Checkout Selected");
            getCheckout().click();
            assertTrue(true);
        }
        else
        {
            System.out.println("Checkout not found");
            fail();
        }
    }
    public void ClickProccedCheckOut()
    {
        if (getProccedCheckOut().isDisplayed())
        {
            System.out.println("Procced Checkout Selected");
            getProccedCheckOut().click();
            assertTrue(true);
        }
        else
        {
            System.out.println("Checkout not found");
            fail();
        }
    }
    public void ClickProccedCheckOut1()
    {
        if (getProccedCheckOut1().isDisplayed())
        {
            System.out.println("Procced Checkout Selected");
            getProccedCheckOut1().click();
            assertTrue(true);
        }
        else
        {
            System.out.println("Checkout not found");
            fail();
        }
    }
    public void ClickPayment(String paymentList)
    {
        if (getPayment().isDisplayed())
        {
            System.out.println("Payment Selected");
            getPayment().sendKeys(paymentList);
            assertTrue(true);
        }
        else
        {
            System.out.println("Payment not found");
            fail();
        }
    }
    public void ClickConfirm()
    {
        if (getConfirm().isDisplayed())
        {
            System.out.println("Payment Selected");
            getConfirm().click();
            assertTrue(true);
        }
        else
        {
            System.out.println("Payment not found");
            fail();
        }
    }
}
