package irctcdash;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IrctcSearch_insrt {

	WebDriver driver;
	public IrctcSearch_insrt(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='departFrom']")
	WebElement from;
	@FindBy(xpath = "//input[@id='goingTo']")
	WebElement to;
	//@FindBy(xpath = "//label[@for='availableBerth']")
	//WebElement berth;
	@FindBy(xpath = "//button[normalize-space()='Search Bus']")
	WebElement search;
	//@FindBy(xpath = "//*[@id=\"jDate\"]/span/input")
	//WebElement date;
	@FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[1]/a")
	WebElement seldate;
	//@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-home[1]/div[3]/div[1]/app-train-list[1]/div[4]/div[1]/div[5]/div[1]/div[1]/app-train-avl-enq[1]/div[1]/div[5]/div[1]/table[1]/tr[1]/td[1]/div[1]/div[2]")
	//WebElement refresh;
	@FindBy(xpath = "//a[@aria-label='Menu BUSES. Website will be opened in new tab']")
	WebElement bus;
	
	public WebElement From() {
		return from;
	}
	
	public WebElement To() {
		return to;
	}
	
//	public WebElement Berth() {
//		return berth;
//	}
	
	public WebElement Search() {
		return search;
	}
	
//	public WebElement Date() {
//		return date;
//	}
	
	public WebElement Seldate() {
		return seldate;
	}
	
//	public WebElement Refresh() {
//		return refresh;
//	}
	
	public WebElement Bus() {
		return bus;
	}
}
