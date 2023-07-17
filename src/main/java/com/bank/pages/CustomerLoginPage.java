package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customListeners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CustomerLoginPage extends Utility
{
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement customer;

    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/select[1]")
    WebElement search;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement button;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement logOut;

    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Your Name :')]")
     WebElement yourName;


   // By customer = By.xpath("//button[contains(text(),'Customer Login')]");
   // By search = By.xpath("//select[@id='userSelect']");
   // By button = By.xpath("//button[contains(text(),'Login')]");
   //  By logOut = By.xpath("//button[contains(text(),'Logout')]");
   // By yourName = By.xpath("//label[contains(text(),'Your Name :')]");

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
    public void logout()
    {
        getTextFromElement(logOut);
        CustomListeners.test.log(Status.PASS,"click on  button");
    }
    public void click()
    {
        clickOnElement(logOut);
        CustomListeners.test.log(Status.PASS,"click on  button");
    }
    public void setYourName()
    {
        getTextFromElement(yourName);
    }
}
