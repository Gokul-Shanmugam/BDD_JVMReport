package stepDefinitions;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pom.Register;
import pom.SkipSign;


public class LoginStepDefinition2{
 
	WebDriver driver;
	
	
		
	 @Given("^User launch demo automation in chrome$")
	 public void user_already_on_login_page(){
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Gokul\\Desktop\\Selenium\\Jar\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://demo.automationtesting.in/");
	 }
	
	
	 @When("^verify title of login page$")
	 public void title_of_login_page_is_free_CRM(){
	 String title = driver.getTitle();
	 System.out.println(title);
	 //Assert.assertEquals("Free CRM in the cloud software boosts sales", title);
	 }
	 
	 @Then("^user enter \"(.*)\" and \"(.*)\" in register page$")
	 public void user_enters_username_and_password(String fname, String lname) throws InterruptedException{
		 Register objRegister= new Register(driver);
		 objRegister.user_enters_username_and_password(fname, lname);
	 }
	 
	@Given("^user click on skip sign in demo automation site$")
	public void Click_Skipsignin(){
		SkipSign objSkipsignin= new SkipSign(driver);
		objSkipsignin.Click_Skipsignin();
	}
	
	 //Reg Exp:
	 //1. \"([^\"]*)\"
	 //2. \"(.*)\"
	
	 
//	 @Then("^I enter first name as \"(.*)\"$")
//	 public void firstnmae(String fname){
//		 driver.findElement(arg0).sen(fname)
//	 }
	
	 @Then("^2user click on login button$")
	 public void user_clicks_on_login_button() {
	 WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 
	 
	 js.executeScript("arguments[0].click();", loginBtn);
	 
	//Vertical scroll down by 600  pixels		
//     js.executeScript("window.scrollBy(0,600)");		
//     
//     js.executeScript("document.getElementById('elementID').setAttribute('value', 'Gokul')");
	 }
	
	
	 @Then("^2users is on home page$")
	 public void user_is_on_hopme_page(){
	 String title = driver.getTitle();
	 System.out.println("Home Page title ::"+ title);
	 Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
	 }
	 
	 @Then("^2user moves to new contact page$")
	 public void user_moves_to_new_contact_page() {
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
		
		}
	 
	 
	 @Then("^2user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	 public void user_enters_contacts_details(String firstname, String lastname, String position){
		 driver.findElement(By.id("first_name")).sendKeys(firstname);
		 driver.findElement(By.id("surname")).sendKeys(lastname);
		 driver.findElement(By.id("company_position")).sendKeys(position);
		 driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
		 this.screenshot("EnterDetails");
	 }
	 

	 @Then("^2Close the browsers$")
	 public void close_the_browser(){
		 driver.quit();
	 }
	 
	 
	 public void screenshot(String fileWithPath){
		 TakesScreenshot scrShot =((TakesScreenshot)driver);

	        //Call getScreenshotAs method to create image file

	                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

	            //Move image file to new destination

	                File DestFile=new File(fileWithPath);

	                //Copy file at destination

	              //  FileUtils.copyFile(SrcFile, DestFile);

	 }
	
	
	

}
