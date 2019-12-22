package pages;

import org.testng.Assert;

import common.PageFunctions;
import lombok.extern.slf4j.Slf4j;
import pages.Locators.OneFcPageObject;

@Slf4j
public class AthletesInfoPage extends PageFunctions {

	public void printTheAthletesNickName() {
		String athletesNickName = findElementByXpath(OneFcPageObject.athleteNickName).getText();
		log.info(athletesNickName);
		Assert.assertTrue(!findElementByXpath(OneFcPageObject.athleteNickName).equals(null));
	}

}
