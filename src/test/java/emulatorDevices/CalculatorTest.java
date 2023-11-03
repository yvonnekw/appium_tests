package emulatorDevices;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.MobileElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
public class CalculatorTest {
	
	
	
	public  static void main(String [] args) throws MalformedURLException, InterruptedException {
		
		WebElement seven, five, manus,thesum;
		AndroidDriver<MobileElement> driver = null;
		AppiumDriverLocalService service = null;

		service = AppiumDriverLocalService.buildDefaultService();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "34");
		capabilities.setCapability("deviceName", "Pixel_3a_API_34_extension_level_7_arm64-");
		capabilities.setCapability("automationName", "UiAutomator2");
		capabilities.setCapability("app", "/Users/yvonnek/Downloads/Calculator_8.4.1 (520193683)_Apkpure.apk");
		capabilities.setCapability("avd", "Nexus_One_API_34");
		capabilities.setCapability("appPackage","com.google.android.calculator");
		capabilities.setCapability("appActivity","com.android.calculator2.Calculator");

		
		URL url =new URL("http://127.0.0.1:4723/wd/hub");

		AppiumServiceBuilder builder;
		builder = new AppiumServiceBuilder().withLogFile(new File("appium_"+"className"+".log"));
		builder.withIPAddress("127.0.0.1");
		builder.usingPort(4723);
		builder.withCapabilities(capabilities);
		builder.withArgument(GeneralServerFlag.SESSION_OVERRIDE);
		builder.withArgument(GeneralServerFlag.LOG_LEVEL, "getAppiumLogLevel()");
		builder.withArgument(GeneralServerFlag.RELAXED_SECURITY);
		builder.withArgument(GeneralServerFlag.LOG_NO_COLORS);
		builder.withArgument(GeneralServerFlag.CALLBACK_PORT, Integer.toString(4723));
		builder.withArgument(GeneralServerFlag.LOG_TIMESTAMP);
		builder.withArgument(GeneralServerFlag.LOCAL_TIMEZONE);
		builder = new AppiumServiceBuilder().withArgument(() -> "--base-path", "/wd/hub");
		service = AppiumDriverLocalService.buildService(builder);
		service.start();

		//interact with webElements
		//opens url then install app into device by using capabilities
		driver = new AndroidDriver<MobileElement>(url,capabilities);
		Thread.sleep(5000);

		seven=driver.findElementById("com.android.calculator2:id/digit_7");
		seven.click();
		manus=driver.findElementById("com.android.calculator2:id/op_sub");
				manus.click();
		five=driver.findElementById("com.android.calculator2:id/digit_5");
		five.click();
		driver.findElementById("com.android.calculator2:id/eq").click();//click on manus sign
		 //thesum
		 String theResult=driver.findElementById("com.android.calculator2:id/formula").getText();
		//thesum.click();
		 if (theResult.equals("2")) {
			 System.out.println("Results is as expected");
		 }
		 else {
		 System.out.println("Results wrong");
		 }
		Assert.assertEquals("2",theResult);
		Thread.sleep(3000);
		driver.quit();

	
	}

}
