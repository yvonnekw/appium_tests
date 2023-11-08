package com.appiumTests.emulatorDevices;

import java.net.MalformedURLException;
import com.appiumTests.BaseTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.Assert;

public class DialAndNumber extends BaseTest {

	public static AppiumDriver<MobileElement> appiumDriver;
	public static void main(String [] args) throws MalformedURLException, InterruptedException {

 		String app = "src/test/resources/Simple Dialer_5.18.1_Apkpure.apk";
		String appPackage = "com.simplemobiletools.dialer";
		String appActivity = "com.simplemobiletools.dialer.activities.SplashActivity.Orange";
		appiumDriver = getAppiumDriverCapabilities(app, appPackage, appActivity);

		//click on cancel button
		appiumDriver.findElementById("android:id/button2").click();
		//click on the Allow button
		appiumDriver.findElementById("com.android.permissioncontroller:id/permission_allow_button").click();
		appiumDriver.findElementById("com.simplemobiletools.dialer:id/main_dialpad_button").click();

		appiumDriver.findElementById("com.simplemobiletools.dialer:id/dialpad_0").click();
		appiumDriver.findElementById("com.simplemobiletools.dialer:id/dialpad_2").click();
		appiumDriver.findElementById("com.simplemobiletools.dialer:id/dialpad_0").click();
		appiumDriver.findElementById("com.simplemobiletools.dialer:id/dialpad_8").click();
		appiumDriver.findElementById("com.simplemobiletools.dialer:id/dialpad_4").click();
		appiumDriver.findElementById("com.simplemobiletools.dialer:id/dialpad_5").click();
		appiumDriver.findElementById("com.simplemobiletools.dialer:id/dialpad_0").click();
		appiumDriver.findElementById("com.simplemobiletools.dialer:id/dialpad_6").click();
		appiumDriver.findElementById("com.simplemobiletools.dialer:id/dialpad_9").click();
		appiumDriver.findElementById("com.simplemobiletools.dialer:id/dialpad_9").click();
		appiumDriver.findElementById("com.simplemobiletools.dialer:id/dialpad_9").click();

	//get results the assert
	String fullDailedNumber = appiumDriver.findElementById("com.simplemobiletools.dialer:id/dialpad_input").getText();
	//expected
	String expected="02084506999";
	Thread.sleep(2000);
	//	appiumDriver.findElementById("com.android.dialer:id/dialpad_floating_action_button").click();
	Thread.sleep(3000);
	if(fullDailedNumber.equals(expected)) {
		System.out.println("It works " + fullDailedNumber);
	}else {
		System.out.println("It fails");
	}
	Assert.assertEquals(expected, fullDailedNumber);
	
	Thread.sleep(3000);
	appiumDriver.quit();
	}

}
