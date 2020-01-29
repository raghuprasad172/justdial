package com.jd.genericlib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchLib {
	
	/**
	 * 
	 * @param driver
	 * @param element
	 * @param text
	 * @throws InterruptedException
	 */
	
	 public  void searchByTap(WebDriver driver ,String element,String text) throws InterruptedException {
    	 String tap = "//android.widget.TextView[@text='"+element+"']";
    	 driver.findElement(By.xpath(tap)).click();
    	    	String[] ar = text.split(";");
    	      	for (int i = 0; i < ar.length; i++) {
    	    	String tap1 = "//android.widget.TextView[@text='"+ar[i]+"']";
    	    	Thread.sleep(4000);
    	    	driver.findElement(By.xpath(tap1)).click();
    	    	
                  }
    	     	WebElement companyName = driver.findElement(By.xpath("(//android.widget.TextView[@resource-id='com.justdial.search:id/comp_name'])[1]"));
    	    	System.out.println(companyName.getText());
  
    	  }
	 
	 /**
	  * 
	  * @param driver
	  * @param text1
	  * @throws InterruptedException
	  */
//     public  void searchByText(WebDriver driver, String text1) throws InterruptedException {
//    	String search = "//android.widget.MultiAutoCompleteTextView[@resource-id='com.justdial.search:id/search_edit_text_home']";
//    	driver.findElement(By.xpath(search)).click();
//    	Thread.sleep(2000);
//    	driver.findElement(By.xpath("//android.widget.MultiAutoCompleteTextView[@resource-id='com.justdial.search:id/search_edit_text']")).sendKeys("Qsp");
//    	
// 
//     }
     /**
      * 
      * @param driver
      * @throws InterruptedException
      */
     public void clickOnNoThanks(WebDriver driver) throws InterruptedException {
         Thread.sleep(5000);
         driver.findElement(By.xpath("//android.widget.Button[@text='No thanks']")).click();
         Thread.sleep(2000);
     }
     
     String filePaath = "";
     public void getExcelData(String sheetNAme , int rowNum, int celNum) {
    	  
     }
     
     public void searchAndGetFirstElement(WebDriver driver, String text) {
    	 String search = "//android.widget.MultiAutoCompleteTextView[@resource-id='com.justdial.search:id/search_edit_text_home']";
    	 WebElement search1 = driver.findElement(By.xpath(search));
    	
     }

}
