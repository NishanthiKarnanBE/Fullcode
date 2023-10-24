package com.appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Calculation {

    public static AndroidDriver driver = null;

    //need to set desired capabilities
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("plaftformName", "Android");
        capabilities.setCapability("plaftformVersion", "13");
        //capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("packageName", "com.msm.epl");
        capabilities.setCapability("appActivity", "com.msm.epl.MainActivity");

        //another way to set the capabilities using 'mobilecapabilitytype' interface

      /*  capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
        capabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "sdk_gphone64_x86_64");*/

        //URL url = new URL("http://0.0.0.0:4723/wd/hub");

        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

        //driver = new AndroidDriver(url,capabilities);




    }
}
