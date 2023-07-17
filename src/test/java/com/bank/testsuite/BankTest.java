package com.bank.testsuite;

import com.bank.customListeners.CustomListeners;
import com.bank.pages.AddCustomerPage;
import com.bank.pages.BankManagerLoginPage;
import com.bank.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class BankTest extends BaseTest
{
    AddCustomerPage addPage;
    BankManagerLoginPage bank;

    @BeforeMethod
    public void inIt()
    {
         addPage = new AddCustomerPage();
         bank = new BankManagerLoginPage();
    }


    @Test(groups = {"sanity"})
    public void bankManagerShouldAddCustomerSuccessfully()
    {
        addPage. login();
        addPage.setAddCustomer();
        addPage.setFirstName("Sita");
        addPage.setLastName("Ram");
        addPage. setPostCode("PT7896L");
        addPage.setButton();
        addPage. setPopUp();
    }

    @Test(groups = {"smoke"})
    public void bankManagerShouldOpenAccountSuccessfully()
    {
        bank. setBank();
        bank.setOpenAccount();
        bank.setCustomer("ram sita");
        bank.pound("pound");
        bank.setProcess();
        bank.setPopUp();
    }
}
