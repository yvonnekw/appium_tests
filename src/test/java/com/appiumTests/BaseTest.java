package com.appiumTests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;
import java.net.URL;
import java.util.logging.Logger;

import static com.appiumTests.utitlities.Properties.*;

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

    private static DesiredCapabilities getCapabilities(String app, String appPackage, String appActivity) {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "34");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus_One_API_34");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.APP, app);
        capabilities.setCapability("avd", "Nexus_One_API_34");
        capabilities.setCapability("appPackage", appPackage);
        capabilities.setCapability("appActivity", appActivity);
        return capabilities;
    }

    public static AppiumDriverLocalService appiumServiceBuilder(String appiumServerBaseUrl, int portNumber, String appiumServerRemotePath, DesiredCapabilities capabilities){
        AppiumServiceBuilder builder;
        service = AppiumDriverLocalService.buildDefaultService();
            builder = new AppiumServiceBuilder().withLogFile(new File("appium_" + "className" + ".log"));
            builder.withIPAddress(appiumServerBaseUrl);
            builder.usingPort(portNumber);
            builder.withCapabilities(capabilities);
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
}
