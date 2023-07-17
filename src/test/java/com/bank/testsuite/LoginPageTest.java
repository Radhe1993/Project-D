package com.bank.testsuite;


import com.bank.customListeners.CustomListeners;
import com.bank.pages.CustomerLoginPage;
import com.bank.pages.CustomersPage;
import com.bank.pages.OpenAccountPage;
import com.bank.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Created by Jay Vaghani
 */
@Listeners(CustomListeners.class)
public class LoginPageTest extends BaseTest {

    CustomerLoginPage login;
    CustomersPage page ;
    OpenAccountPage open;
    @BeforeMethod
    public void iNit()
    {
        login = new CustomerLoginPage();
        page = new CustomersPage();
        open = new OpenAccountPage();

    }

    @Test(groups = {"sanity"})
    public void customerShouldLoginAndLogoutSuceessfully()
    {
        login.setCustomer();
        login.setSearch("ram sita");
        login.setButton();
        login.logout();
        login.click();
        login.setYourName();
        String expected1 = "Your Name :";
        String actual1 = getTextFromElement(By.xpath("//label[contains(text(),'Your Name :')]"));
        Assert.assertEquals(actual1,expected1);
    }

    @Test(groups = {"smoke"})
    public void customerShouldDepositMoneySuccessfully()
    {
        page.setCustomer();
        page.setSearch("Hermoine Granger");
        page.setButton();
        page.setDeposit();
        page.setAmount("100");
        page.setDepositButton();
        page.setMessage();
        String expected = "Deposit Successful";
        String actual = getTextFromElement(By.xpath("//span[contains(text(),'Deposit Successful')]"));
        Assert.assertEquals(actual,expected);

    }
    @Test(groups = {"regression","regression1"})
    public void customerShouldWithdrawMoneySuccessfully()
    {
        open.setCustomer();
        open.setSearch("Hermoine Granger");
        open.setButton();
        open.setWithdraw();
        open.amount("50");
        open.setWithdrawButton();
        open.getMessage();
    }


}
