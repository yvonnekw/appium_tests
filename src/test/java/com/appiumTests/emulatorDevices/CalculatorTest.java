package com.appiumTests.emulatorDevices;

import java.io.File;
import java.net.MalformedURLException;
import com.appiumTests.BaseTest;
import com.appiumTests.utitlities.Properties;
import org.testng.Assert;
import static com.appiumTests.utitlities.Calculate.calculations;
import static com.appiumTests.utitlities.Calculate.theResult;

public class CalculatorTest extends BaseTest {

	static File apk_file;
	static String expectedResult;
public static String operator;

	public  static void main(String [] args) throws MalformedURLException, InterruptedException {

		apk_file = new File("src/test/resources/Calculator_8.4.1_520193683_Apkpure.apk");
		logging().info("the apk file: " + apk_file.exists());

			appiumServiceBuilder(Properties.appiumServerBaseUrl, Properties.portNumber, Properties.appiumServerRemotePath, capabilities());

			appiumServerUrl(Properties.appiumServerBaseUrl, Properties.portNumber, Properties.appiumServerRemotePath);

			Thread.sleep(5000);

		substrate();
		addition();
		multiple();
		division();

	}
	public static void substrate() throws InterruptedException {
			//driver = new AppiumDriver<>(appiumServerUrl, capabilities);
		expectedResult = "2";
			operator ="com.google.android.calculator:id/op_sub";
			calculations(operator);

		String actualResult = theResult;
		logging().info("Total sum " + actualResult);
		if (actualResult.equals(expectedResult)) {
			logging().info("Results is as expected");
		} else {
			logging().info("Results wrong");
		}
		Assert.assertEquals(actualResult, expectedResult);
		Thread.sleep(3000);
		//appiumDriver.quit();
		// }
	}

	public static void addition() throws InterruptedException {

		expectedResult = "12";
		operator ="com.google.android.calculator:id/op_add";
		calculations(operator);

		String actualResult = theResult;
		logging().info("Total sum " + actualResult);
		if (actualResult.equals(expectedResult)) {
			logging().info("Results is as expected");
		} else {
			logging().info("Results wrong");
		}
		Assert.assertEquals(actualResult, expectedResult);
		Thread.sleep(3000);
		//appiumDriver.quit();
		// }
	}

	public static void multiple() throws InterruptedException {
		expectedResult = "35";
		operator ="com.google.android.calculator:id/op_mul";
		calculations(operator);

		String actualResult = theResult;
		logging().info("Total sum " + actualResult);
		if (actualResult.equals(expectedResult)) {
			logging().info("Results is as expected");
		} else {
			logging().info("Results wrong");
		}
		Assert.assertEquals(actualResult, expectedResult);
		Thread.sleep(3000);
		//appiumDriver.quit();
		// }

	}

	public static void division() throws InterruptedException {
		expectedResult = "1.4";
		operator ="com.google.android.calculator:id/op_div";
		calculations(operator);

		String actualResult = theResult;
		logging().info("Total sum " + actualResult);
		if (actualResult.equals(expectedResult)) {
			logging().info("Results is as expected");
		} else {
			logging().info("Results wrong");
		}
		Assert.assertEquals(actualResult, expectedResult);
		Thread.sleep(3000);
		//appiumDriver.quit();
		// }
	}

}
