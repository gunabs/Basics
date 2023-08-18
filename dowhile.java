package com.basic.pkg;

public class dowhile {
	public void find_gcd(int no1,int no2)
	{
		int div=2;
		int gcd=0;
		int small=no1<no2?no1:no2;
		while(div<=small)
		{
			if(no1%div==0&&no2%div==0)
			{
				gcd=div;
			}
			div++;
		}
		System.out.println("GCD:-"+gcd);
	}
	
public static void main(String[] arg) {
	
dowhile gcd=new dowhile();
gcd.find_gcd(60, 100);
}
}
