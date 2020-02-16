package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@ng-model='LastName']")
	WebElement txtLastName;
	
	@FindBy(xpath="//input[@ng-model='FirstName']")
	WebElement txtFirstName;
	
	@FindBy(xpath="//input[@ng-model='Adress']")
	WebElement  txtAddress;
	
	public Register(WebDriver driver) {
		this.driver=driver;
	     PageFactory.initElements(driver, this);
	}
	
	 public void user_enters_username_and_password(String fname, String lname) throws InterruptedException{
		 txtFirstName.sendKeys(fname);
		 txtLastName.sendKeys(lname);
		 Thread.sleep(10000L);
	 }

}
