package com.basic.pkg;

public class prime {
	
	
	
	public static void main(String[] arg)
	{
		prime pp=new prime();
		pp.find_prime(13);
		
	}

	
	void find_prime(int no)
	{
		int div=2; 
		int count=0;  
		while(div<=no/2)
		{
			
			
			if(no%div==0)
			{
			//	System.out.println(no+"not prime");
				count=count+1;
				
			}
			div=div+1;
			
		}
		if(count==0) {
			System.out.println(no+"is prime");
		}
			
		 
	if(count<=7)
	{
		no=no+1;
			find_prime(no);
	}

		}	
	
	
}
	