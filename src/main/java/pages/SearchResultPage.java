package pages;

import org.testng.Assert;

import common.PageFunctions;
import pages.Locators.OneFcPageObject;

public class SearchResultPage extends PageFunctions {
	
	
	public void clickOnAthletesTab()
	{
		clickElementByXpath(OneFcPageObject.athleteTab);
		Assert.assertTrue(!findElementByXpath(OneFcPageObject.athleteTab).equals(null));
	}

}
