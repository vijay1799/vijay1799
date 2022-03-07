package org.excelfiles;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Printalltypedataforexcel {
public static void main(String[]args) {

		FileInputStream fis;
		try {
			fis = new FileInputStream(".\\Excelfile\\testdata.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s1 =wb.getSheet("userdetailss");
			 int numofrow = s1.getLastRowNum();
			for(int i=0;i<=numofrow;i++) {
				Row r1 = s1.getRow(i);
				int numpfcell = r1.getLastCellNum();
				for(int j=0;j<numpfcell ;j++) {
					Cell c1 =r1.getCell(j);
				System.out.println(c1.getCellType());	
					switch (c1.getCellType()) {
					case STRING:System.out.println(c1.getStringCellValue());
					break;
					case BOOLEAN:System.out.println(c1.getBooleanCellValue());
						break;
					
					case FORMULA:System.out.println(c1.getCachedFormulaResultType());
						break;
					case NUMERIC:if(DateUtil.isCellInternalDateFormatted(c1)) {
						SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy hh:ss:mm");
				       sdf.format(c1.getDateCellValue());}
				       else{System.out.println(c1.getNumericCellValue());
				       }
					}
					
						break;
					
					}
					
					
				}
				
				
				
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	
	
	
	
	
	
}
}
