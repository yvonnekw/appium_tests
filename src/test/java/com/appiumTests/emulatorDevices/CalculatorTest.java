package com.appiumTests.emulatorDevices;
import java.io.File;
import java.util.concurrent.TimeUnit;

import com.appiumTests.BaseTest;
import com.appiumTests.utilities.Calculate;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class CalculatorTest extends BaseTest {
	String app = "/src/test/resources/Calculator_8.4.1_520193683_Apkpure.apk";
	String appPackage = "com.google.android.calculator";
	String appActivity = "com.android.calculator2.Calculator";
	File apk_file;
	static String expectedResult;
	public String operator;
	AndroidDriver androidDriver;
	Calculate calculate;
	String actualResult;

	@Test
	public void apkFileExsts() {
		apk_file = new File("src/test/resources/Calculator_8.4.1_520193683_Apkpure.apk");
		try {
			logging().info("the apk file: " + apk_file.exists());

		}catch(Exception e){
			e.printStackTrace();
		}
	}
	@Test
	public void substrate() throws InterruptedException {

	calculate = new Calculate();
	androidDriver = (getAndroidDriverOptions(app, appPackage, appActivity));
	expectedResult = "2";
	operator ="com.google.android.calculator:id/op_sub";
	calculate.calculations(operator, app, appPackage, appActivity);

	actualResult = calculate.theResult;
	logging().info("Total sum " + actualResult);
	if (actualResult.equals(expectedResult)) {
		logging().info("Results is as expected");
	} else {
		logging().info("Results wrong");
	}
	assertEquals(actualResult, expectedResult);
		androidDriver.manage().timeouts().implicitlyWait(4L, TimeUnit.SECONDS);
	Thread.sleep(4000);
	}

	@Test
	public void addition() throws InterruptedException {
		calculate = new Calculate();
		androidDriver = (getAndroidDriverOptions(app, appPackage, appActivity));
		expectedResult = "12";
		operator ="com.google.android.calculator:id/op_add";
		calculate.calculations(operator, app, appPackage, appActivity);
		actualResult = calculate.theResult;
		logging().info("Total sum " + actualResult);
		if (actualResult.equals(expectedResult)) {
			logging().info("Results is as expected");
		} else {
			logging().info("Results wrong");
		}
		assertEquals(actualResult, expectedResult);
		Thread.sleep(4000);
		//androidDriver.manage().timeouts().implicitlyWait(2L, TimeUnit.SECONDS);
		androidDriver.quit();
	}

	@Test
	public void multiple() throws InterruptedException {
		calculate = new Calculate();
		androidDriver = (getAndroidDriverOptions(app, appPackage, appActivity));
		expectedResult = "35";
		operator ="com.google.android.calculator:id/op_mul";
		calculate.calculations(operator, app, appPackage, appActivity);
		actualResult = calculate.theResult;
		logging().info("Total sum " + actualResult);
		if (actualResult.equals(expectedResult)) {
			logging().info("Results is as expected");
		} else {
			logging().info("Results wrong");
		}
		assertEquals(actualResult, expectedResult);
		Thread.sleep(4000);
		//androidDriver.manage().timeouts().implicitlyWait(2L, TimeUnit.SECONDS);
		androidDriver.quit();
	}

	@Test
	public void division() throws InterruptedException {
		calculate = new Calculate();
		androidDriver = (getAndroidDriverOptions(app, appPackage, appActivity));
		expectedResult = "1.4";
		operator ="com.google.android.calculator:id/op_div";
		calculate.calculations(operator, app, appPackage, appActivity);
		actualResult = calculate.theResult;
		logging().info("Total sum " + actualResult);
		if (actualResult.equals(expectedResult)) {
			logging().info("Results is as expected");
		} else {
			logging().info("Results wrong");
		}
		assertEquals(actualResult, expectedResult);
		Thread.sleep(4000);
		//androidDriver.manage().timeouts().implicitlyWait(2L, TimeUnit.SECONDS);
		androidDriver.quit();
	}

}
