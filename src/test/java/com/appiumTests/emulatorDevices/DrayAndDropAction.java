package com.appiumTests.emulatorDevices;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import com.appiumTests.BaseTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.ElementOption;

import static com.appiumTests.BaseTest.getAppiumDriverCapabilities;

public class DrayAndDropAction extends BaseTest {
	public static AppiumDriver<MobileElement> appiumDriver = null;
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		String app = "src/test/resources/DragSortDemos_v0.5.0_apkpure.com.apk";
		String appPackage = "com.google.android.calculator";
		String appActivity = "com.android.calculator2.Calculator";
		appiumDriver = getAppiumDriverCapabilities(app, appPackage, appActivity);

		appiumDriver.manage().timeouts().implicitlyWait(50L, TimeUnit.SECONDS);

		appiumDriver.findElementById("com.mobeta.android.demodslv:id/activity_desc").click();
		//String actualText="Use the menu to adjust settings related to item removal and drag initiation. These options are provided by the DragSortController class.";
		//Assert.assertEquals(basicUsage, actualText);
		//com.mobeta.android.demodslv:id/drag_handle
		//instance	2
		//element is identified by many
		WebElement source = appiumDriver.findElementsById("com.mobeta.android.demodslv:id/drag_handle").get(2);
		WebElement target = appiumDriver.findElementsById("com.mobeta.android.demodslv:id/drag_handle").get(5);

		//drag and drop actions
		TouchAction action=new TouchAction((MobileDriver)appiumDriver);
		
		action.longPress(ElementOption.element(source)).moveTo(ElementOption.element(target)).release().perform();
		System.out.println("Element has been dropped at destination successfully");
	}

}
