package com.basic.pkg;

public class factorial {
	int result=1;
	int factorial(int n)
	
	{
		
		
		for(int i=1;i<=5;i=i+1)
		{
			result=result*i;
		}
	System.out.print(result);
	 return result ;
	}


	public static void main(String[] args) 
	{
		
		
	factorial obj=new factorial();
	int v=obj.factorial(5);
	}
}
