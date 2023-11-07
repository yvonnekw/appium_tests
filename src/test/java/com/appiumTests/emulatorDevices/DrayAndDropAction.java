package com.appiumTests.emulatorDevices;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.ElementOption;

public class DrayAndDropAction {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1.1");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		cap.setCapability(MobileCapabilityType.APP, "/Users/yvonnek/Documents/AutomationFiles/appiumJar/DragSortDemos_v0.5.0_apkpure.com.apk");
		

		
		URL url =new URL("http://127.0.0.1:4723/wd/hub");
		
		
		
		//interact with webElements
		//opens url then install app into device by using capabilities
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,cap);
		
		Thread.sleep(5000);
		
		driver.findElementById("com.mobeta.android.demodslv:id/activity_desc").click();
		//String actualText="Use the menu to adjust settings related to item removal and drag initiation. These options are provided by the DragSortController class.";
		//Assert.assertEquals(basicUsage, actualText);
		
		
		//com.mobeta.android.demodslv:id/drag_handle
		//instance	2
		
		//element is identified by many
		WebElement source=driver.findElementsById("com.mobeta.android.demodslv:id/drag_handle").get(2);
		
		WebElement target=driver.findElementsById("com.mobeta.android.demodslv:id/drag_handle").get(5);

		//drag and drop actions
		TouchAction action=new TouchAction((MobileDriver)driver);
		
		action.longPress(ElementOption.element(source)).moveTo(ElementOption.element(target)).release().perform();
		System.out.println("Element has been dropped at destination successfully");
	}

}
