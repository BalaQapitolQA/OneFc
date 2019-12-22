package pages;

import org.testng.Assert;

import common.PageFunctions;
import io.appium.java_client.MobileElement;
import lombok.extern.slf4j.Slf4j;
import pages.Locators.OneFcPageObject;

@Slf4j
public class HomePageSteps extends PageFunctions {
	
	public void closeButton()
	{
		if(findElementByXpath(OneFcPageObject.popUpCloseButton)!=null)
		{
			clickElementByXpath(OneFcPageObject.popUpCloseButton);
		}
		else
		{
			log.info("The cancel button is not displayed"); 
		}
	
	}
	
	public void scrollTheFirstCarouselAndClickOnTheEventOnTheFirstCarousel()
	{
		int position=0;
		Boolean videoPlayOption=true;
		while(videoPlayOption==true)
		{
			
			if(findElementByXpath(OneFcPageObject.carouselPlayButton)==null)
			{
				findElementsByXpath(OneFcPageObject.firstCarousel).get(position).click();
				videoPlayOption=false;
			}
			else
			{
				scrollElementHorizontally(findElementsByXpath(OneFcPageObject.firstCarousel).get(position+1),findElementsByXpath(OneFcPageObject.firstCarousel).get(position));
				videoPlayOption=true;
			}
		
	}
	}
	
	public void clickOnTheSecondCarouselFirstElement()
	{
		clickElementByXpath(OneFcPageObject.secondCrouselFirstElement);
	}
	

}
