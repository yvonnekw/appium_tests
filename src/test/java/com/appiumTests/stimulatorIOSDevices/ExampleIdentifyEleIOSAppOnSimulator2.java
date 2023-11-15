package com.appiumTests.stimulatorIOSDevices;

import java.net.MalformedURLException;


public class ExampleIdentifyEleIOSAppOnSimulator2 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		/*
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
		
		//count how many list options are displayed
		//find out common locator matching all elements
	
		List<WebElement>listItems=driver.findElementsByXPath("//XCUIElementTypeStaticText");
		
		Thread.sleep(5000);
		
		System.out.println(listItems.size());
		
		//capture listItems into 1 variable
		for (WebElement li:listItems) {
			
			//extract text value
			
			System.out.println(li.getText());
			
		}
		
		//click on Alert views
		driver.findElementsByAccessibilityId("Alert Views");
		
		Thread.sleep(5000);
		
		driver.quit();
		*/
	}

}
