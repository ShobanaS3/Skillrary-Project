package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaForSeleniumPage {

	//Declaration
	@FindBy(xpath ="h2[text()='core java for Selenium']")
	private WebElement pageHeader;
	
	@FindBy(linkText ="Core Java For Selenium Training")
	private WebElement corejavaLink;
	
	//Initialization
	public CoreJavaForSeleniumPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilization
	public WebElement getPageHeader() {
		return pageHeader;
	}
	public void ClickcoreJavaLink() {
		corejavaLink.click();
	}
	
}
