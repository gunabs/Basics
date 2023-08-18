package com.basic.pkg;

public class tax2 {
  
	public static void main(String[] args) {
		double salary=15000;
		double tax=0;
		if(salary>=10001)
		{
			tax=(2501*5/100)+(salary-5001)*10/100+(salary-10001)*15/100;
			System.out.print(tax);
		}
		
	}

}
