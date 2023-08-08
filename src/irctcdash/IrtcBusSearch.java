package irctcdash;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IrtcBusSearch {

	WebDriver driver;
	
	public IrtcBusSearch(WebDriver driver) {
		this.driver = driver;
	}
	
	By from = By.xpath("//input[@id='departFrom']");
	By to = By.xpath("//input[@id='goingTo']");
	By seldate = By.xpath("//*[@id=\\\"ui-datepicker-div\\\"]/table/tbody/tr[4]/td[1]/a");
	By lounge = By.xpath("/html/body/app-root/ng-component/div[3]/div[1]/ul/li[5]/a/div");
	By station = By.xpath("//select[@name='city']");
	By flight = By.xpath("//div[@class='Nav-icons Flights']");
	By hotel = By.xpath("//div[@class='Nav-icons IRCTCHotels']");
	By bus = By.xpath("//a[@aria-label='Menu BUSES. Website will be opened in new tab']");
	By retroom = By.xpath("//div[@class='Nav-icons RetiringRoom']");
	By tourpack = By.xpath("//div[@class='Nav-icons Package']");
	By bharatgau = By.xpath("//div[@class='Nav-icons BharatDarshan']");
	By buddist = By.xpath("//div[@class='Nav-icons BuddhistTrain']");
	By visitIn = By.xpath("//div[@class='Nav-icons VisitIndia']");
	By maharaj = By.xpath("//div[@class='Nav-icons Maharajas']");
	By goldchar = By.xpath("//div[@class='Nav-icons GoldenChariot']");
	By cruise = By.xpath("//div[@class='Nav-icons Cruise']");
	By heli = By.xpath("//div[@class='Nav-icons heliyatra']");
	By tag = By.xpath("//div[@class='Nav-icons TagIcon']");
	public WebElement From() {
		return driver.findElement(from);
	}
	
	public WebElement To() {
		return driver.findElement(to);
	}
	
	public WebElement Seldate() {
		return driver.findElement(seldate);
	}
	
	public WebElement Lounge() {
		return driver.findElement(lounge);
	}
	
	public WebElement Flight() {
		return driver.findElement(flight);
	}
	
	public WebElement Hotel() {
		return driver.findElement(hotel);
	}
	
	public WebElement Bus() {
		return driver.findElement(bus);
	}
	
	public WebElement Ret() {
		return driver.findElement(retroom);
	}
	
	public WebElement Tour() {
		return driver.findElement(tourpack);
	}
	
	public WebElement Bharat() {
		return driver.findElement(bharatgau);
	}
	
	public WebElement Bhuddi() {
		return driver.findElement(buddist);
	}
	
	public WebElement Visit() {
		return driver.findElement(visitIn);
	}
	
	public WebElement Maharaj() {
		return driver.findElement(maharaj);
	}
	
	public WebElement Goldchar() {
		return driver.findElement(goldchar);
	}
	
	public WebElement Cruise() {
		return driver.findElement(cruise);
	}
	
	public WebElement Heli() {
		return driver.findElement(heli);
	}
	
	public WebElement Tag() {
		return driver.findElement(tag);
	}
}
