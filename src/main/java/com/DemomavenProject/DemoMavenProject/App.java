package com.DemomavenProject.DemoMavenProject;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class App {
	public static void main(String[] args) {
        // Set the desired capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Nexus 6P API 34");
        caps.setCapability("platformName", "Android");
        caps.setCapability("app", "C:\\Users\\ganesh.bhoge\\Downloads\\app-debug-v0.36.apk");

        // Initialize the Appium driver
        try {
            // Create a connection to the Appium server
            AppiumDriver<AndroidElement> driver = new AndroidDriver<>(
                new URL("http://127.0.0.1:4723/wd/hub"), // Appium server URL
                caps // Desired capabilities
            );

            // Your test automation code here
            // Example: Find an element by its ID and click it
            AndroidElement element = driver.findElementById("element_id");
            element.click();

            // Close the driver session when done
            driver.quit();
        } catch (Exception e) {
            // Handle exceptions, such as if the driver cannot be initialized
            e.printStackTrace();
        }
    }
  }

