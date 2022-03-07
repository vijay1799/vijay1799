package org.TestNGex;

import org.testng.annotations.Test;

public class Enableddisable {
	@Test(enabled=true)
	public void customername() {
		System.out.println("vijay patil");
		
	}
	 @Test(enabled=false)
	 public void customerid() {
		 System.out.println("13365");
	 }
	 @Test()
	 public void mobileno() {
		 System.out.println("3357975433");
		 
	}
	 @Test()
	 public void  Stidues() {
		System.out.println("BE"); 
		 
}
}