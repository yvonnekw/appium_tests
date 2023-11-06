package emulatorDevices;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import junit.framework.Assert;

public class DialAndNumber {
	
	public static void main(String [] args) throws MalformedURLException, InterruptedException {
	
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1.1");
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
	
	
	cap.setCapability("appPackage", "com.android.dialer");
	cap.setCapability("appActivity", "com.android.dialer.DialtactsActivity");
	
	URL url =new URL("http://127.0.0.1:4723/wd/hub");
	
	//interact with webElements
	//opens url then install app into device by using capabilities
		 AndroidDriver<MobileElement>	driver = new AndroidDriver<MobileElement>(url,cap);
	//AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,cap);
	/*
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
	*/

	}

}
