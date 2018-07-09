package com.ebay.Base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Base {
	
	public  static AppiumDriver driver;
	static DesiredCapabilities caps;
    String serverIp="0.0.0.0";
    String appiumPort="4723";

    @BeforeClass
    
    public static void setup(){
    	
        initDriver();
    }

    public  AppiumDriver getDriver() {
        return driver;
    }

    public static void  initDriver()  {
        caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
        caps.setCapability("AUTOMATION_NAME",AutomationName.ANDROID_UIAUTOMATOR2);
        caps.setCapability(MobileCapabilityType.APP,
                System.getProperty("user.dir") + "/eBay.apk");
        String serverUrl = "http://0.0.0.0:4723/wd/hub";


        try
        {
            System.out.println("Argument to driver object : " + serverUrl);
            driver = new AndroidDriver(new URL(serverUrl), caps);

        }
        catch (NullPointerException | MalformedURLException ex) {
            throw new RuntimeException("appium driver could not be initialised for device ");
        }
        System.out.println("Driver in initdriver is : "+driver);

     
    }
    @AfterClass
    public static void tearDown() {

        driver.quit();
    }
}
