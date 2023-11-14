import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PageObjects.HomePage;

public class Checkboxes {
	WebDriver driver;
	HomePage homePage;
	@Before
	public void iniciarDriver() {
		Driver internoDriver = new Driver();
		driver = internoDriver.webDriver();
		homePage = new HomePage(driver);
		homePage.checkBoxes();
	}
	
	@Test
	public void boxAtivadas () {
		boolean verificarBox = true;
		 
		driver.findElement(By.cssSelector("#checkboxes > input:nth-child(1)")).click();
		WebElement checkbox1 = driver.findElement(By.cssSelector("#checkboxes > input:nth-child(1)"));
		WebElement checkbox2 = driver.findElement(By.cssSelector("#checkboxes > input:nth-child(3)"));
		
		if (checkbox1.isSelected() == false || checkbox2.isSelected() == false) {
			verificarBox = false;
		}
		
//		System.out.println("Box 1: " + checkbox1.isSelected() + "\n" + "Box 2: " + checkbox2.isSelected());
		
		Assert.assertTrue(verificarBox);
	}
	
//	@Test
	public void boxDesativadas () {
		boolean verificarBox = true;
		driver.findElement(By.cssSelector("#checkboxes > input:nth-child(3)")).click();
		
		WebElement checkbox1 = driver.findElement(By.cssSelector("#checkboxes > input:nth-child(1)"));
		WebElement checkbox2 = driver.findElement(By.cssSelector("#checkboxes > input:nth-child(3)"));
	
		if (checkbox1.isSelected() == true || checkbox2.isSelected() == true) {
			verificarBox = false;
		}
	
		Assert.assertTrue(verificarBox);
	}
	
}
