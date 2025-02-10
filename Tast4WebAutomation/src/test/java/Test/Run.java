package Test;

import Base.BaseTest;


import org.testng.annotations.Test;

public class Run extends BaseTest {
 @Test
    public void run() throws InterruptedException
    {
        ////////USer Registration//////////
        registerUser.ClickSingIn();
//        registerUser.RegisterAccount();
//        registerUser.FirstName("Adora");
//        registerUser.LastName("Mkhabela");
//        registerUser.DateOfBirth1("1993/06/12");
//        //registerUser.DateOfBirth("1993/06/19");
//        registerUser.Address("1236 Mapoti Street");
//        registerUser.PostCode("1968");
//        registerUser.City("Johanesburg");
//        registerUser.State("Midrand");
//        registerUser.Country("South Africa");
//        registerUser.Phone("0820615788");
//        registerUser.eMail("adorahmkhabela@gmail.com");
//        registerUser.EnterPassword("Mbhazima@93");
//        registerUser.ClickRegisterBtn();
/////////////User Login///////
        loginPage.EnterMail(prop.ReadItem("email"));
        loginPage.EnterPassword(prop.ReadItem("password"));
        loginPage.ClickLogin();
       //////////////////////////Shop///////////////////////////////
        selectProducts.ClickHome();
        selectProducts.SelectProduct();
        selectProducts.AddToCart();
        Thread.sleep(10000);
        selectProducts.Cart();
        Thread.sleep(5000);
        selectProducts.ClickCheckOut();

//        loginPage.EnterMail(prop.ReadItem("email"));
//        loginPage.EnterPassword(prop.ReadItem("password"));
//        loginPage.ClickLogin();
        selectProducts.ClickProccedCheckOut();
        selectProducts.ClickProccedCheckOut1();
        selectProducts.ClickPayment("Cash on Delivery");
        selectProducts.ClickConfirm();
    }
}
