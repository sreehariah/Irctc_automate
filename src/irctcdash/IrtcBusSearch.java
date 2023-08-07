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
}
