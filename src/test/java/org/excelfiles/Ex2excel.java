package org.excelfiles;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex2excel {
public static void main(String[]args) {
	try {
		FileInputStream fis = new FileInputStream(".\\Excelfile\\testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s1 = wb.getSheet("logincrentaial");//ss sheet use
		int lastrownum = s1.getLastRowNum();
		System.out.println(lastrownum);
		int phyrownumm = s1.getPhysicalNumberOfRows();
		System.out.println(phyrownumm);
		Row r1 = s1.getRow(2);
		Cell c1 = r1.getCell(1);
		String cellvaluedata = c1.getStringCellValue();
		System.out.println(cellvaluedata);
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	
	
}
}
