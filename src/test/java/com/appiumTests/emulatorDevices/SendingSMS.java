package com.appiumTests.emulatorDevices;

import java.net.MalformedURLException;


public class SendingSMS {

	//public static AppiumDriver<MobileElement> appiumDriver;
	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		/*

		String app = "src/test/resources/messenger-app-text-messages.apk";
		String appPackage = "com.google.android.permissioncontroller";
		String appActivity = "com.android.permissioncontroller.permission.ui.GrantPermissionsActivity";
		appiumDriver = getAppiumDriverCapabilities(app, appPackage, appActivity);
		appiumDriver.manage().timeouts().implicitlyWait(50L, TimeUnit.SECONDS);

		if (appiumDriver.findElementById("com.google.android.apps.messaging:id/start_chat_fab").isDisplayed()){
			appiumDriver.findElementById("com.google.android.apps.messaging:id/start_chat_fab").click();
			WebElement textView = appiumDriver.findElementById("com.google.android.apps.messaging:id/recipient_text_view");
			textView.sendKeys("07760171000", Keys.RETURN);
		}
		else {
			WebElement textView = appiumDriver.findElementById("com.google.android.apps.messaging:id/recipient_text_view");
			textView.sendKeys("07760171000", Keys.RETURN);
		}

		appiumDriver.manage().timeouts().implicitlyWait(1L, TimeUnit.SECONDS);

		appiumDriver.findElementById("com.google.android.apps.messaging:id/compose_message_text").sendKeys("Please, make me a cup of tea");
		Thread.sleep(3000);
		appiumDriver.findElementById("com.google.android.apps.messaging:id/send_message_button_icon").click();
		Thread.sleep(2000);
		String theText = appiumDriver.findElementById("com.google.android.apps.messaging:id/message_text").getText();
		
		String expected = ("Please, make me a cup of tea");
		
		if(expected.equals(theText)) {
			System.out.println("It works");
		}else {
			System.out.println("It fails");
		}
		
		Assert.assertEquals(expected, theText);
		
		Thread.sleep(2000);

		appiumDriver.quit();


	*/
	}

}
