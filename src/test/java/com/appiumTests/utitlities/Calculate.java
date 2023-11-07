package com.appiumTests.utitlities;

import com.appiumTests.BaseTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Calculate extends BaseTest {

    static String  seven = "com.google.android.calculator:id/digit_7";
    static String five = "com.google.android.calculator:id/digit_5";
    static String equal = "com.google.android.calculator:id/eq";
    static String textView = "com.google.android.calculator:id/eq";

   // static String five = "com.google.android.calculator:id/digit_5";
   // operator = appiumDriver(capabilities()).findElementById("com.google.android.calculator:id/op_sub");
    static WebElement manus;
    static WebElement add;
    static WebElement mul;
    static WebElement div;
    static WebElement theSum;

   // @FindBy(id = "com.google.android.calculator:id/digit_7")
    public static WebElement numberSevenElement;

    public static WebElement theOperatorElement;

    //@FindBy(id = "com.google.android.calculator:id/digit_5")
    public static WebElement numberFiveElement;

    //@FindBy(id = "com.google.android.calculator:id/eq")
    public static WebElement equalToElement;

    //@FindBy(id = "com.google.android.calculator:id/")
    public static WebElement textViewElement;

   static AppiumDriver<MobileElement> appiumDriver = null;

    public static String theResult;
    public static WebElement numberSeven(){
        return numberFiveElement;
    }

   // (
    static DesiredCapabilities capabilities;
    public static String calculations(String operator){

        try{
            appiumDriver = new AppiumDriver<>(appiumServerUrl, capabilities());
            numberSevenElement = appiumDriver.findElementById(seven);
            numberSevenElement.click();
        theOperatorElement = appiumDriver.findElementById(operator);
            theOperatorElement.click();
        numberFiveElement = appiumDriver.findElementById(five);
            numberFiveElement.click();
        equalToElement = appiumDriver.findElementById(equal);
            equalToElement.click();
        textViewElement = appiumDriver.findElementByClassName("android.widget.TextView");

       // String whichOpe = operator;
        //if (whichOpe.equals("-")) {
             theResult = textViewElement.getText();
            logging().info("Total sum " + theResult);


            /*
            if (theResult.equals("2")) {
                logging().info("Results is as expected");
            } else {
                logging().info("Results wrong");
            }
            Assert.assertEquals("2", theResult);
            Thread.sleep(3000);
            appiumDriver.quit();*/
       // }
    }
			catch (Exception e){
        e.printStackTrace();
    }
        return theResult;
   }
}
