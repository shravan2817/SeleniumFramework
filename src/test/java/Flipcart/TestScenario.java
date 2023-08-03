package Flipcart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestScenario extends Basemethod{
	

@Test
public void Perform() {
	new WebDriverWait(driver, Duration.ofSeconds(20))
	.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*")));
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
	WebElement ele1 = driver.findElement(By.xpath("//div[text()='Electronics']"));
	Actions actions = new Actions(driver);
	actions.moveToElement(ele1).build().perform();
	
	WebElement ele2 = driver.findElement(By.xpath("//a[text()='Laptop and Desktop']"));
	Actions actions2 = new Actions(driver);
	actions.moveToElement(ele2).build().perform();
	
     By ele3 = (By.xpath("//a[text()='Gaming Laptops']"));
     driver.findElement(ele3).click();
	//Actions actions3 = new Actions(driver);
	//actions.moveToElement(ele3).build().perform();

}
}
