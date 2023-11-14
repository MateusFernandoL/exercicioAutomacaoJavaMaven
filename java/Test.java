import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {

	@org.junit.Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\maate\\OneDrive\\Documentos\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://beta.stage2.drogasil.com.br/customer/account/login");
	
		driver.findElement(By.id("emailCpf")).sendKeys("teyet74883@czilou.com");
		driver.findElement(By.id("password")).sendKeys("123123");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("onetrust-accept-btn-handler")));
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		
		driver.findElement(By.cssSelector(".Buttonstyles__ButtonStyles-c9z5st-0.bKXkXB.Button")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".MyAccountMenuLinkstyles__MyAccountMenuLinkStyles-sc-1kmdp1i-0.kpYJlh.true>span")));
		
		driver.get("https://beta.stage2.drogasil.com.br/advil-extra-alivio-400mg-frasco-com-20-capsulas-gelatinosas.html");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#__next > main > div:nth-child(2) > div > div > div.ScrollPricingstyles__ScrollPricingStyles-sc-1or77yb-1.fmZzmQ > div > div > div > button")));		
		
		driver.findElement(By.cssSelector("#__next > main > div:nth-child(2) > div > div > div.ScrollPricingstyles__ScrollPricingStyles-sc-1or77yb-1.fmZzmQ > div > div > div > button")).click();
		
//		Esperar até que desepareça tal elemento
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".ConfirmationPopupstyles__ConfirmationPopupStyles-hcx1ko-0.imbNZW>p")));

		driver.findElement(By.cssSelector("#__next > header > div.HeaderMobilestyles__NavbarStyles-sc-1i8chu0-1.header-navbar > div.header-container > div > button")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.RichrelevanceCarouselstyles__RichCarouselStyles-ocrkp1-0:nth-child(1) > h2:nth-child(1)")));
//		Prosseguir carrinho
		driver.findElement(By.cssSelector(".AmountCartstyles__Container-sc-1m2isri-1 > div:nth-child(2) > button:nth-child(1)")).click();
		
//		Escolhendo forma de entrega
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("delivery-1583")));
		driver.findElement(By.id("delivery-1583")).click();
	
		driver.findElement(By.cssSelector(".bYfuEJ")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.PaymentMethodsstyles__MethodsOption-sc-10ftoe4-1:nth-child(2)")));
		
//		Selecionar forma de pagamento
		driver.findElement(By.cssSelector("div.PaymentMethodsstyles__MethodsOption-sc-10ftoe4-1:nth-child(2)")).click();
		
//		Finalizando compra
		driver.findElement(By.cssSelector(".bYfuEJ")).click();
		
		driver.close();
	}
}
