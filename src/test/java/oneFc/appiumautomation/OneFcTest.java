package oneFc.appiumautomation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import common.PageFunctions;
import pages.AthletesInfoPage;
import pages.AthletesPage;
import pages.CountrySelectionPageSteps;
import pages.EventPage;
import pages.FavoriteAthletesPageSteps;
import pages.HomePageSteps;
import pages.SearchResultPage;
import pages.SecondCarouselFirstElementPage;

public class OneFcTest {
	PageFunctions pageFunctions = new PageFunctions();
	CountrySelectionPageSteps countrySelectionPageSteps = new CountrySelectionPageSteps();
	FavoriteAthletesPageSteps favoriteAthletesPageSteps = new FavoriteAthletesPageSteps();
	AthletesInfoPage athletesInfoPage = new AthletesInfoPage();
	AthletesPage athletesPage = new AthletesPage();
	EventPage eventPage = new EventPage();
	SecondCarouselFirstElementPage secondCarouselFirstElementPage = new SecondCarouselFirstElementPage();
	SearchResultPage searchResultPage = new SearchResultPage();
	HomePageSteps homePageSteps = new HomePageSteps();

	@BeforeClass
	public void presetUp() {
		pageFunctions.presetUp();
	}

	@Test
	public void oneFcTest() throws InterruptedException {
		countrySelectionPageSteps.clickOnNextButton();
		favoriteAthletesPageSteps.clickOnTheFollowButton();
		favoriteAthletesPageSteps.clickOnTheFinishButton();
		homePageSteps.closeButton();
		homePageSteps.scrollTheFirstCarouselAndClickOnTheEventOnTheFirstCarousel();
		eventPage.printTheFirstBoutHeading();
		eventPage.clickOnBackButton();
		homePageSteps.clickOnTheSecondCarouselFirstElement();
		secondCarouselFirstElementPage.searchTheAthlete("Angela Lee");
		searchResultPage.clickOnAthletesTab();
		athletesPage.clickOnAthletesCard();
		athletesInfoPage.printTheAthletesNickName();

	}
    @AfterClass
    public void tearDown()
    {
    	PageFunctions.mobDriver.quit();
    }
}
