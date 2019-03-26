package com.maven.project1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalDiv {

	@Test
	public void testSub() {
		System.out.println("Division");
		Integer x =20;
		Integer y =10;
		Integer expResult =2;
		Integer result = CaculatorMaven.div(x,y);
		assertEquals(expResult,result);
		assertEquals(null,CaculatorMaven.div(15,null));
		assertEquals(null,CaculatorMaven.div(null,15));
		assertEquals(null,CaculatorMaven.div(null,null));

}
}
