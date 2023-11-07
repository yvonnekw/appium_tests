package com.appiumTests.emulatorDevices;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class VerticalScrolling {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1.1");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		cap.setCapability(MobileCapabilityType.APP, "/Users/yvonneak/Documents/AutomationFiles/appiumJar/DragSortDemos_v0.5.0_apkpure.com.apk");
		

		
		URL url =new URL("http://127.0.0.1:4723/wd/hub");
		
		
		
		//interact with webElements
		//opens url then install app into device by using capabilities
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,cap);
		
		Thread.sleep(5000);
		
		//vertical scrolling
		driver.findElementsById("android:id/text1").get(10).click();//identify views and click on it;
		

		//capturing all list item
		AndroidElement list=(AndroidElement)driver.findElementById("android:id/text1");
	
		//scrolling down till we get the element
		MobileElement listItems =(MobileElement) driver.findElement(
				MobileBy.AndroidUIAutomator(
						"new UIScrollable(new UISelector()).scrollInToView("
						+ "new UISelector().description(\"Switches\"));"));
	
	System.out.println(listItems.getLocation());
	listItems.click();
	
	
	}

}
