package com.appiumTests.emulatorDevices;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import junit.framework.Assert;

public class SendingSMS {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1.1");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		
		
		cap.setCapability("appPackage", "com.android.mms");
		cap.setCapability("appActivity", "com.android.mms.ui.ComposeMessageActivity");
		
		URL url =new URL("http://127.0.0.1:4723/wd/hub");
		
		//interact with webElements
		//opens url then install app into device by using capabilities
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,cap);
		
		
		driver.findElementById("com.android.mms:id/recipients_editor").sendKeys("07960171035");
		
		Thread.sleep(2000);
		
		driver.findElementById("com.android.mms:id/embedded_text_editor").sendKeys("Please, make me a cup of tea");
		Thread.sleep(3000);
		driver.findElementById("com.android.mms:id/send_button_sms").click();
		Thread.sleep(2000);
		String theText=driver.findElementById("com.android.mms:id/text_view").getText();
		
		String expected=("Please, make me a cup of tea");
		
		if(expected.equals(theText)) {
			System.out.println("It works");
		}else {
			System.out.println("It fails");
		}
		
		Assert.assertEquals(expected, theText);
		
		Thread.sleep(2000);
		
		driver.quit();
	
	}

}
