package com.example.service;

public class Maths {
	
	public int sum(int a,int b)
	{
		return a+b;
	}
	
	
	public int square(int m)
	{
		if(m<0)
		{
			throw new IllegalArgumentException();
		}
		return m*m;
	}

}
