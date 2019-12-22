package pages.Locators;

public class OneFcPageObject {

	public static final String nextButton = "//android.widget.TextView[@text='Next']";
	public static final String followButton = "//android.widget.TextView[@text='FOLLOW']";
	public static final String finishButton = "//android.widget.TextView[@text='Finish']";
	public static final String popUpCloseButton = "//android.view.ViewGroup/child::android.view.ViewGroup/child::android.view.ViewGroup/child::android.view.ViewGroup/child::android.view.ViewGroup/child::android.widget.ImageView/following-sibling::android.widget.TextView";
	public static final String firstCarousel = "(//android.widget.ScrollView/child::android.view.ViewGroup/child::android.view.ViewGroup/parent::android.view.ViewGroup/child::android.view.ViewGroup)[1]/child::android.widget.HorizontalScrollView/child::android.view.ViewGroup/child::android.view.ViewGroup\r\n" + 
			"";
	public static final String carouselPlayButton = "(//android.widget.ScrollView/child::android.view.ViewGroup/child::android.view.ViewGroup/parent::android.view.ViewGroup/child::android.view.ViewGroup)[1]/child::android.widget.HorizontalScrollView/child::android.view.ViewGroup\r\n"
			+ "/child::android.view.ViewGroup/child::android.view.ViewGroup/child::android.widget.ImageView/following-sibling::android.widget.ImageView";
	public static final String viewAllBoutsButton="//android.widget.TextView[@text='VIEW ALL BOUTS']";
	public static final String firstBout="(//android.view.ViewGroup/child::android.view.ViewGroup/child::android.view.ViewGroup/child::android.widget.ScrollView/child::android.view.ViewGroup/child::android.view.ViewGroup/child::android.view.ViewGroup/child::android.widget.TextView)[2]";
	public static final String backButton="//android.widget.TextView[@text='']";
	public static final String secondCrouselFirstElement="((//android.widget.ScrollView/child::android.view.ViewGroup/child::android.view.ViewGroup/parent::android.view.ViewGroup/child::android.view.ViewGroup)[3]/child::android.widget.HorizontalScrollView/child::android.view.ViewGroup/child::android.view.ViewGroup)[1]\r\n" + 
			"\r\n" + 
			"";
	public static final String searchButton="(//android.view.ViewGroup/child::android.widget.TextView[@text=''])[2]";
	public static final String searchField="//*[@text='Search ONE for...']";
	public static final String athleteTab="(//android.widget.Button/child::android.view.ViewGroup/child::android.view.ViewGroup/child::android.widget.TextView)[2]\r\n" + 
			"\r\n" + 
			"";
	public static final String athleteCard="((//android.view.ViewGroup/child::android.view.ViewGroup/child::android.view.ViewGroup/child::android.widget.ScrollView/child::android.view.ViewGroup)[1]/child::android.view.ViewGroup)[1]";
	public static final String athleteNickName="(//android.view.ViewGroup/child::android.view.View/following-sibling::android.view.ViewGroup/following-sibling::android.widget.TextView)[2]";



}