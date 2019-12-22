package pages;

import org.testng.Assert;

import common.PageFunctions;
import pages.Locators.OneFcPageObject;

public class AthletesPage extends PageFunctions {
	
	
	public void clickOnAthletesCard()
	{
		clickElementByXpath(OneFcPageObject.athleteCard);
		Assert.assertTrue(!findElementByXpath(OneFcPageObject.athleteCard).equals(null));
	}

}
