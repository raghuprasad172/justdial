package test;

import org.testng.annotations.Test;

import com.jd.genericlib.BaseClass;
import com.jd.genericlib.SearchLib;

public class JDSearchTest extends BaseClass{

	@Test
     public void searchTest() throws Exception
     { 
		 /* search criteria */
		  String menu = "B2b";
		  String queryPath = "Electronics & Electrical Supplies;Batteries & Charge Storage Devices;Batteries Inverters UPS Stabilisers & Transformers;Automobile Battery;Acdelco;";
		  //String queryPath = "Industrial Machinery & Equipments;CNC Machines Lathes Tools & services;CNC Job Works;CNC Bending Job Works";
		  //String queryPath ="Construction Machinery & Supplies;Bathroom Hardware & Fittings;Bath Tub;Artize;\r\n";
			  
         /*Search by BRUDCRUM */
         lib.searchByTap(driver,menu,queryPath);
             
     }
     
    
     
    
}

    	

     


