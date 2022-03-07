package org.excelfiles;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Printallstringdata {
public static void main(String[]args) {
	try {
		FileInputStream fis = new FileInputStream(".\\Excelfile\\testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s1 =wb.getSheet("logincrentaial");
		int numofrow =s1.getLastRowNum();
		for(int i =0;i<=numofrow ;i++) {
			Row r1 = s1.getRow(i);
				int numofcell	=s1.getLastRowNum();
				for(int j =0;j<numofcell;j++) {
					Cell c1 = r1.getCell(j);
					String stringdata =c1.getStringCellValue();
					System.out.println( stringdata);
				}
			System.out.println(" ");
			}
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	
	
}
}
