package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.tests.BaseClass;

public class RegistrationPage2 extends BaseClass {

	WebDriver driver;
	 @FindBy(how=How.NAME, using="First Name")
	 private WebElement Firstname;
	 
	 
	 
	 @FindBy(xpath="")private WebElement asdf;
	  
	 public WebElement getFirstName() {
		 return Firstname;
		}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
		 
}
