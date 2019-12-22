package pages;

import common.PageFunctions;
import lombok.extern.slf4j.Slf4j;
import pages.Locators.OneFcPageObject;

@Slf4j
public class FavoriteAthletesPageSteps extends PageFunctions {

	public void clickOnTheFollowButton() {
		if (findElementsByXpath(OneFcPageObject.followButton)!=null) {
				findElementsByXpath(OneFcPageObject.followButton).get(0).click();
				findElementsByXpath(OneFcPageObject.followButton).get(1).click();
				
		} else {
			log.info("The follow button is not displayed");
		}
	}

	public void clickOnTheFinishButton() {
		if (findElementByXpath(OneFcPageObject.finishButton) != null) {
			clickElementByXpath(OneFcPageObject.finishButton);
		} else {
			log.info("The follow button is not displayed");
		}
	}

}
