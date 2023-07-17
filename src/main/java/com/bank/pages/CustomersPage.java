package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customListeners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CustomersPage extends Utility
{

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement customer;

    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement search;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Login')]")
     WebElement button;

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[3]/button[2]")
    WebElement deposit;

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]")
    WebElement amount;

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]")
    WebElement depositButton;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Deposit Successful')]")
     WebElement message;

    //By customer = By.xpath("//button[contains(text(),'Customer Login')]");
   // By search = By.xpath("//select[@id='userSelect']");
   // By button = By.xpath("//button[contains(text(),'Login')]");
   // By deposit = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[3]/button[2]");
    //By amount = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]");
  //  By depositButton = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]");
    //By message = By.xpath("//span[contains(text(),'Deposit Successful')]");

    public void setCustomer()
    {
        clickOnElement(customer);
        CustomListeners.test.log(Status.PASS,"click on  button");
    }
    public void setSearch(String name)
    {
        sendTextToElement(search,name);
        CustomListeners.test.log(Status.PASS,"search"+name);
    }
    public void setButton()
    {
        clickOnElement(button);
        CustomListeners.test.log(Status.PASS,"click on  button");
    }
    public void setDeposit()
    {
        clickOnElement(deposit);
        CustomListeners.test.log(Status.PASS,"click on  button");
    }
    public void setAmount(String amount1)
    {
        sendTextToElement(amount,amount1);
        CustomListeners.test.log(Status.PASS,"amount"+amount1);
    }
    public void setDepositButton()
    {
        clickOnElement(depositButton);
        CustomListeners.test.log(Status.PASS,"click on  button");
    }
    public void setMessage()
    {
        getTextFromElement(message);
    }

}
