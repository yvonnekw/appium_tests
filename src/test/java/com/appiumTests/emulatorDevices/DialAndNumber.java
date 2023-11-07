package com.appiumTests.emulatorDevices;

import java.net.MalformedURLException;

import com.appiumTests.BaseTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import static com.appiumTests.utitlities.Properties.*;

public class DialAndNumber extends BaseTest {
	
	public static void main(String [] args) throws MalformedURLException, InterruptedException {

		AppiumDriver<MobileElement> driver = null;
	
	DesiredCapabilities capabilities = new DesiredCapabilities();
//	capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
	//capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	//capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1.1");
	//capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		//
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "34");
		capabilities.setCapability("deviceName", "Nexus_One_API_34");
		capabilities.setCapability("automationName", "UiAutomator2");
		capabilities.setCapability("app", "src/test/resources/com.android.dialer.apk");
		capabilities.setCapability("avd", "Nexus_One_API_34");
		//capabilities.setCapability("appPackage", "com.google.android.calculator");
		//capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
	
	
	capabilities.setCapability("appPackage", "com.android.dialer");
	capabilities.setCapability("appActivity", "com.android.dialer.DialtactsActivity");

	appiumServiceBuilder(appiumServerBaseUrl, portNumber, appiumServerRemotePath, capabilities);
	appiumServerUrl(appiumServerBaseUrl, portNumber, appiumServerRemotePath);
	
	//URL url =new URL("http://127.0.0.1:4723/wd/hub");
	
	//interact with webElements
	//opens url then install app into device by using capabilities
		 //AndroidDriver<MobileElement>	driver = new AndroidDriver<MobileElement>(appiumServerUrl,capabilities);
		driver = new AppiumDriver<>(appiumServerUrl, capabilities);
	//AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,cap);

	driver.findElementById("com.android.dialer:id/floating_action_button").click();
	
	driver.findElementById("com.android.dialer:id/zero").click();
	driver.findElementById("com.android.dialer:id/two").click();
	driver.findElementById("com.android.dialer:id/zero").click();
	driver.findElementById("com.android.dialer:id/eight").click();
	driver.findElementById("com.android.dialer:id/four").click();
	driver.findElementById("com.android.dialer:id/five").click();
	driver.findElementById("com.android.dialer:id/zero").click();
	driver.findElementById("com.android.dialer:id/six").click();
	driver.findElementById("com.android.dialer:id/nine").click();
	driver.findElementById("com.android.dialer:id/nine").click();
	driver.findElementById("com.android.dialer:id/nine").click();
	
	//get results the assert
	String fullDailedNumber=driver.findElementById("com.android.dialer:id/digits").getText();
	//expected
	String expected="02084506999";
	Thread.sleep(2000);
	driver.findElementById("com.android.dialer:id/dialpad_floating_action_button").click();
	Thread.sleep(3000);
	if(fullDailedNumber.equals(expected)) {
		System.out.println("It works");
	}else {
		System.out.println("It fails");
	}
	Assert.assertEquals(expected, fullDailedNumber);
	
	Thread.sleep(3000);
	driver.quit();


	}

}
