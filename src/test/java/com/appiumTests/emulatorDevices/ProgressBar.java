package com.appiumTests.emulatorDevices;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

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
import static com.appiumTests.BaseTest.logging;

public class ProgressBar {

	public static AppiumDriver<MobileElement> appiumDriver = null;
	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		String app = "Users/yvonnek/Documents/AutomationFiles/appiumJar/DownloadFilefromURL.apk";
		String appPackage = "com.google.android.calculator";
		String appActivity = "com.android.calculator2.Calculator";
		appiumDriver = getAppiumDriverCapabilities(app, appPackage, appActivity);
		appiumDriver.manage().timeouts().implicitlyWait(50L, TimeUnit.SECONDS);

		WebElement objProgr = appiumDriver.findElementById("com.android.androidui:id/seekBar1");
		String val1 = appiumDriver.findElementById("com.android.androidui:id/textProgress").getText();
	
		System.out.println(val1);
		TouchAction action=new TouchAction((MobileDriver)appiumDriver);
		
		action.longPress(ElementOption.element(objProgr)).moveTo(ElementOption.element(objProgr,250,250)).release().perform();

		logging().info(val1);
	
	}

}
