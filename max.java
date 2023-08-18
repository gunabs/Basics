package com.basic.pkg;

public class max {
	double taxcal() {
		
		
		double tax=0;
		double salary=15500;
	if((salary>=0)&&(salary<=2500))
	{
		
		tax=0;
	}
	if((salary>=2501)&&(salary<=5000))
	{
		
		
		tax=salary-2501*5/100;
			
	}
	if(salary>=5001&&salary<=10000)
	{
		tax=(2501*5/100)+(salary-5001)*15/100;
	}

	if(salary>=10001)
	{
		tax=(salary-2501*5/100)+(salary-5001)*10/100+(salary-10001)*15/100;
	}
	System.out.println(tax);
	return tax;
		}

	public static void main(String[] args) {
		max tax=new max();
		tax.taxcal();

	}

}
