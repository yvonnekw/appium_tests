package com.appiumTests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

import java.io.File;
import java.net.URL;
import java.time.Duration;
import java.util.logging.Logger;

import static com.appiumTests.utilities.Properties.*;

public class BaseTest {

   private static Logger  logger = Logger.getLogger("logInfo");
    static AppiumDriverLocalService service = null;

   public static URL appiumServerUrl;
    public static Logger logging(){
        return logger;
    }


    /*public static DesiredCapabilities capabilities(){
        DesiredCapabilities capabilities = getCapabilities();
        return capabilities;
    }*/
/*
    public static AppiumDriver<MobileElement> getAppiumDriverCapabilities(String app, String appPackage, String appActivity) {
        AppiumDriver<MobileElement> appiumDriver = null;
        try {
            DesiredCapabilities capabilities = getCapabilities(app, appPackage, appActivity);
            AppiumDriverLocalService appiumS = appiumServiceBuilder( appiumServerBaseUrl,  portNumber, appiumServerRemotePath, capabilities);
            appiumDriver = new AppiumDriver<>(appiumS, capabilities);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return appiumDriver;
    }

    public static AndroidDriver<MobileElement> getAndroidDriverCapabilities(String app, String appPackage, String appActivity) {
        AndroidDriver<MobileElement> androidDriver = null;
        try {
            DesiredCapabilities capabilities = getCapabilities(app, appPackage, appActivity);
            AppiumDriverLocalService appiumS = appiumServiceBuilder( appiumServerBaseUrl,  portNumber, appiumServerRemotePath, capabilities);
            androidDriver = new AndroidDriver<>(appiumS, capabilities);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return androidDriver;
    }

    public static AndroidDriver<MobileElement> getAndroidDriverMobileCapabilities(String app, String appPackage, String appActivity) {
        AndroidDriver<MobileElement> androidDriver = null;
        try {
            DesiredCapabilities capabilities = getCapabilities(app, appPackage, appActivity);
            AppiumDriverLocalService appiumS = appiumServiceBuilder( appiumServerBaseUrl,  portNumber, appiumServerRemotePath, capabilities);
            androidDriver = new AndroidDriver<>(appiumS, capabilities);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return androidDriver;
    }*/

    /*
    private static DesiredCapabilities getCapabilities(String app, String appPackage, String appActivity) {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityTypeExtend.PLATFORM_VERSION, "34");
        capabilities.setCapability(MobileCapabilityTypeExtend.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityTypeExtend.DEVICE_NAME, "Nexus_One_API_34");
        capabilities.setCapability(MobileCapabilityTypeExtend.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability(MobileCapabilityTypeExtend.APP, app);
        capabilities.setCapability("avd", "Nexus_One_API_34");
        capabilities.setCapability(MobileCapabilityTypeExtend.APP_PACKAGE, appPackage);
        capabilities.setCapability(MobileCapabilityTypeExtend.APP_ACTIVITY, appActivity);
        capabilities.setCapability(MobileCapabilityTypeExtend.NEW_COMMAND_TIMEOUT, 60);
       // capabilities.setCapability("avd", "Nexus_One_API_34");

        return capabilities;
    }*/

    protected UiAutomator2Options getUiAutomator2Options(String app, String appPackage, String appActivity) {
        UiAutomator2Options  uiAutomator2Options = new  UiAutomator2Options();
        uiAutomator2Options.setPlatformVersion("34");
        uiAutomator2Options.setPlatformName(AutomationName.ANDROID_UIAUTOMATOR2);
        uiAutomator2Options.setDeviceName("Nexus_One_API_34");
       // uiAutomator2Options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
        uiAutomator2Options.setApp(System.getProperty("user.dir")+(app));
        uiAutomator2Options.setAvd("Nexus_One_API_34");
        uiAutomator2Options.setAppPackage(appPackage);
        uiAutomator2Options.setAppActivity(appActivity);
        uiAutomator2Options.setNewCommandTimeout(Duration.ofSeconds(60));
        return uiAutomator2Options;
    }

