package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;


	public class Test2 {
		 public static AndroidDriver driver;
		 static String element = "B2b";
		static String text = "Electronics & Electrical Supplies;Batteries & Charge Storage Devices;Batteries Inverters UPS Stabilisers & Transformers;Automobile Battery;Acdelco;";
		static String text1 = "Qspiders";
	     public static void main(String[] args) throws Exception
	     {
	    	 DesiredCapabilities capabilities = new DesiredCapabilities();
	    	 capabilities.setCapability("platformName","Android");
	    	 capabilities.setCapability("platformVersion", "7.0");
	    	 capabilities.setCapability("deviceName","GIONEE A1");
	    	 capabilities.setCapability("appPackage","com.justdial.search");
	    	 capabilities.setCapability("appActivity","com.justdial.search.SplashScreenNewActivity");
	    	 capabilities.setCapability("noReset","true");
	    	 capabilities.setCapability("autoGrantPermissions","true");	 
	    	 driver = new AndroidDriver<WebElement>(new java.net.URL("http://127.0.0.1:4723/wd/hub"),capabilities);
	         
	         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	         Thread.sleep(8000);
	         driver.findElement(By.xpath("//android.widget.Button[@text='NO THANKS']")).click();
	         Thread.sleep(2000);
	   searchByTap(element,text);
	      //  searchByText1(text1);
	        //searchByText2(text1);

	                
	     }
	 
	     public static void searchByTap(String element,String text) {
	    	 try {
	    		 String tap = "//android.widget.TextView[@text='"+element+"']";
	    		 driver.findElement(By.xpath(tap)).click();
	    		 String[] ar = text.split(";");
	    		 for (int i = 0; i < ar.length; i++) {
	    			 String tap1 = "//android.widget.TextView[@text='"+ar[i]+"']";
	    			 Thread.sleep(2000);
	    			 driver.findElement(By.xpath(tap1)).click();

	    		 }

	    		 WebElement companyName = driver.findElement(By.xpath("(//android.widget.TextView[@resource-id='com.justdial.search:id/comp_name'])[1]"));
	    		 System.out.println(companyName.getText());
	    	 } catch (InterruptedException e) {
	    		 // TODO Auto-generated catch block
	    		 e.printStackTrace();
	    	 }
	     }
	     
	     
	   
		public static void searchByText1(String text1) throws InterruptedException {
	    	String search = "//android.widget.MultiAutoCompleteTextView[@resource-id='com.justdial.search:id/search_edit_text_home']";
	    	driver.findElement(By.xpath(search)).sendKeys(text1);
	    	String searchSuggestion = "//android.widget.ListView[@resource-id='com.justdial.search:id/recentList']/descendant::android.widget.RelativeLayout[@resource-id='com.justdial.search:id/auto_lin']";
	    	List one = driver.findElements(By.xpath(searchSuggestion));
	    	
		}
		public static void searchByText2(String text1) throws InterruptedException {
	    	String search = "//android.widget.MultiAutoCompleteTextView[@resource-id='com.justdial.search:id/search_edit_text_home']";
	    	driver.findElement(By.xpath(search)).sendKeys(text1);
	    	 Thread.sleep(2000);
	    	driver.pressKeyCode(AndroidKeyCode.KEYCODE_NUMPAD_ENTER);
	}
	}


