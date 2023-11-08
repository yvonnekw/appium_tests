package com.appiumTests.emulatorDevices;

import java.io.File;
import java.net.MalformedURLException;
import com.appiumTests.BaseTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.Assert;
import static com.appiumTests.utitlities.Calculate.calculations;
import static com.appiumTests.utitlities.Calculate.theResult;

public class CalculatorTest extends BaseTest {

	static String app = "src/test/resources/Calculator_8.4.1_520193683_Apkpure.apk";
	static String appPackage = "com.google.android.calculator";
	static String appActivity = "com.android.calculator2.Calculator";

	static File apk_file;
	static String expectedResult;
public static String operator;
	public static AppiumDriver<MobileElement> appiumDriver;
	public  static void main(String [] args) throws MalformedURLException, InterruptedException {
		apk_file = new File("src/test/resources/Calculator_8.4.1_520193683_Apkpure.apk");
try {
	logging().info("the apk file: " + apk_file.exists());
	substrate();
	addition();
	multiple();
	division();

	}catch(Exception e){
		e.printStackTrace();
		}
	}

	public static void substrate() throws InterruptedException {
			//driver = new AppiumDriver<>(appiumServerUrl, capabilities);

		appiumDriver = getAppiumDriverCapabilities(app, appPackage, appActivity);
		expectedResult = "2";
		operator ="com.google.android.calculator:id/op_sub";
		calculations(operator, app, appPackage, appActivity);

		String actualResult = theResult;
		logging().info("Total sum " + actualResult);
		if (actualResult.equals(expectedResult)) {
			logging().info("Results is as expected");
		} else {
			logging().info("Results wrong");
		}
		Assert.assertEquals(actualResult, expectedResult);
		Thread.sleep(3000);
		appiumDriver.quit();
	}

	public static void addition() throws InterruptedException {
		appiumDriver = getAppiumDriverCapabilities(app, appPackage, appActivity);
		expectedResult = "12";
		operator ="com.google.android.calculator:id/op_add";
		calculations(operator, app, appPackage, appActivity);
		String actualResult = theResult;
		logging().info("Total sum " + actualResult);
		if (actualResult.equals(expectedResult)) {
			logging().info("Results is as expected");
		} else {
			logging().info("Results wrong");
		}
		Assert.assertEquals(actualResult, expectedResult);
		Thread.sleep(3000);
		appiumDriver.quit();
	}

	public static void multiple() throws InterruptedException {
		appiumDriver = getAppiumDriverCapabilities(app, appPackage, appActivity);
		expectedResult = "35";
		operator ="com.google.android.calculator:id/op_mul";
		calculations(operator, app, appPackage, appActivity);

		String actualResult = theResult;
		logging().info("Total sum " + actualResult);
		if (actualResult.equals(expectedResult)) {
			logging().info("Results is as expected");
		} else {
			logging().info("Results wrong");
		}
		Assert.assertEquals(actualResult, expectedResult);
		Thread.sleep(3000);
		appiumDriver.quit();
	}

	public static void division() throws InterruptedException {
		appiumDriver = getAppiumDriverCapabilities(app, appPackage, appActivity);
		expectedResult = "1.4";
		operator ="com.google.android.calculator:id/op_div";
		calculations(operator, app, appPackage, appActivity);
		String actualResult = theResult;
		logging().info("Total sum " + actualResult);
		if (actualResult.equals(expectedResult)) {
			logging().info("Results is as expected");
		} else {
			logging().info("Results wrong");
		}
		Assert.assertEquals(actualResult, expectedResult);
		Thread.sleep(3000);
		appiumDriver.quit();
	}
}
