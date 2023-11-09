package com.appiumTests.emulatorDevices;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import static com.appiumTests.BaseTest.getAppiumDriverCapabilities;

public class ExampleCheckBox {
	public static AppiumDriver<MobileElement> appiumDriver = null;
	public static void main(String[] args) throws InterruptedException, MalformedURLException {

		String app = "src/test/resources/DragSortDemos_v0.5.0_apkpure.com.apk";
		String appPackage = "com.google.android.calculator";
		String appActivity = "com.android.calculator2.Calculator";
		appiumDriver = getAppiumDriverCapabilities(app, appPackage, appActivity);
	
		//views
		appiumDriver.findElementsById("android:id/test1").get(10).click(); //views options
		
		//controls
		appiumDriver.findElementsById("android:id/test1").get(4).click();
		
		//dark theme
		
		//driver.findElementsById("android:id/test1").get(4).click();//dark theme
		appiumDriver.findElementByAccessibilityId("2. Dark Theme").click(); //dark theme
		
		//test box
		appiumDriver.findElementById("io.appium.android.apis:id/edit").sendKeys("Sarah");
		
		//check box1
		appiumDriver.findElementById("io.appium.android.apis:id/check1").click();
		
		//radiobutton
		appiumDriver.findElementById("io.appium.android.apis:id/radio1").click();

	}

}
