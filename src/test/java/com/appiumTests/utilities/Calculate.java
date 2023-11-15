package com.appiumTests.utilities;

import com.appiumTests.BaseTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;


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

    //public AndroidElement numberSevenElement;

   // public static MobileElement theOperatorElement;

   // public static MobileElement numberFiveElement;

  //  public static MobileElement equalToElement;

  //  public static MobileElement textViewElement;

  // static AppiumDriver<MobileElement> appiumDriver = null;


    public String theResult;

    /*public static WebElement numberSeven(){
        return numberFiveElement;
    }*/



    public String calculations(String operator, String app, String appPackage, String appActivity){
        AndroidDriver androidDriver;
        try{
            androidDriver = (getAndroidDriverOptions(app, appPackage, appActivity));
            androidDriver.findElement(AppiumBy.id(seven)).click();

            androidDriver.findElement(AppiumBy.id(operator)).click();

            androidDriver.findElement(AppiumBy.id(five)).click();

            androidDriver.findElement(AppiumBy.id(equal)).click();
            //equalToElement.click();
            WebElement textViewElement = androidDriver.findElement(AppiumBy.className( "android.widget.TextView"));
             theResult = textViewElement.getText();
            logging().info("Total sum " + theResult);

            }
        catch (Exception e){
            e.printStackTrace();
        }
        return theResult;

    }



}
