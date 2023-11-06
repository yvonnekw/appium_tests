package emulatorDevices;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ExampleCheckBox {

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
		
		//views
		driver.findElementsById("android:id/test1").get(10).click(); //views options
		
		//controls
		driver.findElementsById("android:id/test1").get(4).click();
		
		//dark theme
		
		//driver.findElementsById("android:id/test1").get(4).click();//dark theme
		driver.findElementByAccessibilityId("2. Dark Theme").click(); //dark theme
		
		//test box
		driver.findElementById("io.appium.android.apis:id/edit").sendKeys("Sarah");
		
		//check box1
		driver.findElementById("io.appium.android.apis:id/check1").click();
		
		//radiobutton
		driver.findElementById("io.appium.android.apis:id/radio1").click();
		
		

	}

}
