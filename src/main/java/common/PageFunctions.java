package common;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.MessageFormat;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import lombok.extern.slf4j.Slf4j;
@Slf4j
public class PageFunctions 
{
	public static AndroidDriver<MobileElement> mobDriver;
    public void presetUp() {
    	DesiredCapabilities capabilities = new DesiredCapabilities();
    	capabilities.setCapability("noReset",true);
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "8.0.0");
        capabilities.setCapability("deviceName", "Samsung S7edge");
        capabilities.setCapability("appPackage", "com.onefc.android.app");
        capabilities.setCapability("appActivity", "com.onechampionship.MainActivity");
        try {
            mobDriver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            mobDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    
    public void clickElementByXpath(String xpath) {
    	try {
		mobDriver.findElement(By.xpath(xpath)).click();
    	}
    	catch (NoSuchElementException e) {
			log.info("The element "+xpath+" is not available");
		}
	}

	public void clickElementByText(String xpath, String text) {
		try
		{
		mobDriver.findElement(By.xpath(xpath)).click();
		}
		catch (NoSuchElementException e) {
			log.info("The element "+xpath+" is not available");
		}
	}

	public void  findElementByText(String xpath, String text) {
		try
		{
		mobDriver.findElement(By.xpath(MessageFormat.format(xpath, text)));
		}
		catch (NoSuchElementException e) {
			log.info("The element "+xpath+" is not available");
		}
	}

	public void sendKeysByXpath(String xpath, String text) {
		mobDriver.findElement(By.xpath(xpath)).clear();
		mobDriver.findElement(By.xpath(xpath)).sendKeys(text);
	}
	public void scrollElementyXpath(String text) {
		 mobDriver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + text + "\"));");
	}

	public MobileElement findElementByXpath(String xpath) {
		MobileElement mobileElement = null;
		try
		{
			mobileElement= mobDriver.findElement(By.xpath(xpath));
		}
		catch(NoSuchElementException e)
		{
			log.info("The element "+xpath+" is not available");
		}
		return mobileElement;
	}
	
	public List<MobileElement> findElementsByXpath(String xpath) {
		List<MobileElement> mobileElement = null;
		try
		{
			mobileElement= mobDriver.findElements(By.xpath(xpath));
		}
		catch(NoSuchElementException e)
		{
			log.info("The element "+xpath+" is not available");
		}
		return mobileElement;
	}

	

	
	public void scrollElementHorizontally(MobileElement element1,MobileElement element2)	
	{
		
	TouchAction action = new TouchAction(mobDriver);
    int startY = (int) (element1.getLocation().getY() + (element1.getSize().getHeight() / 2.1));
    int startX = (int) (element1.getLocation().getX() + (element1.getSize().getWidth() *0.9));

    int endX = (int) (element2.getLocation().getX() + (element2.getSize().getWidth() * 0.1));
    int endY = element2.getLocation().getY() + (element2.getSize().getHeight() / 2);

    action.press(startX, startY).waitAction(2000).moveTo(endX, endY).release().perform();	}
}
