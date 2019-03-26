package com.maven.project1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalSub {
	@Test
	public void testSub() {
		System.out.println("Subraction");
		Integer x =15;
		Integer y =10;
		Integer expResult =5;
		Integer result = CaculatorMaven.sub(x,y);
		assertEquals(expResult,result);
		assertEquals(null,CaculatorMaven.sub(15,null));
		assertEquals(null,CaculatorMaven.sub(null,15));
		assertEquals(null,CaculatorMaven.sub(null,null));

}
}