package irctc_Testcases;

import org.testng.annotations.Test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

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
		Thread.sleep(1000);
		s.Search().click();
		Thread.sleep(1000);
		s.Refresh().click();
		Thread.sleep(1000);
		s.Select().click();
		s.Book().click();
		Thread.sleep(3000);
		s.Close().click();
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void airrctc() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sreehari A H\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.air.irctc.co.in/");
		//IrctcSearch s = new IrctcSearch(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
		Thread.sleep(1000);
		driver.close();
	}
	
	
	@Test
	public void buses() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sreehari A H\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bus.irctc.co.in/home");
		IrtcBusSearch b = new IrtcBusSearch(driver);
		Actions act = new Actions(driver);
		act.moveToElement(b.Flight()).perform();
		Thread.sleep(1000);
		act.moveToElement(b.Hotel()).perform();
		Thread.sleep(1000);
		act.moveToElement(b.Ret()).perform();
		Thread.sleep(1000);
		act.moveToElement(b.Lounge()).perform();
		Thread.sleep(1000);
		act.moveToElement(b.Tour()).perform();
		Thread.sleep(1000);
		act.moveToElement(b.Bharat()).perform();
		Thread.sleep(1000);
		act.moveToElement(b.Bhuddi()).perform();
		Thread.sleep(1000);
		act.moveToElement(b.Visit()).perform();
		Thread.sleep(1000);
		act.moveToElement(b.Maharaj()).perform();
		Thread.sleep(1000);
		act.moveToElement(b.Goldchar()).perform();
		Thread.sleep(1000);
		act.moveToElement(b.Cruise()).perform();
		Thread.sleep(1000);
		act.moveToElement(b.Heli()).perform();
		Thread.sleep(1000);
		act.moveToElement(b.Tag()).perform();
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void loung() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sreehari A H\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bus.irctc.co.in/home");
		IrtcBusSearch b = new IrtcBusSearch(driver);
		Thread.sleep(3000);
		b.Lounge().click();
		Thread.sleep(4000);
		driver.close();
	}
}
