package PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ContextMenuPage {
	private WebDriver driver;
	
	@FindBy(how = How.CSS, using = "#hot-spot")
	private WebElement boxClick;
	
	public ContextMenuPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clicarBoxClick () {
		new Actions(driver)
		.contextClick(boxClick).perform();
	}
}
