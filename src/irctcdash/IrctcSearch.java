package irctcdash;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IrctcSearch {

	WebDriver driver;
	
	public IrctcSearch(WebDriver driver) {
		this.driver = driver;
	}
	By from = By.xpath("//input[@id='departFrom']");
	By to = By.xpath("//input[@id='goingTo']");
	//By berth = By.xpath("//label[@for='availableBerth']");
	By search = By.xpath("//button[@type='submit']");
	//By date = By.xpath("//*[@id=\"jDate\"]/span/input");
	By seldate = By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[1]/a");
	//By refresh = By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[3]/div[1]/app-train-list[1]/div[4]/div[1]/div[5]/div[1]/div[1]/app-train-avl-enq[1]/div[1]/div[5]/div[1]/table[1]/tr[1]/td[1]/div[1]/div[2]");
	By bus = By.xpath("//a[@aria-label='Menu BUSES. Website will be opened in new tab']");
	public WebElement From() {
		return driver.findElement(from);
	}
	
	public WebElement To() {
		return driver.findElement(to);
	}
	
//	public WebElement Berth() {
//		return driver.findElement(berth);
//	}
	
	public WebElement Search() {
		return driver.findElement(search);
	}
	
//	public WebElement Date() {
//		return driver.findElement(date);
//	}
	
	public WebElement Seldate() {
		return driver.findElement(seldate);
	}
	
//	public WebElement Refresh() {
//		return driver.findElement(refresh);
//	}

	public WebElement Bus() {
		// TODO Auto-generated method stub
		return driver.findElement(bus);
	}
}
