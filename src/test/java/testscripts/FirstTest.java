package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import genericLibraries.BaseClass;


public class FirstTest extends BaseClass {

	@Test
	public void firstTest() {
		SoftAssert soft = new SoftAssert();
		
		home.clickGearsTab();
		home.clickSkillraryDemoAppLink();
		web.handleChildBrowser();
		soft.assertTrue(demoApp.getPageHeader().isDisplayed());
		demoApp.mouseHoverTocourseTab(web);
		demoApp.clickseleniumTraining();
		soft.assertTrue(selenium.getpageHeader().isDisplayed());
		selenium.doubleClickPlusButton(web);
		selenium.clickAddTocart();
		web.handleAlert();
		web.screenshot();
		soft.assertAll();
	}
}
