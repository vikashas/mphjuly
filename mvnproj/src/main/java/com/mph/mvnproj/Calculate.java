package com.mph.mvnproj;

public class Calculate {

	public int add(int... number)
	{
		int result=0;
		
		for(int i: number)
		{
			result =result+i;
		}
		
		return result;
	}
	
	public int multiply()
	{
		return 1;
	}
	
	public static void main(String[] args) {
		Calculate c = new Calculate();
		System.out.println(c.add(10,10));
		System.out.println(c.add(10,10,10));
		System.out.println(c.add(10,10,20,30));

	}

	public Object Multiply(int i, int j, int k) {
		
		return null;
		
	}

}