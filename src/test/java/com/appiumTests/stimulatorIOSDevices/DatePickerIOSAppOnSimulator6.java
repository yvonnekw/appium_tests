package com.appiumTests.stimulatorIOSDevices;

import java.net.MalformedURLException;


public class DatePickerIOSAppOnSimulator6 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		/*

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.1");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");
		cap.setCapability(MobileCapabilityType.APP, "/Users/yvonneak/Library/Developer/Xcode/DerivedData/UICatalog-fdestysnmickfycdbguolsmsrtnz/Build/Products/Debug-iphonesimulator/UICatalog.app");
		//cap.setCapability("boundleId","com.example.apple-samplecode.UICatalog");
		
		URL url =new URL("http://127.0.0.1:4723/wd/hub");
		
		//interact with webElements
		//opens url then install app into device by using capabilities
		IOSDriver driver=new IOSDriver(url,cap);
		
		
		
		//click on Alert views
		driver.findElementByAccessibilityId("Date Picker").click();
		
		Thread.sleep(5000);
		//1 find all matcing elent
		List<WebElement> values=driver.findElementsByXPath("//XCUIElementTypePickerWheel");
		
		for(int i=0; i<values.size(); i++) {
		
			System.out.println(values.get(i).getText());
		
		}
		
		
		
		Thread.sleep(3000);
		values.get(0).sendKeys("Jun 3");
		Thread.sleep(3000);
		values.get(1).sendKeys(Keys.TAB);
		Thread.sleep(3000);
		values.get(1).sendKeys("8");
		Thread.sleep(3000);
		values.get(1).sendKeys(Keys.TAB);
		Thread.sleep(3000);
		values.get(2).sendKeys("09");
		
		values.get(1).sendKeys(Keys.TAB);
		Thread.sleep(3000);
		values.get(2).sendKeys("PM");
		
		Thread.sleep(9000);
		driver.quit();
		*/
	}

}
