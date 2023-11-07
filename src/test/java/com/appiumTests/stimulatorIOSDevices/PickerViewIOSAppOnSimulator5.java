package com.appiumTests.stimulatorIOSDevices;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class PickerViewIOSAppOnSimulator5 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.1");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");
		cap.setCapability(MobileCapabilityType.APP, "/Users/yvonneak/Library/Developer/Xcode/DerivedData/UICatalog-fdestysnmickfycdbguolsmsrtnz/Build/Products/Debug-iphonesimulator/UICatalog.app");
	
		
		
		
		
		URL url =new URL("http://127.0.0.1:4723/wd/hub");
		
		//interact with webElements
		//opens url then install app into device by using capabilities
		IOSDriver driver=new IOSDriver(url,cap);
		
		
		
		//click on Alert views
		driver.findElementByAccessibilityId("Picker View").click();
		
		Thread.sleep(5000);
		//1 find all matcing elent
		List<WebElement> values=driver.findElementsByXPath("//XCUIElementTypePickerWheel");
		
		
		String val1= values.get(0).getAttribute("value");
		String val2= values.get(1).getAttribute("value");
		String val3= values.get(2).getAttribute("value");
		
		
		System.out.println(val1+" "+val2 +"  "+val3);
		Thread.sleep(3000);
		values.get(0).sendKeys("50");
		Thread.sleep(3000);
		values.get(1).sendKeys("100");
		Thread.sleep(3000);
		values.get(2).sendKeys("200");
		
		Thread.sleep(5000);
		driver.findElementByAccessibilityId("OK").click();
		
		Thread.sleep(3000);
		//2
		driver.findElementByAccessibilityId("Other").click();
		driver.findElementByAccessibilityId("Safe Choice").click();
		
		//3
		Thread.sleep(3000);
		driver.findElementByAccessibilityId("Other").click();
		driver.findElementByAccessibilityId("Destructive Choice").click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
