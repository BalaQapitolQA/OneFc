package pages;

import common.PageFunctions;
import lombok.extern.slf4j.Slf4j;
import pages.Locators.OneFcPageObject;

@Slf4j
public class CountrySelectionPageSteps extends PageFunctions {
	
	
	
	public void clickOnNextButton()
	{
		if(findElementByXpath(OneFcPageObject.nextButton)!=null)
		{
			clickElementByXpath(OneFcPageObject.nextButton);
	}
		else
		{
			log.info("The next button is not displayed");
		}
	}
	

}
