package pages;

import org.testng.Assert;

import common.PageFunctions;
import lombok.extern.slf4j.Slf4j;
import pages.Locators.OneFcPageObject;

@Slf4j
public class EventPage extends PageFunctions {
	
	public void printTheFirstBoutHeading() throws InterruptedException
	{
	
		clickElementByXpath(OneFcPageObject.viewAllBoutsButton);
		log.info(findElementByXpath(OneFcPageObject.firstBout).getText());
		Assert.assertTrue(!findElementByXpath(OneFcPageObject.firstBout).equals(null));
	}
	
	public void clickOnBackButton()
	{
		clickElementByXpath(OneFcPageObject.backButton);
	}

}
