package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customListeners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AddCustomerPage extends Utility
{
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement login;

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")
    WebElement addCustomer;

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")
    WebElement firstName;

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]")
    WebElement lastName;

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/input[1]")
    WebElement postCode;

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/button[1]")
    WebElement button;

    @CacheLookup
    @FindBy()
    WebElement popUp;

    //By login = By.xpath("//button[contains(text(),'Bank Manager Login')]");
  //  By addCustomer = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]");
  //  By firstName = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]");
   // By lastName = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]");
   // By postCode = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/input[1]");
  //  By button = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/button[1]");
   // By popUp ;


    public void login()
    {
        clickOnElement(login);
        CustomListeners.test.log(Status.PASS,"click on login button");
    }
    public void setAddCustomer()
    {
        clickOnElement(addCustomer);
        CustomListeners.test.log(Status.PASS,"click on addCustomer");
    }
    public void setFirstName(String name)
    {
        sendTextToElement(firstName,name);
        CustomListeners.test.log(Status.PASS,"firstName"+name);
    }
    public void setLastName(String name1)
    {
        sendTextToElement(lastName,name1);
        CustomListeners.test.log(Status.PASS,"lastName"+name1);

    }
    public void setPostCode(String postCode1)
    {
        sendTextToElement(postCode,postCode1);
        CustomListeners.test.log(Status.PASS,"postCode"+postCode1);
    }
    public void setButton()
    {
        clickOnElement(button);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void setPopUp()
    {
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
    }
}
