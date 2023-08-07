package irctc_Testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import irctcdash.IrctcSearch;

public class Testcases {

	@Test
	public void search() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sreehari A H\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bus.irctc.co.in/home");
		IrctcSearch s = new IrctcSearch(driver);
		s.Bus().click();
		Thread.sleep(2000);
//		driver.get("https://www.bus.irctc.co.in/home")https://www.irctc.co.in/nget/train-search;
//		s = new IrctcSearch(driver);
		System.out.println(driver);
		Thread.sleep(3000);
		s.From().click();
		s.From().sendKeys("Kollam");
		s.From().sendKeys(Keys.ARROW_DOWN);
		s.From().sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		//s.From().sendKeys(Keys.ENTER);
		//s.To().click();
		//s.To().sendKeys("Trivandrum");
		//s.To().sendKeys(Keys.ARROW_DOWN);
		//s.To().sendKeys(Keys.ENTER);
		//Thread.sleep(1000);
		//s.To().sendKeys(Keys.ENTER);
		//s.Berth().click();
		//s.Date().click();
		//s.Date().sendKeys("");
		//s.Seldate().click();
		//s.Search().click();
		//s.Refresh().click();
		//s.Refresh().click();
	}
}
