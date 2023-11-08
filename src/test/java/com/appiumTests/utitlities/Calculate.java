package com.appiumTests.utitlities;

import com.appiumTests.BaseTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;

public class Calculate extends BaseTest {

    static String  seven = "com.google.android.calculator:id/digit_7";
    static String five = "com.google.android.calculator:id/digit_5";
    static String equal = "com.google.android.calculator:id/eq";
    static String textView = "com.google.android.calculator:id/eq";

    static WebElement manus;
    static WebElement add;
    static WebElement mul;
    static WebElement div;
    static WebElement theSum;

    //@FindBy(id = "com.google.android.calculator:id/digit_7")
    public static MobileElement numberSevenElement;

    public static MobileElement theOperatorElement;

    public static MobileElement numberFiveElement;

    public static MobileElement equalToElement;

    public static MobileElement textViewElement;

   static AppiumDriver<MobileElement> appiumDriver = null;

    public static String theResult;
    public static WebElement numberSeven(){
        return numberFiveElement;
    }

   // (
    static DesiredCapabilities capabilities;
    public static String calculations(String operator, String app, String appPackage, String appActivity){
        AppiumDriver<MobileElement> appiumDriver;
        try{
           // appiumDriver = new AppiumDriver<>(appiumServerUrl, capabilities());
            appiumDriver = getAppiumDriverCapabilities(app, appPackage, appActivity);
            numberSevenElement = appiumDriver.findElementById(seven);
            numberSevenElement.click();
            theOperatorElement = appiumDriver.findElementById(operator);
            theOperatorElement.click();
            numberFiveElement = appiumDriver.findElementById(five);
            numberFiveElement.click();
            equalToElement = appiumDriver.findElementById(equal);
            equalToElement.click();
            textViewElement = appiumDriver.findElementByClassName("android.widget.TextView");
             theResult = textViewElement.getText();
            logging().info("Total sum " + theResult);

            }
        catch (Exception e){
            e.printStackTrace();
        }
        return theResult;
    }
}
