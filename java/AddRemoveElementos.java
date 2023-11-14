import java.util.List;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.AddRemoveElementosPage;
import PageObjects.HomePage;

public class AddRemoveElementos {
	WebDriver driver;
	HomePage homePage;	
	AddRemoveElementosPage addRemoveElementoPage;
	
	@Before
	public void iniciarDriver() {
		driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		homePage = new HomePage(this.driver);	
		homePage.adicionarRemover();
	}
	 
	@After
	public void fecharDriver() {
		driver.close();
		driver.quit();
	}
	
//	Fazer teste para adicionar elementos e confirmar se a quantidade de botoes está correta
//	@org.junit.Test
	public void adicionarElementos() {
		addRemoveElementoPage = new AddRemoveElementosPage(this.driver);
		boolean contagemElementos = false;
		int clicks = 0;
		
		for (int i= 2; i > 0; i--) {
			addRemoveElementoPage.clicarAddElento();			
			clicks++;	
		}
		
		List<WebElement> elementosAchados = driver.findElements(By.className("added-manually"));
		
		if(elementosAchados.size() == clicks) {
			contagemElementos = true;
		}
		
		Assert.assertTrue(contagemElementos);
	}
	
//	Excluir elementos e confirmar se todos foram excluidos
	@org.junit.Test
	public void excluirElementos () {
		addRemoveElementoPage = new AddRemoveElementosPage(this.driver);
		int clicks = 0;
		
		for (int i = 4; i>0; i--) {
			addRemoveElementoPage.clicarAddElento();
			clicks++;
		}
		
		while (clicks > 0) {
			addRemoveElementoPage.Delete();
			clicks--;
		}
		
		List<WebElement> elementosAchados = driver.findElements(By.className("added-manually"));
		
		if(elementosAchados.size() != 0) {
			Assert.assertTrue(false);
		} else
			Assert.assertTrue(true);
	}
}
