package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddRemoveElementosPage {
	private WebDriver driver;
	
	@FindBy(how = How.CSS, using = ".example > button:nth-child(1)")
	private WebElement addELemento;
	
	@FindBy(how = How.CSS, using = "button.added-manually:nth-child(1)")
	private WebElement delete;
	
	public AddRemoveElementosPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void clicarAddElento() {
		addELemento.click();
	}
	
	public void Delete () {
		delete.click();
	}
	
}
