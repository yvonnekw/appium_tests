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

public class ProgressBar {
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1.1");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		cap.setCapability(MobileCapabilityType.APP, "/Users/yvonneak/Documents/AutomationFiles/appiumJar/DownloadFilefromURL.apk");
		

		
		URL url =new URL("http://127.0.0.1:4723/wd/hub");
		
		
		
		//interact with webElements
		//opens url then install app into device by using capabilities
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,cap);
		
		Thread.sleep(5000);
		
		WebElement objProgr=driver.findElementById("com.android.androidui:id/seekBar1");
		String val1=driver.findElementById("com.android.androidui:id/textProgress").getText();
	
		System.out.println(val1);
		TouchAction action=new TouchAction((MobileDriver)driver);
		
		action.longPress(ElementOption.element(objProgr)).moveTo(ElementOption.element(objProgr,250,250)).release().perform();
		
		System.out.println(val1);
	
	}

}
