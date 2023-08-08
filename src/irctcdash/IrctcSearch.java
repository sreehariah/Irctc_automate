package irctcdash;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IrctcSearch {

	WebDriver driver;
	
	public IrctcSearch(WebDriver driver) {
		this.driver = driver;
	}
	By from = By.xpath("//*[@id=\"origin\"]/span/input");
	By to = By.xpath("//*[@id=\"destination\"]/span/input");
	By berth = By.xpath("//label[@for='availableBerth']");
	By search = By.xpath("//button[@type='submit']");
	By date = By.xpath("//*[@id=\"jDate\"]/span/input");
	By seldate = By.xpath("//*[@id=\"jDate\"]/span/div/div/div[2]/table/tbody/tr[4]/td[1]/a");
	By bus = By.xpath("//a[@aria-label='Menu BUSES. Website will be opened in new tab']");
	By refresh = By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[3]/div[1]/app-train-list[1]/div[4]/div[1]/div[5]/div[1]/div[1]/app-train-avl-enq[1]/div[1]/div[5]/div[1]/table[1]/tr[1]/td[1]/div[1]/div[1]/strong[1]");
	By select = By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[3]/div[1]/app-train-list[1]/div[4]/div[1]/div[5]/div[1]/div[1]/app-train-avl-enq[1]/div[1]/div[7]/div[1]/div[3]/table[1]/tr[1]/td[2]/div[1]/div[1]");
	By book = By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[3]/div[1]/app-train-list[1]/div[4]/div[1]/div[5]/div[1]/div[1]/app-train-avl-enq[1]/div[2]/div[1]/span[1]/span[1]/button[1]");
	By close = By.xpath("//*[@id=\"login_header_disable\"]/div/div/div[2]/a");
	
	public WebElement From() {
		return driver.findElement(from);
	}
	
	public WebElement To() {
		return driver.findElement(to);
	}
	
	public WebElement Search() {
		return driver.findElement(search);
	}
	
	public WebElement Date() {
		return driver.findElement(date);
	}
	
	public WebElement Seldate() {
		return driver.findElement(seldate);
	}
	
	public WebElement Refresh() {
		return driver.findElement(refresh);
	}

	public WebElement Berth() {
		// TODO Auto-generated method stub
		return driver.findElement(berth);
	}
	
	public WebElement Select() {
		return driver.findElement(select);
	}
	
	public WebElement Book() {
		return driver.findElement(book);
	}
	
	public WebElement Close() {
		return driver.findElement(close);
	}
	
	public WebElement Bus() {
		return driver.findElement(bus);
	}
}
