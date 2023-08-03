package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.tests.BaseClass;

public class RegistrationPage  extends BaseClass{
	
	public RegistrationPage(WebDriver driver){
		this.driver=driver;
	}
	
    private By Firstname=(By.xpath("//input[@name='firstName']"));
	By Lastname=By.xpath("//input[@name='lastName']");
	By Phone=By.xpath("//input[@name='phone']");
	By email=By.xpath("//input[@id='userName']");
	By Address=By.xpath("//input[@name='address1']");
	By city=By.xpath("//input[@name='city']");
	By State=By.xpath("//input[@name='state']");
	By Postalcode=By.xpath("//input[@name='postalCode']");
	//By country=By.xpath("");
    By country=(By.name("country"));
	By username=By.xpath("//input[@name='email']");
	By password=By.xpath("//input[@name='password']");
	By confirmPassword=By.xpath("//input[@name='confirmPassword']");
	By Submit=By.xpath("//input[@type='submit']");
	
	
	public WebElement getFirstName() {
		return driver.findElement(Firstname);
	}
	public WebElement getLastName() {
		return driver.findElement(Lastname);
	}
	public WebElement getPhone() {
		return driver.findElement(Phone);
	}
	public WebElement getemail() {
		return driver.findElement(email);
	}
	public WebElement getAddress() {
		return driver.findElement(Address);
	}
	public WebElement getcity() {
		return driver.findElement(city);
	}
	public WebElement getState() {
		return driver.findElement(State);
	}
	public WebElement getPostalCode() {
		return driver.findElement(Postalcode);
	}
	public WebElement getCountry() {
		return driver.findElement(country);
	}
	public WebElement getUsername() {
		return driver.findElement(username);
	}
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	public WebElement getconfirmPassword() {
		return driver.findElement(confirmPassword);
	}
	public WebElement getsubmit() {
		return driver.findElement(Submit);
	}
	
	public void register() {
		getFirstName().sendKeys("shravan");
		getLastName().sendKeys("Sunny");
		getPhone().sendKeys("1234567891");
		getemail().sendKeys("Shravanyadav2817@gmail.com");
		getAddress().sendKeys("chengicherla");
		getcity().sendKeys("hyd");
		getState().sendKeys("tg");
		getCountry().sendKeys("india");
		getUsername().sendKeys("shravanyadav2817@gmail.com");
		getPassword().sendKeys("1234567891");
		getconfirmPassword().sendKeys("1234567891");
		getsubmit().click();
	}
	

}
