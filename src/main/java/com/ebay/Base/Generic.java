
package com.ebay.Base;


import java.io.IOException;
import java.io.InputStream;


import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;




import com.ebay.Page.*;


public class Generic  extends Base{
	 
	   
	
	    
	   
		private static String Dataobtained = null;

		/*public String fetchExcelData(String columnName) {
	    	Integer columnNumber = 0;
	    	Boolean columnNumberFound = false;
	    	InputStream inputStream = Generic.class.getClassLoader().getResourceAsStream("TestData.xls");
	    	
	    	HSSFWorkbook workbook = null;		
			
			try {
				workbook = new HSSFWorkbook(inputStream);
			} catch (IOException e) {

			}
			
			HSSFSheet hssfSheet = null;
			hssfSheet = workbook.getSheetAt(1);
			
			Integer totalRows = hssfSheet.getLastRowNum();
			//System.out.println(totalRows+"totalRows");
	            System.out.println("hssfSheet" +hssfSheet);
	      		HSSFRow hssfRow = hssfSheet.getRow(totalRows);
	    		Integer totalColumns = (int) hssfRow.getLastCellNum();
	    		//System.out.println(totalColumns+"totalColumns");
	    		
	    		for(int i=1; i<totalColumns; i++) {
	    			System.out.println(hssfRow.getCell(i).toString());
	    			if(hssfRow.getCell(i).toString().equalsIgnoreCase(columnName)) {
	    				columnNumber = i;
	    				columnNumberFound  = true;	
	    				 Dataobtained=hssfRow.getCell(columnNumber).toString();
	    				break;
	    			}
	    			
	    		
	    		
				
	    	}
	    		System.out.println(Dataobtained);
	    		return hssfRow.getCell(columnNumber+1).toString();
		}
*/
		public String fetchExcelData(String columnName) {
			/*
			 * Open the Data Sheet based upon the environment and module
			 */
			
			
			
			Integer rowNumber = 2;
			Integer columnNumber = 0;
			String excelWorkbookName = "TestData";
			String excelSheetName = "Ebay";

			InputStream inputStream = Generic.class.getClassLoader().getResourceAsStream("TestData.xls");

			HSSFWorkbook workbook = null;		
			
			try {
				workbook = new HSSFWorkbook(inputStream);
			} catch (IOException e) {

			}
			//System.out.println("excelSheetName" +excelSheetName);
			//System.out.println("excelWorkbookName" +excelWorkbookName);
			HSSFSheet hssfSheet = null;
			for(int i=0; i<workbook.getNumberOfSheets(); i++) {
				if(workbook.getSheetName(i).trim().equals(excelSheetName)) {
					hssfSheet = workbook.getSheetAt(i);
					break;
				}
			}
			System.out.println("hssfSheet" +hssfSheet);
			HSSFRow hssfRow = hssfSheet.getRow(0);
			Integer totalColumns = (int) hssfRow.getLastCellNum();
			Boolean columnNumberFound = false;
			for(int i=1; i<totalColumns; i++) {
				if(hssfRow.getCell(i).toString().equalsIgnoreCase(columnName)) {
					columnNumber = i;
					columnNumberFound = true;				
					break;
				}
			}		
			
			if(!columnNumberFound) {
				System.out.println("Column : " + columnName + " could not be found in excel");
			}
			hssfRow = hssfSheet.getRow(rowNumber-1);		
			if(hssfRow == null)
			{
				System.out.println("Row : " + rowNumber + " could not be found in excel");
			}		
			return hssfRow.getCell(columnNumber).toString();

		}
}




		
		
	