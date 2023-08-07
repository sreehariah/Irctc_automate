package irctcdash;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IrtcBus {
	
	WebDriver driver;
	public IrtcBus(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='departFrom']")
	WebElement from;
	@FindBy(xpath = "//input[@id='goingTo']")
	WebElement to;
	
	@FindBy(xpath = "//button[normalize-space()='Search Bus']")
	WebElement search;
	
	@FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[1]/a")
	WebElement seldate;
	
	@FindBy(xpath = "//a[@aria-label='Menu BUSES. Website will be opened in new tab']")
	WebElement bus;
	
	@FindBy(xpath = "/html/body/app-root/ng-component/div[3]/div[1]/ul/li[5]/a/div")
	WebElement lounge;
	
	public WebElement From() {
		return from;
	}
	
	public WebElement To() {
		return to;
	}
	
	public WebElement Search() {
		return search;
	}
	
	public WebElement Seldate() {
		return seldate;
	}
	
	public WebElement Bus() {
		return bus;
	}
	
	public WebElement Lounge() {
		return lounge;
	}
	
}
