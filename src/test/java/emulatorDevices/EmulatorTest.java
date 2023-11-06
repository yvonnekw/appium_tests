package emulatorDevices;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class EmulatorTest {
	
	public  static void main(String [] args) throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1.1");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		cap.setCapability(MobileCapabilityType.APP, "/Users/yvonneak/Documents/AutomationFiles/appiumJar/IdentExAndroidAPIDEMO_v1.0.3_apkpure.com.apk");
		
		
		URL url =new URL("http://127.0.0.1:4723/wd/hub");
		
		//interact with webElements
		//opens url then install app into device by using capabilities
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,cap);
		
	
		driver.quit();
	
	}

}
