package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;

public class SkipSign {
	
	WebDriver driver;
	
	@FindBy(id="btn2")
	WebElement btnSkipSign;
	
	public SkipSign(WebDriver driver) {
		this.driver=driver;
	     PageFactory.initElements(driver, this);
	}
	
	public void Click_Skipsignin(){
		btnSkipSign.click();
	
	}

}
