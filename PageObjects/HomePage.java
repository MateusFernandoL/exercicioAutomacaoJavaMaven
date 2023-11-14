package PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	private WebDriver driver;
	
	@FindBy(how = How.CSS, using = "#content > ul:nth-child(4) > li:nth-child(2) > a:nth-child(1)")
	private WebElement acessarAdicionarRemover;
	
	@FindBy(how = How.CSS, using = "#content > ul:nth-child(4) > li:nth-child(6) > a:nth-child(1)")
	private WebElement acessarCheckBoxes;
	
	@FindBy(how = How.CSS, using = "#content > ul:nth-child(4) > li:nth-child(7) > a:nth-child(1)")
	private WebElement acessarContextMenu;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void adicionarRemover() {
		acessarAdicionarRemover.click();
	}
	
	public void checkBoxes() {
		acessarCheckBoxes.click();
	}
	
	public void contextMenu() {
		acessarContextMenu.click();
	}
	
}
