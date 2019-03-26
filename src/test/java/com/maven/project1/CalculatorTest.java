package com.maven.project1;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

		
			@Test
			public void testSum() {
				System.out.println("Addition");
				Integer x =15;
				Integer y =15;
				Integer expResult =30;
				Integer result = CaculatorMaven.add(x,y);
				assertEquals(expResult,result);
				assertEquals(null,CaculatorMaven.add(15,null));
				assertEquals(null,CaculatorMaven.add(null,15));
				assertEquals(null,CaculatorMaven.add(null,null));
				
			}
		}



