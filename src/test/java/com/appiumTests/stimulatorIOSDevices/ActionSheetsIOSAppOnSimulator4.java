package com.appiumTests.stimulatorIOSDevices;

import java.net.MalformedURLException;

import com.appiumTests.BaseTest;
import io.appium.java_client.AppiumBy;
;

import io.appium.java_client.ios.IOSDriver;
import org.testng.annotations.Test;




public class ActionSheetsIOSAppOnSimulator4 extends BaseTest {

	@Test
	public void choiceTest() throws MalformedURLException, InterruptedException {
		IOSDriver driver;

		String app = "~/Library/Developer/Xcode/DerivedData/UIKitCatalog-gahdtahuukdohjcuddytwxtwziyj/Build/Products/Debug-iphonesimulator/UIKitCatalog.app";
		driver = getIOSDriverOptions(app);

		//XCUITestOptions xcuiTestOptions = new XCUITestOptions();

		// appiumServiceBuilderIOS(appiumServerBaseUrl, portNumber, appiumServerRemotePath, xcuiTestOptions);

		//click on Alert views
		driver.findElement(AppiumBy.accessibilityId("Alert Views")).click();
		
		Thread.sleep(5000);
		//1
		driver.findElement(AppiumBy.accessibilityId("Other")).click();
		
		driver.findElement(AppiumBy.accessibilityId("Choice One")).click();
		
		//Thread.sleep(3000);
		//2
		driver.findElement(AppiumBy.accessibilityId("Other")).click();
		driver.findElement(AppiumBy.accessibilityId("Safe Choice")).click();
		
		//3
	//	Thread.sleep(3000);
		driver.findElement(AppiumBy.accessibilityId("Other")).click();
		driver.findElement(AppiumBy.accessibilityId("Destructive Choice")).click();
		
		//Thread.sleep(3000);
		
		driver.quit();
	}

}
