package pompages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;


public class SeleniumTrainingPage {

	//Declaration
	@FindBy(xpath ="//h1[text()='Selenium Training']")
	private WebElement pageHeader;
	
	@FindBy(id = "add")
	private WebElement plusButton;
	
	@FindBy(xpath ="//button[text()='Add to Cart']")
	private WebElement addTocartButton;
	
	//Initialization
	public SeleniumTrainingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilization
	public WebElement getpageHeader() {
		return pageHeader;
	}
	public void doubleClickPlusButton(WebDriverUtility web) {
	   web.doubleClickOnElement(plusButton);
	}
	public void clickAddTocart() {
		addTocartButton.click();
	}
}
	
