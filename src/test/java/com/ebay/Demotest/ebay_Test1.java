package com.ebay.Demotest;



import org.junit.Test;


import com.ebay.Base.*;
import com.ebay.Page.*;


public class ebay_Test1  extends Base{
	
	
	
	@Test
	
    public void ebaySearch() throws InterruptedException
    {
		
        EbaySearchPage ebaySearchPage = new EbaySearchPage();
		
        ebaySearchPage.ebay_buyselecteditem();
        	
        

    }
	
}


	
        

  