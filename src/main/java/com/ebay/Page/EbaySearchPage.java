package com.ebay.Page;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import com.ebay.Base.Generic;



import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;

import java.util.Map;

import junit.framework.Assert;
public class EbaySearchPage  extends Generic{
	

	public static Map<Object,Object> testMap;


	    

	    

	    public EbaySearchPage() {
	        super();
	    
	      
			}
	   

	
		public void ebay_buyselecteditem( ) throws InterruptedException  {
			
			
			Thread. sleep(10000);
			
			driver.findElement(Ebay_Search_Box).click();
	        Thread.sleep(5000);
	        System.out.println("Ebay Search Box is clicked");
			driver.findElement(Ebay_Search_Text).click();
			Thread. sleep(1000);
			 System.out.println("Ebay Text Box is clicked");
			 String Data=fetchExcelData("Item");
			
			 System.out.print(Data);
			 driver.findElement(Ebay_Search_Text).sendKeys(Data);
			 Thread.sleep(5000);
			 System.out.println("Entered the Ebay Text Box with a Keyword search "+Data);
			 driver.findElement(Eaby_Search_Item).click();
			 Thread.sleep(10000);
			
			 String ActualData=driver.findElement(Ebay_Selected_Item).getText();
			 System.out.print(ActualData);
			 driver.findElement(Ebay_Selected_Item).click();
			 System.out.println("Selected the search item is clicked");
			 Thread.sleep(5000);
			 
			
			 String ExpectedData=fetchExcelData("ItemDetail");
		        System.out.println(ExpectedData);
		      
		       if (ActualData.contains(ExpectedData))
		       {
		    	   System.out.println("Selected item is verified Suceesfully");
		       }
		        
		       else
		       {
		    	   System.out.println("Selected item is different from actual");
		       }

		       driver.findElement(Ebay_Buy_Now).click();
		        System.out.println("Buy now clicked");
		        
			 
		}




		By Ebay_Search_Box=By.id("com.ebay.mobile:id/search_box");
	    By Ebay_Search_Text=By.id("com.ebay.mobile:id/search_src_text");
	    By Eaby_Search_Item=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.RelativeLayout[1]/android.widget.TextView");
	    By EBay_Selection=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.support.v7.widget.RecyclerView");
	    By Ebay_Selected_Item=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.TextView[1]");
	    By Ebay_Selected_Item_Name=By.id("com.ebay.mobile:id/textview_item_name");
	    By Ebay_Buy_Now=By.xpath("//android.widget.Button[@content-desc=\"Buy It Now\"]");

			 
			
		
		}

