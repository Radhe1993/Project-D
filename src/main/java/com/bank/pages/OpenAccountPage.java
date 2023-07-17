package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customListeners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class OpenAccountPage extends Utility
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
     @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[3]/button[3]")
     WebElement withdraw;

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]")
    WebElement amount;

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]")
    WebElement withdrawButton;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Transaction successful')]")
    WebElement message;

   // By customer = By.xpath("//button[contains(text(),'Customer Login')]");
   // By search = By.xpath("//select[@id='userSelect']");
   // By button = By.xpath("//button[contains(text(),'Login')]");
   // By withdraw = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[3]/button[3]");
   // By amount = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]");
  //  By withdrawButton = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]");
   // By message = By.xpath("//span[contains(text(),'Transaction successful')]");


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
    public void setWithdraw()
    {
        clickOnElement(withdraw);
        CustomListeners.test.log(Status.PASS,"click on  button");
    }
    public void amount(String amount1)
    {
       remove(amount);
       sendTextToElement(amount,amount1);
        CustomListeners.test.log(Status.PASS,"amount"+amount1);
    }
    public void setWithdrawButton()
    {
        clickOnElement(withdrawButton);
        CustomListeners.test.log(Status.PASS,"click on  button");
    }
    public void getMessage()
    {
        getTextFromElement(message);
    }
}
