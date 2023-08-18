package com.basic.pkg;

public class tax {
	double taxcal() {
		
	
	double tax=0;
	double salary=1550000;
	


if(salary>=1000001)
{
	tax=(250001*5/100)+(500001)*10/100+(salary-1000001)*15/100;
}
System.out.println(tax);
return tax;
	}
	
	
	double newtaxcal()
	{
		double tax=0;
		double salary=1550000;
	
	if(salary>=1500001)
	{
		tax=(300001*5/100)+(600001)*10/100+(900001)*15/100+(1200001*20/100)+(salary-1500001*25/100);
	}
	System.out.println(tax);
	return tax;
		}
	
	
	double newtax()
	{
		double tax=0;
		double salary=1524520;
	
	if(salary>=1500001)
	{
		tax=(250001*5/100)+(500001)*10/100+(750001)*15/100+(1000001)*20/100+(1250001)*25/100+(1500001)*30/100;
	}
	System.out.println(tax);
	return tax;
		}
	
	
	
	public static void main(String[] args) {
		
	tax cal=new tax();
	cal.taxcal();
	cal.newtaxcal();
	cal.newtax();
	}

}
