package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customListeners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BankManagerLoginPage extends Utility
{
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement bank;

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[1]/button[2]")
    WebElement openAccount;

    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/select[1]")
    WebElement customer;

    @CacheLookup
    @FindBy(xpath = "//select[@id='currency']")
    WebElement pound;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement process;

    @CacheLookup
    @FindBy()
    WebElement popUp;


   // By bank = By.xpath("//button[contains(text(),'Bank Manager Login')]");
   // By openAccount = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/button[2]");
   // By customer = By.xpath("//select[@id='userSelect']");
   // By pound = By.xpath("//select[@id='currency']");
  //  By process = By.xpath("//button[contains(text(),'Process')]");
   // By popUp;

    public void setBank()
    {
        clickOnElement(bank);
        CustomListeners.test.log(Status.PASS,"click on  button");
    }
    public void setOpenAccount()
    {
        clickOnElement(openAccount);
        CustomListeners.test.log(Status.PASS,"click on  button");
    }
    public void setCustomer(String name)
    {
       sendTextToElement(customer,name);
    }
    public void pound(String pound1)
    {
        selectByValueFromDropDown(pound,pound1);
        CustomListeners.test.log(Status.PASS,"enter pound"+pound1);
    }
    public void setProcess()
    {
        clickOnElement(process);
        CustomListeners.test.log(Status.PASS,"click on  button");

    }
    public void setPopUp()
    {
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
    }

}
