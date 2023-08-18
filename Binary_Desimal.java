package com.basic.pkg;

public class Binary_Desimal {
	private void splite_digit(int binary)
	{
		int p=0;
		int desimal=0;
		while(binary>0)
		{
			int rem=binary%10;
			int result=rem*find_power(2,p);
			System.out.println(result);
			p=p+1;
			desimal=desimal+result;
			binary=binary/10;
		}
		System.out.println(desimal);
		}
		int find_power(int base,int power)
		{
		int no=1;
		while(power>0)
		{
			no=no*base;
				power=power-1;
				
		}
		System.out.println(no);
		return no;
		
	}

	public static void main(String[] args) {
		Binary_Desimal bd=new Binary_Desimal();
		bd.splite_digit(1111);

	}

}
