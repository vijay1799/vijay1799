package org.TestNGex;

import org.testng.annotations.Test;

public class Ex1 {
@Test
public void test1() {
	System.out.println("test1");
	this.test2();
}
@Test
public void test2() {
	System.out.println("test2");
}
}
