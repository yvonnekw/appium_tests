package com.appiumTests.emulatorDevices;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import static com.appiumTests.BaseTest.getAppiumDriverCapabilities;

public class EmulatorTest {
	public static AppiumDriver<MobileElement> appiumDriver = null;
	public  static void main(String [] args) throws MalformedURLException {

		//DesiredCapabilities cap = new DesiredCapabilities();
		//cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		//cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		//cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1.1");
		//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		String app = "src/test/resources/DragSortDemos_v0.5.0_apkpure.com.apk";
		String appPackage = "com.google.android.calculator";
		String appActivity = "com.android.calculator2.Calculator";
		appiumDriver = getAppiumDriverCapabilities(app, appPackage, appActivity);
		//cap.setCapability(MobileCapabilityType.APP, "/Users/yvonnek/Documents/AutomationFiles/appiumJar/IdentExAndroidAPIDEMO_v1.0.3_apkpure.com.apk");
		//URL url =new URL("http://127.0.0.1:4723/wd/hub");
		
		//interact with webElements
		//opens url then install app into device by using capabilities
		//AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,cap);
		//driver.quit();
	
	}

}
