package com.ebay.Base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;


	public class Driver extends Base{

	    protected static AppiumDriver driver;

	    public Driver() {
	        this.driver = super.getDriver();
	    }

		
	}

