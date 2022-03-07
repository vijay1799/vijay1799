package org.TestNGex;

import org.testng.annotations.Test;

public class GroupingtestNG {
@Test(groups={"smoke","UAT"})
public void method1() {
	System.out.println("test1");
}
@Test(groups={"smoke","UAT","system"})
public void method2() {
	System.out.println("test2");
}
@Test(groups={"system"})
public void method3() {
	System.out.println("test3");
}
@Test(groups={"smoke"})
public void method4() {
	System.out.println("test4");
}
@Test(groups={"smoke"})
public void method5() {
	System.out.println("test5");
}
}
