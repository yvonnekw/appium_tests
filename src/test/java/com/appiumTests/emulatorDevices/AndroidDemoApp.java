package com.appiumTests.emulatorDevices;

import com.appiumTests.BaseTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Collections;
import java.util.concurrent.TimeUnit;





public class AndroidDemoApp extends BaseTest {
    AndroidDriver androidDriver;
    static String app = "/src/test/resources/Android-NativeDemoApp-0.4.0.apk";
    static String appPackage = "com.wdiodemoapp";
    static String appActivity = "com.wdiodemoapp.MainActivity";

   // public static AppiumDriver<MobileElement> appiumDriver;


    @Test
    public void successFullyLogin() throws InterruptedException {

        androidDriver = (getAndroidDriverOptions(app, appPackage, appActivity));

        Thread.sleep(3000);

        //androidDriver.manage().timeouts().implicitlyWait(3L, TimeUnit.SECONDS);

        androidDriver.findElement(AppiumBy.accessibilityId("Login")).click();

        androidDriver.manage().timeouts().implicitlyWait(2L, TimeUnit.SECONDS);

        WebElement emailField = androidDriver.findElement(AppiumBy.xpath("//android.widget.EditText[@content-desc='input-email']"));
        emailField.sendKeys("eve@gmail.com");

        WebElement passwordField = androidDriver.findElement(AppiumBy.xpath("//android.widget.EditText[@content-desc='input-password']"));
        passwordField.sendKeys("mypassword");

        //tap(passwordField);
        SwipeOrScroll();

        WebElement loginButton = androidDriver.findElement(AppiumBy.accessibilityId("button-LOGIN"));
        loginButton.click();

         WebElement successTitle =androidDriver.findElement(AppiumBy.id("android:id/alertTitle"));
         logging().info("Successfully logged in title " + successTitle.getText());

    }

    private void SwipeOrScroll(){

        Dimension size = androidDriver.manage().window().getSize();
        int startX = size.getWidth() / 2;
        int startY = size.getHeight() / 2;
        int endY = (int) (size.getHeight() * 0.25);
        int endX = startX;
        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Sequence sequence = new Sequence(finger1, 1)
                .addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
                .addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger1, Duration.ofMillis(200)))
                .addAction(finger1.createPointerMove(Duration.ofMillis(100), PointerInput.Origin.viewport(), endX, endY))
                .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

                androidDriver.perform(Collections.singletonList(sequence));


    }

    private void tap(WebElement element){
        Point location = element.getLocation();
        Dimension size = element.getSize();

        Point centerOfElement = getCenterOfElement(location, size);

        logging().info("Center of element " + centerOfElement);

        PointerInput finger1 =  new PointerInput(PointerInput.Kind.TOUCH, "findger1");
        Sequence sequence = new Sequence(finger1, 1)
                .addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), centerOfElement))
                .addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger1, Duration.ofMillis(200)))
                .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        androidDriver.perform(Collections.singletonList(sequence));

    }

        private Point getCenterOfElement(Point location,  Dimension size){
            return new Point(location.getX()  + size.getWidth()/2,
                    location.getY() + size.getHeight()/2);
        }


        //androidDriver.findElement(AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains('LOGIN').instance(0))")).click(); //scroll down to the element and click

        // 1. lauch the target app
       // AppiumDriver<MobileElement> appiumDriver = getAppiumDriverCapabilities(app, appPackage, appActivity);
        //AppiumDriver<MobileElement> appiumDriver = getAppiumDriverCapabilities(app, appPackage, appActivity);

        //Point centerOfElement =


        //appiumDriver.zoomOut
        // click on login label
        //MobileElement loginLabel = appiumDriver.findElementByAccessibilityId("Login");
       // loginLabel.click();

       // appiumDriver.manage().timeouts().implicitlyWait(2L, TimeUnit.SECONDS);

        //input  username
       // MobileElement emailField = appiumDriver.findElementByXPath("//android.widget.EditText[@content-desc='input-email']");
      //  emailField.sendKeys("eve@gmail.com");
        //inout password
      //  MobileElement passwordField = appiumDriver.findElementByXPath("//android.widget.EditText[@content-desc='input-password']");
      //  passwordField.sendKeys("mypassword");

      //  PointerInput finder1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
       // Sequence sequence = new Sequence(finder1, 1)
                //.addAction(finder1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), 4));

       /// appiumDriver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
       // AndroidUIAutomator("new UiSelector().textContains('button-LOGIN')");
        //click on login button

       //MobileElement loginButton = appiumDriver.findElementByXPath("//android.view.ViewGroup[@content-desc='button-LOGIN']");
       // MobileElement loginButton = appiumDriver.findElementByAccessibilityId("button-LOGIN");
       // loginButton.click();

        //findElementByAndroidUIAutomator
       // AndroidDriver androidDriver = new AndroidDriver(getAndroidDriverCapabilities(app, appPackage, appActivity));
       // androidDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains('LOGIN').instance(0))").click(); //scroll down to the element and click

       // AppiumDriver<MobileElement> appiumDriver2 = getAndroidDriverMobileCapabilities(app, appPackage, appActivity);
     //   scrollToAnElementByText(appiumDriver, "LOGIN");
      // MobileElement loginButton = appiumDriver.findElementByAccessibilityId("button-LOGIN");
       //  loginButton.click();

        // 6. get the titile

       /// MobileElement successTitle = appiumDriver.findElementById("android:id/alertTitle");
       // logging().info("Successfully logged in title " + successTitle.getText());




}
