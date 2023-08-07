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
	
	@FindBy(xpath = "//*[@id=\"origin\"]/span/input")
	WebElement from;
	@FindBy(xpath = "//*[@id=\"destination\"]/span/input")
	WebElement to;
	@FindBy(xpath = "//label[@for='availableBerth']")
	WebElement berth;
	@FindBy(xpath = "//*[@id=\"jDate\"]/span/input")
	WebElement date;
	@FindBy(xpath = "//*[@id=\"jDate\"]/span/div/div/div[2]/table/tbody/tr[4]/td[1]/a")
	WebElement seldate;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement search;
	@FindBy(xpath = "/html/body/app-root/app-home/div[1]/app-header/div[1]/div[2]/a/i")
	WebElement menu;
	@FindBy(xpath = "//*[@id=\"divMain\"]/div/app-train-list/div[4]/div/div[5]/div[1]/div[1]/app-train-avl-enq/div[1]/div[5]/div[1]/table/tr/td[1]/div/div[1]/strong")
	WebElement refresh;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-home[1]/div[3]/div[1]/app-train-list[1]/div[4]/div[1]/div[5]/div[1]/div[1]/app-train-avl-enq[1]/div[1]/div[7]/div[1]/div[3]/table[1]/tr[1]/td[2]/div[1]/div[1]")
	WebElement select;
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-home[1]/div[3]/div[1]/app-train-list[1]/div[4]/div[1]/div[5]/div[1]/div[1]/app-train-avl-enq[1]/div[2]/div[1]/span[1]/span[1]/button[1]")
	WebElement book;
	@FindBy(xpath="//*[@id=\"login_header_disable\"]/div/div/div[2]/a")
	WebElement close;
	@FindBy(xpath = "//a[@aria-label='Menu BUSES. Website will be opened in new tab']")
	WebElement bus;
	
	
	public WebElement From() {
		return from;
	}
	
	public WebElement To() {
		return to;
	}
	
	public WebElement Berth() {
		return berth;
	}
	
	public WebElement Search() {
		return search;
	}
	
	public WebElement Date() {
		return date;
	}
	
	public WebElement Seldate() {
		return seldate;
	}
	
	public WebElement Refresh() {
		return refresh;
	}
	
	public WebElement Select() {
		return select;
	}
	
	public WebElement Book() {
		return book;
	}
	
	public WebElement Close() {
		return close;
	}
	
	public WebElement Bus() {
		return bus;
	}
}