    public AndroidDriver getAndroidDriverOptions(String app, String appPackage, String appActivity) {
        AndroidDriver androidDriver = null;
        try {
            UiAutomator2Options  uiAutomator2Options = getUiAutomator2Options(app, appPackage, appActivity);
            AppiumDriverLocalService appiumServiceBuilder = appiumServiceBuilder( appiumServerBaseUrl,  portNumber, appiumServerRemotePath, uiAutomator2Options);
            androidDriver = new AndroidDriver(appiumServiceBuilder, uiAutomator2Options);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return androidDriver;
    }

    protected XCUITestOptions getXCUITestOptions(String app) {
        XCUITestOptions xcuiTestOptions = new XCUITestOptions();
        xcuiTestOptions.setDeviceName("iPhone 15 Pro");
        xcuiTestOptions.setApp(System.getProperty(app));
        xcuiTestOptions.setPlatformVersion("17.0");
        xcuiTestOptions.setNewCommandTimeout(Duration.ofSeconds(60));
        return xcuiTestOptions;
    }

    public IOSDriver getIOSDriverOptions(String app) {
        IOSDriver iOSDriver = null;
        try {
            XCUITestOptions  xCUITestOptions = getXCUITestOptions(app);
            AppiumDriverLocalService appiumServiceBuilder = appiumServiceBuilderIOS( appiumServerBaseUrl,  portNumber, appiumServerRemotePath, xCUITestOptions);
            iOSDriver = new IOSDriver(appiumServiceBuilder, xCUITestOptions);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return iOSDriver;
    }

    //TODO make this reusable for both IOS and Android
    public  AppiumDriverLocalService appiumServiceBuilderIOS(String appiumServerBaseUrl, int portNumber, String appiumServerRemotePath, XCUITestOptions xcuiTestOptions){
        AppiumServiceBuilder builder;
        service = AppiumDriverLocalService.buildDefaultService();
        builder = new AppiumServiceBuilder().withLogFile(new File("appium_" + "className" + ".log"));
        builder.withIPAddress(appiumServerBaseUrl);
        builder.usingPort(portNumber);
        builder.withCapabilities(xcuiTestOptions);
        builder.withArgument(GeneralServerFlag.SESSION_OVERRIDE);
        builder.withArgument(GeneralServerFlag.LOG_LEVEL, "getAppiumLogLevel()");
        builder.withArgument(GeneralServerFlag.RELAXED_SECURITY);
        builder.withArgument(GeneralServerFlag.LOG_NO_COLORS);
        builder.withArgument(GeneralServerFlag.CALLBACK_PORT, Integer.toString(portNumber));
        builder.withArgument(GeneralServerFlag.LOG_TIMESTAMP);
        builder.withArgument(GeneralServerFlag.LOCAL_TIMEZONE);
        builder = new AppiumServiceBuilder().withArgument(() -> "--base-path", appiumServerRemotePath);
        service = AppiumDriverLocalService.buildService(builder);
        service.start();

        return service;
    }
    public  AppiumDriverLocalService appiumServiceBuilder(String appiumServerBaseUrl, int portNumber, String appiumServerRemotePath, UiAutomator2Options uiAutomator2Options){
        AppiumServiceBuilder builder;
        service = AppiumDriverLocalService.buildDefaultService();
            builder = new AppiumServiceBuilder().withLogFile(new File("appium_" + "className" + ".log"));
            builder.withIPAddress(appiumServerBaseUrl);
            builder.usingPort(portNumber);
            builder.withCapabilities(uiAutomator2Options);
            builder.withArgument(GeneralServerFlag.SESSION_OVERRIDE);
            builder.withArgument(GeneralServerFlag.LOG_LEVEL, "getAppiumLogLevel()");
            builder.withArgument(GeneralServerFlag.RELAXED_SECURITY);
            builder.withArgument(GeneralServerFlag.LOG_NO_COLORS);
            builder.withArgument(GeneralServerFlag.CALLBACK_PORT, Integer.toString(portNumber));
            builder.withArgument(GeneralServerFlag.LOG_TIMESTAMP);
            builder.withArgument(GeneralServerFlag.LOCAL_TIMEZONE);;
            builder = new AppiumServiceBuilder().withArgument(() -> "--base-path", appiumServerRemotePath);
            service = AppiumDriverLocalService.buildService(builder);
            service.start();

            return service;
    }

}
