package irctc_Testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import irctcdash.IrctcSearch;
import irctcdash.IrtcBusSearch;

public class Testcases {

	@Test
	public void search() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sreehari A H\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		IrctcSearch s = new IrctcSearch(driver);
		s.From().sendKeys("Qln");
		Thread.sleep(1000);
		s.From().sendKeys(Keys.ENTER);
		s.To().sendKeys("Awy");
		Thread.sleep(1000);
		s.To().sendKeys(Keys.ENTER);
		s.Berth().click();
		s.Date().click();
		s.Seldate().click();
		s.Search().click();
		Thread.sleep(1000);
		s.Refresh().click();
		Thread.sleep(1000);
		s.Select().click();
		s.Book().click();
		Thread.sleep(3000);
		s.Close().click();
		s.Bus().click();
		driver.get("https://www.bus.irctc.co.in/home");
		IrtcBusSearch b = new IrtcBusSearch(driver);
		Thread.sleep(3000);
		b.Lounge().click();
		Thread.sleep(1000);

	}
}
