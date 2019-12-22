package pages;

import common.PageFunctions;
import pages.Locators.OneFcPageObject;


public class SecondCarouselFirstElementPage extends PageFunctions {


	public void searchTheAthlete(String text) {
		clickElementByXpath(OneFcPageObject.searchButton);
		sendKeysByXpath(OneFcPageObject.searchField, text);
	}
}
