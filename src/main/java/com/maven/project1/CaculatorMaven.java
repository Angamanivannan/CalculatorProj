package com.maven.project1;

public class CaculatorMaven {

		int c;
		int d;
		int z;
		int xyz;
		
		
		public static  Integer add(Integer x ,Integer y) {
			   if (x == null || y == null) {
				   return null;
				   
			   }
		return x + y;
			
		}
	    public static Integer sub(Integer x,Integer y)
	    {
	    	if (x == null || y == null) {
				   return null;
				   
			   }
		return x - y;
	    	
	     }
	    public static Integer mul(Integer x,Integer y)
	    {
	    	if (x == null || y == null) {
				   return null;
				   
			   }
		return x * y;
	    	
	     }
	    public static Integer div(Integer x,Integer y)
	    {
	    	if (x == null || y == null) {
				   return null;
				   
			   }
		return x/y;
	    	
	     }
	}


