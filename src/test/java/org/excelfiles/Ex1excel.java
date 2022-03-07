package org.excelfiles;



import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex1excel {

	public static void main(String[] args)   {
		//String path = System.getProperty("user.dir");
		try {
			FileInputStream fis = new FileInputStream(".\\Excelfile\\testdata.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
	   	int nummberOfasheet = wb.getNumberOfSheets();  
		
			for(int i =0; i<=nummberOfasheet;i++) {
				System.out.println(wb.getSheetName(i));
			}
			
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}

	}

}
