package com.maven.project1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalMul {
	@Test
	public void testSub() {
		System.out.println("Multiplication");
		Integer x =2;
		Integer y =5;
		Integer expResult =10;
		Integer result = CaculatorMaven.mul(x,y);
		assertEquals(expResult,result);
		assertEquals(null,CaculatorMaven.mul(15,null));
		assertEquals(null,CaculatorMaven.mul(null,15));
		assertEquals(null,CaculatorMaven.mul(null,null));

}
}
