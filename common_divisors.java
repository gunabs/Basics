package com.basic.pkg;

public class common_divisors {

	public static void main(String[] args) {
		int no1=100, no2=60;
		int div=30;
		while(div<=no2)
		{
			if(no1%div==0&&no2%div==0)
			{
				System.out.println(div);
				
			}
			
			div=div++;
		}

	
	}

}
