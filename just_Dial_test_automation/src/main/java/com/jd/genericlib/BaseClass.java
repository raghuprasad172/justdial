package com.jd.genericlib;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;

public class BaseClass {
	public  SearchLib lib = new SearchLib();
	 public AndroidDriver driver;
	@BeforeMethod
	public void configBM() throws MalformedURLException {
		 DesiredCapabilities capabilities = new DesiredCapabilities();
    	 capabilities.setCapability("platformName","Android");
    	 capabilities.setCapability("platformVersion", "6.0");
    	 capabilities.setCapability("deviceName","Micromax AQ4502");
    	 capabilities.setCapability("appPackage","com.justdial.search");
    	 capabilities.setCapability("appActivity","com.justdial.search.SplashScreenNewActivity");
    	 capabilities.setCapability("noReset","true");
    	 capabilities.setCapability("autoGrantPermissions","true");	 
    	 driver = new AndroidDriver<WebElement>(new java.net.URL("http://127.0.0.1:4723/wd/hub"),capabilities);
         
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         
         try {
        	 lib.clickOnNoThanks(driver);
         }catch (Exception e) {
			System.out.println("No Thanks ");
		}
	}

}
