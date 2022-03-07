package org.excelfiles;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Setdateformat {
public static void main(String []args) {
     Date dt = new Date();//give 24 hour format
     System.out.println(dt);
	SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy hh:ss:mm");//give 12 hour formate
	String date =sdf.format(dt);
	System.out.println(date);
}


}
