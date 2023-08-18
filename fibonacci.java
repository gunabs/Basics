package com.basic.pkg;

public class fibonacci {

	private static final String Syst = null;

	public static void main(String[] args) {
		
fibonacci  fibo=new fibonacci();
fibo.print_fibo(0,1);

	}

	private void print_fibo(int first, int second) {
		int count=0;
		while(first<=13)
		{
						
		 System.out.println(first);
		
		 first=second+first;
		 second=first-second;
		
		 count=count+1;
			
						
		}
		
		

	}

}
