
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import PageObjects.ContextMenuPage;
import PageObjects.HomePage;

public class ContextMenu{
	WebDriver driver;
	HomePage homePage;
	ContextMenuPage contextMenuPage;
	
	@Before
	public void iniciarDriver() {
		Driver internoDriver = new Driver();
		driver = internoDriver.webDriver();
		
		homePage = new HomePage(driver);
		homePage.contextMenu();
	}
	
	@Test
	public void utilizarContextMenu () {
		System.out.println(driver);
		contextMenuPage = new ContextMenuPage(driver);
		contextMenuPage.clicarBoxClick();
	}
	
}	