package com.appiumTests.emulatorDevices;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

import static com.appiumTests.BaseTest.getAppiumDriverCapabilities;

public class VerticalScrolling {

	public static AppiumDriver<MobileElement> appiumDriver = null;
	public static void main(String[] args) throws InterruptedException, MalformedURLException {

		String app = "src/test/resources/Simple Dialer_5.18.1_Apkpure.apk";
		String appPackage = "com.simplemobiletools.dialer";
		String appActivity = "com.simplemobiletools.dialer.activities.SplashActivity.Orange";
		appiumDriver = getAppiumDriverCapabilities(app, appPackage, appActivity);

		//click on cancel button
		appiumDriver.findElementById("android:id/button2").click();
		//click on the Allow button
		appiumDriver.findElementById("com.android.permissioncontroller:id/permission_allow_button").click();
		//appiumDriver.findElementById("com.simplemobiletools.dialer:id/main_dialpad_button").click();
		//vertical scrolling

		//I need to find an app which expects a list
		//appiumDriver.findElementsById("android:id/text1").get(0).click();//identify views and click on it;

		//capturing all list item
		//AndroidElement list=(AndroidElement)appiumDriver.findElementById("android:id/text1");
	
		//scrolling down till we get the element
		//MobileElement listItems =(MobileElement) appiumDriver.findElement(
				//MobileBy.AndroidUIAutomator(
						//"new UIScrollable(new UISelector()).scrollInToView("
						//+ "new UISelector().description(\"Switches\"));"));
	
	//System.out.println(listItems.getLocation());
	//listItems.click();
	
	
	}

}
